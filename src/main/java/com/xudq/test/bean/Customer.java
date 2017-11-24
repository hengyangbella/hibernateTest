package com.xudq.test.bean;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private int id;
	private String name;
	private int age;
	private String city;
	private String addr;

	private Set<Contacts> setContacts = new HashSet<Contacts>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Set<Contacts> getList() {
		return setContacts;
	}

	public void setList(Set<Contacts> setContacts) {
		this.setContacts = setContacts;
	}

}
