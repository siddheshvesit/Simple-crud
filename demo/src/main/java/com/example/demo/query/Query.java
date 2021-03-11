package com.example.demo.query;

import org.springframework.stereotype.Component;

@Component
public class Query {
	public String getAllDetails="select * from details";
	public String addDetails="insert into details (name) values(?);";
	public String deleteDetails="delete from  details where id=?;";
	public String finddetailsbyid="select * from details where id=?;";

}
