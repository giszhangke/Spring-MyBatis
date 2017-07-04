package top.giszk.domain;

import java.io.Serializable;

public class User implements Serializable {
	private String loginName;
	private String password;
	private String userName;
	
	public User() {
		super();
	}
	
	public User(String loginName, String password, String userName) {
		this.loginName = loginName;
		this.password = password;
		this.userName = userName;
	}
	
	public void setLoginName(String loginName) {
		// TODO Auto-generated method stub
		this.loginName = loginName;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return "loginName:" + loginName + "; password:" + password + "; userName:" + userName;
	}

}
