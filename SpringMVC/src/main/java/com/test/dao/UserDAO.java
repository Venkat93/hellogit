package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.utils.DataBaseUtils;

public class UserDAO {
	
	public boolean isValidUser(String UserName,String Password){
		try{
			Connection con=DataBaseUtils.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user where UserName=? and Password=?");
			ps.setString(1, UserName);
			ps.setString(2, Password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
