package com.dw.discord.dto;

// BaseResponse를 왜 쓸까?
// Backend가 Frontend에게 일종의 편의를 주기 위함으로 쓰임
// Backend에서 에러가 났을 때 Frontend가 Backend에서 온 에러를 못 알아보는 경우가 있기에
// 약속된 응답 형태를 만드는 것이 BaseResponse이다
// BaseResponse<T>에서 <T>를 Generic Method라고 한다
public class BaseResponse<T> {

	private String resultCode; // resultCode = 성공 or 실패
	private T data; // T = Type & data를 여기에 넣어서 보내겠다
	private String message; // message = 해 주고 싶은 말
	
	// 기본 생성자
	public BaseResponse() {
		super();
	}
	
	// 전체 생성자
	public BaseResponse(String resultCode, T data, String message) {
		super();
		this.resultCode = resultCode;
		this.data = data;
		this.message = message;
	}
	
	// Getters and Setters
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
