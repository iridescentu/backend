package com.dw.discord.controller;

import com.dw.discord.dto.BaseResponse;
import com.dw.discord.dto.BoardDto;
import com.dw.discord.enumstatus.ResultCode;
import com.dw.discord.model.Board;
import com.dw.discord.service.impl.BoardServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000",
        methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class BoardController {
    private final BoardServiceImpl boardServiceImpl;
    @Autowired
    public BoardController(BoardServiceImpl boardServiceImpl) {
        this.boardServiceImpl = boardServiceImpl;
    }

    @PostMapping("/api/board") // 게시판 글 올리는 method
    public ResponseEntity<BaseResponse<Void>> createBoard(@RequestBody @Valid BoardDto boardDto) {
        return new ResponseEntity<>( // return을 할 때는 <> 안의 타입을 쓰지 않아도 된다. 왜냐하면 위(line 27)에서 정의해 뒀기 때문에.
                boardServiceImpl.createBoard(boardDto),
                HttpStatus.CREATED);
    }

    @GetMapping("/api/board") // 게시글을 전부 받는 method
    public ResponseEntity<BaseResponse<List<Board>>> getAllBoard() {
        return new ResponseEntity<>(
                boardServiceImpl.getAllBoard(),
                HttpStatus.OK);
    }

    @DeleteMapping("/api/board/delete/{id}") // 게시글을 삭제하는 method
    public ResponseEntity<BaseResponse<Long>> deleteBoard(@PathVariable Long id) { // url로 받을 때는 @PathVariable을 사용한다.
        return new ResponseEntity<>(
                boardServiceImpl.deleteBoard(id),
                HttpStatus.OK);
    }

    @GetMapping("api/board/id") // 헤더를 이용해 요청 정보를 받는 법. 테스트용임.
    // 사용 방법: Postman에서 GET을 선택한 뒤 localhost:8080/api/board/id 이 주소를 넣고,
    // 아래의 Header 부분에서 X-LoginID를 Key 값에 넣은 뒤 Value 값에는 테스트해 보고 싶은 내용을 넣은 후 Send 버튼을 누르면 된다.
    public ResponseEntity<BaseResponse<Void>> getTest(@RequestHeader("X-LoginID") String id) {
        return new ResponseEntity<>(
                new BaseResponse<>(ResultCode.SUCCESS.name(),
                        null,
                        id),
                HttpStatus.OK);
    }
}
