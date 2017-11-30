package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.test.DTO.EmployeeDTO;
import com.test.utils.DataBaseUtils;

public class EmployeeDAO {
	public List<EmployeeDTO> getAllEmployeesList(){
		List<EmployeeDTO> list=new ArrayList<EmployeeDTO>();
		
		try{
			Connection con=DataBaseUtils.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				EmployeeDTO employee=new EmployeeDTO();
				employee.setEno(rs.getInt("EmployeeID"));
				employee.seteName(rs.getString("Name"));
				employee.setSalary(rs.getInt("salary"));
				employee.setGender(rs.getString("gender"));
				list.add(employee);
			}
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void delete(String eno){
		try{
			Connection con=DataBaseUtils.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from employee where EmployeeID=?");
			ps.setInt(1, Integer.parseInt(eno));
			int rs=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	/*public void insert(String eno, String ename, String salary, String gender){
		try{
			Connection con=DataBaseUtils.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, Integer.parseInt(eno));
			ps.setString(2, ename);
			ps.setInt(3, Integer.parseInt(salary));
			ps.setString(4, gender);
			ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}*/
	
	public void insert(int eno, String ename, int salary, String gender){
		try{
			Connection con=DataBaseUtils.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, eno);
			ps.setString(2, ename);
			ps.setInt(3, salary);
			ps.setString(4, gender);
			ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
