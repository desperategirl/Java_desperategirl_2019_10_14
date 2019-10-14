package com.biz.exam.service;

public interface BBsViewService {
	
	public void setBBsList(List<BBsVO>);  // 문제해결 시나리오에 써진대로 했는데 왜 오류가 난지 모르겠다
	public void viewBBS();
	public void viewBBS(String subject);
	public void viewBBS(int sDate, int eDate);
	public void viewBBS(boolean sort);

}
