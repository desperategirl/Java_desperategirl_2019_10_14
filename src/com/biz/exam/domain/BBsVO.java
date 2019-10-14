package com.biz.exam.domain;

public class BBsVO {
	
	// 정보은닉 
	// 캡슐화
	
	private int seq; // 순번
	private double date; // 작성일자
	private String auth; // 작성자
	private String subject; // 제목
	private String text; // 내용
	private int count; // 조회수
	
	
	
	
	public BBsVO() { // super 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	public BBsVO(int seq, double date, String auth, String subject, String text, int count) { // field 생성자
		super();
		this.seq = seq;
		this.date = date;
		this.auth = auth;
		this.subject = subject;
		this.text = text;
		this.count = count;
	}
	@Override
	public String toString() { // toString
		return "BBsVO [seq=" + seq + ", date=" + date + ", auth=" + auth + ", subject=" + subject + ", text=" + text
				+ ", count=" + count + "]";
	}
	public int getSeq() {  // getter setter 
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public double getDate() {
		return date;
	}
	public void setDate(double date) {
		this.date = date;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	

}
