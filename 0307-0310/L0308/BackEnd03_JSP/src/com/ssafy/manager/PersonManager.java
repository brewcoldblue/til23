package com.ssafy.manager;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.dto.Person;

public class PersonManager {
	private List<Person> list = new ArrayList<>();
	private static PersonManager manager = new PersonManager();
	//사람 등록
	public void regist(Person p) {
		list.add(p);
	}
	//사람 목록 반환
	public List<Person> getAll() {
		return list;
	}
	private PersonManager() {} //싱글턴 패턴 만들기
	public static PersonManager getInstance() {
		return manager;
	}
	
}
