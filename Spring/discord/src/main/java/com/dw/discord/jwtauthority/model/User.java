package com.dw.discord.jwtauthority.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "`user`")
public class User {
	@Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username", length = 50, unique = true)
    private String username; // 로그인 ID

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "nickname", length = 50)
    private String nickname;

    @Column(name = "activated")
    private boolean activated; // 비활성화 → ex) 밴드의 가입 신청 같은 기능. 가입 신청이 들어가면 admin만 가입 승인을 할 수 있다.
    
    @ManyToMany
    @JoinTable(
    name = "user_authority", // JoinTable의 이름 지정. 2 차 프로젝트에서 JoinTable은 최소 10 개부터 최대 20 개까지 만들게 될 것.
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")}, // user 입장에서 사용되는 id는 user_id(name = entity의 이름, referencedColumnName = 컬럼의 이름)
    inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")}) // user 입장의 반대쪽에서 사용되는 id는 authority_name
    private Set<Authority> authorities; // 이 Line의 authorities는 Line 37의 user_authority를 가리키는 것.

	public User() {
		super();
	}

	public User(Long userId, String username, String password, String nickname, boolean activated,
			Set<Authority> authorities) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.activated = activated;
		this.authorities = authorities;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}
    
}
