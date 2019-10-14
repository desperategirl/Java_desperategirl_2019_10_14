package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsService implements BBsReadService {

	
	
	public void readBBS(String bbsFile) throws IOException {

		bbsFile = "src/com/biz/exam/bbs.txt"; // 매개변수 bbsFile에 bbs.txt의 파일명을 담음

		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader(fileReader); // bbsFile(bbs.txt)를 읽을 준비

		String reader = new String(); // bbs 파일을 읽기 위한 문자열 형 변수 선언

		int lineNum = 0; 

		while (true) { // 무한반복으로 돌아가는 while 반복문

			System.out.println(++lineNum);

			reader = buffer.readLine();
			if (reader == null)
				break; // 문자열을 읽다가 아무것도 없는 값이 나오면 반복문을 빠져나와라

			String[] bbsList; // bbsList 문자열 형 배열 선언
			bbsList = reader.split(":"); // 문자열을 :(콜론)으로 쪼개 그 값을 bbsList에 담음
	
			
			  
		    BBsVO bbsVO = new BBsVO(); // BBs클래스로 bbsVO 변수 선언, BBsVO() 생성자로 초기화
		    
		    bbsVO.setSeq(Integer.valueOf(bbsList[0])); // Integer.valueOf method로 문자열형을 정수형으로 바꾸었음
		    bbsVO.setDate(Integer.valueOf(bbsList[1])); // double형을 Integer.valueOf로 바꿔도 되나?????
		    bbsVO.setAuth(bbsList[2]);
		    bbsVO.setSubject(bbsList[3]);
		    bbsVO.setText(bbsList[4]);
		    bbsVO.setCount(Integer.valueOf(bbsList[5]));
		    bbsList.add(bbsVO);
		    

		}

		buffer.close();
		fileReader.close(); // buffer와 fileReader를 닫아줌

	}

	public List<BBsVO> getBBsList() {
		return null;

	}

}
