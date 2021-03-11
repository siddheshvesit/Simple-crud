package com.example.demo.dao;

public class Details {
	int Id;
	String Name;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int Id, String name) {
		super();
		this.Id = Id;
		Name = name;
	}
	@Override
	public String toString() {
		return "Details [Id=" + Id + ", Name=" + Name + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
