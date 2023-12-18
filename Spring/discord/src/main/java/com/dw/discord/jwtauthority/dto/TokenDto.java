package com.dw.discord.jwtauthority.dto;

// Token을 주고받을 때 TokenDto를 사용한다. (Token도 인코딩을 한 문자열이기 때문에 String을 사용한다.)
public class TokenDto {

	private String token;

	public TokenDto() {
		super();
	}

	public TokenDto(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
