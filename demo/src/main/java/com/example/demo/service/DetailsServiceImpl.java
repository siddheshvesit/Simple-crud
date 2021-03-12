package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Details;
import com.example.demo.query.Logger;
import com.example.demo.repo.DetailsRepo;

@Component
public class DetailsServiceImpl implements DetailsService {
@Autowired
 DetailsRepo detailsrepo;
 Logger logs=new Logger();
	@Override
	public List getAllDetails() {
		// TODO Auto-generated method stub
		String mehtodname="detailsserviceimpl...getalldetails";
		logs.dolog(mehtodname);
		return detailsrepo.getAllDetails();
	}
	@Override
	public void addDetails(Details det) {
		// TODO Auto-generated method stub
		String mehtodname="detailsserviceimpl...addDetails";
		logs.dolog(mehtodname);
		detailsrepo.addDetails(det);
		
	}
	@Override
	public void deleteDetails(int id) {
		// TODO Auto-generated method stub
		String mehtodname="detailsserviceimpl...deleteDetails";
		logs.dolog(mehtodname);
		System.out.println(id);
		detailsrepo.deleteDetails(id);
		
	}
	@Override
	public List findDetailsById(int id) {
		// TODO Auto-generated method stub
		String mehtodname="detailsserviceimpl...finddetailsbyid";
		logs.dolog(mehtodname);
		return detailsrepo.findDetailsById(id);
		
	}
	@Override
	public void updateDetails(int id, Details det) {
		// TODO Auto-generated method stub
		String mehtodname="detailsserviceimpl...updateDetails";
		logs.dolog(mehtodname);
		detailsrepo.updateDetails(id, det);
	}

}
