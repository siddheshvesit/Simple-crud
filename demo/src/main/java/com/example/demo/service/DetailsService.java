package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.Details;

public interface DetailsService {
	public List getAllDetails();
	public  void addDetails(Details det);
	public void deleteDetails(int id);
	public List findDetailsById(int id);

}
