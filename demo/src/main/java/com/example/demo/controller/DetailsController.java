package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Details;
import com.example.demo.query.Logger;
import com.example.demo.service.DetailsService;

@RestController
@RequestMapping(value="/home")
public class DetailsController {
@Autowired 	
 DetailsService detailservice;
 Logger logs=new Logger();
@RequestMapping(value="/getalldetails")
	public List  getAllDetails()
	{
	String methodname="details controller";
	logs.dolog(methodname);
		List abc= detailservice.getAllDetails();
		// System.out.println(detailservice.getAllDetails());
		 return abc;
		
	}
@RequestMapping(value="/addetails")
	public void addDetails(@RequestBody Details det)
	{
		String methodname="details controller";
		logs.dolog(methodname);
		System.out.println(det);
		detailservice.addDetails(det);
	}
@RequestMapping(value="/deletedetails/{id}")
	public void deleteDetails(@PathVariable ("id")int id)
	{
		String methodname="details controller";
		logs.dolog(methodname);
		System.out.println(id);
		detailservice.deleteDetails(id);
	
	}
@RequestMapping(value="/getdetailsbyid/{id}")
	public List findDetailsById(@PathVariable("id") int id)
	{
	String methodname="details controller";
	logs.dolog(methodname);
	List abc=detailservice.findDetailsById(id);
	return abc;
	}
	@RequestMapping(value="/updateDetails/{id}")
	public void updateDetails(@PathVariable("id") int id ,@RequestBody Details det)
	{	
		String methodname="details controller";
		logs.dolog(methodname);
		detailservice.updateDetails(id, det);
	}


}
