package com.ssafy.board.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyAppSqlConfig {
	private static SqlSession session;
	//원래는 close해야 하는데 하나 만들어놓고 계속 갖다쓰자
	
	static {
		try {
			//myBatis 설정파일 가져올것
			String resource = "config/mybatisconfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			
			//builder를 가지고 있다가 팩토리로 뽑든지
			//sqlsession을 open 해서 만들든지
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			
			session = ssf.openSession(true); //true를 주면 자동으로 COMMIT
			
			System.out.println("세션 생성 성공");
			
			
		} catch (IOException e) {
			System.out.println("세션 생성 실패");
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		return session;
	}
}
