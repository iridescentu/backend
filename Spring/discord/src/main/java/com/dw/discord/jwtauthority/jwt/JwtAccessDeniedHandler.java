package com.dw.discord.jwtauthority.jwt;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler { // 뒤에 Handler가 붙은 것들은 exception들을 Handling하기 위해 만든 것.
   @Override
   public void handle(HttpServletRequest request, HttpServletResponse response, 
		   AccessDeniedException accessDeniedException) throws IOException {
      //필요한 권한이 없이 접근하려 할때 403 → ex) user가 admin 권한을 이용하려고 할 때.
      response.sendError(HttpServletResponse.SC_FORBIDDEN);
   }
}