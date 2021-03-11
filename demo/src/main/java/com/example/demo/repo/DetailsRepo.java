package com.example.demo.repo;

import java.util.List;

import com.example.demo.dao.Details;

public interface DetailsRepo {
	
public List getAllDetails();

public void addDetails(Details det);
public void deleteDetails(int id);
public List findDetailsById(int id);
}
