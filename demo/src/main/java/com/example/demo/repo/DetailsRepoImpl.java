package com.example.demo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Details;
import com.example.demo.query.Logger;
import com.example.demo.query.Query;
import com.sun.istack.Nullable;

@Component
public class DetailsRepoImpl implements DetailsRepo {
	
	
	@Autowired
	Query querys;
	Logger logs=new Logger();
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public List<?> getAllDetails() {
		
		String methodname="detailrepoimpl...getalldetails";
		logs.dolog(methodname);
		rowmapper rw=new rowmapper();
		// TODO Auto-generated method stub
		String abc=querys.getAllDetails;
		jdbctemplate.query(abc,rw);
		//System.out.println(jdbctemplate.query(abc,rw)+"sid");
		return jdbctemplate.query(abc,rw);
		
	}

	@Override
	public void addDetails(Details det) {
		// TODO Auto-generated method stub
		String methodname="detailrepoimpl...addDetails";
		logs.dolog(methodname);
		String abc=querys.addDetails;
		jdbctemplate.update(abc,det.getName());
	}

	@Override
	public void deleteDetails(int id) {
		// TODO Auto-generated method stub
		String methodname="detailrepoimpl...deletedetails";
		logs.dolog(methodname);
		String abc=querys.deleteDetails;
		jdbctemplate.update(abc,id);
		
	}

	@Override
	public List findDetailsById(int id) {
		// TODO Auto-generated method stub
		String methodname="detailrepoimpl...finddetailsbyid";
		rowmapper rw=new rowmapper();
		logs.dolog(methodname);
		String abc=querys.finddetailsbyid;
		return jdbctemplate.queryForList(abc,id);
		
	}

	@Override
	public void updateDetails(int id, Details det) {
		// TODO Auto-generated method stub
		String methodname="detailrepoimpl...updateDetails";
		logs.dolog(methodname);
		String abc=querys.updateDetails;
		jdbctemplate.update(abc, det.getName(),id);
	}
	
		
}
 class rowmapper implements RowMapper<Details>{

	@Override
	public Details mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Details detail= new Details();
		detail.setId(rs.getInt(1));
		detail.setName(rs.getString(2));
		return detail;
	}
	
}
