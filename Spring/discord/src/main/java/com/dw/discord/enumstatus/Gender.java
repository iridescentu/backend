package com.dw.discord.enumstatus;

public enum Gender {
	MAN("남성"),
	WOMAN("여성");
	
	private final String desc;

	// enum은 기본 생성자가 굳이 필요 없기 때문에 전체 생성자만 만들어 줆
	private Gender(String desc) {
		this.desc = desc;
	}

	// enum이라 setter는 필요 없고 getter만 만들면 됨	
	public String getDesc() {
		return desc;
	}
	
}
