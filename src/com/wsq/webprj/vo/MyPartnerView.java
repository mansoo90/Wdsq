package com.wsq.webprj.vo;

public class MyPartnerView {
	private String member_mid;
	private String mypartners_mid;
	private String Email;
	private String native_language;
	
	public String getMember_mid() {
		return member_mid;
	}
	public void setMember_mid(String member_mid) {
		this.member_mid = member_mid;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNative_language() {
		return native_language;
	}
	public void setNative_language(String native_language) {
		this.native_language = native_language;
	}
	public String getLearning_language() {
		return learning_language;
	}
	public void setLearning_language(String learning_language) {
		this.learning_language = learning_language;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getMypartners_mid() {
		return mypartners_mid;
	}
	public void setMypartners_mid(String mypartners_mid) {
		this.mypartners_mid = mypartners_mid;
	}
	private String learning_language;
	private String regdate;
	
}
