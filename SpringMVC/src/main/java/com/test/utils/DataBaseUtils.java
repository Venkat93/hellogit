package com.test.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.sql.DataSource;

//import com.test.JDBC.DataBaseUtils;

//import org.apache.commons.dbcp2.BasicDataSource;

public class DataBaseUtils {
	
private static Properties dbProperties = new Properties();

	
	/*private static BasicDataSource datasource  = new BasicDataSource();
	}
	static{
		try{
			dbProperties.load(DataBaseUtils.class.getResourceAsStream("DBProperties.properties"));
			datasource.setUrl(dbProperties.getProperty("db.url"));
			datasource.setUsername(dbProperties.getProperty("db.username"));
			datasource.setPassword(dbProperties.getProperty("db.password"));
			datasource.setDriverClassName(dbProperties.getProperty("db.driverclassName"));
			datasource.setInitialSize(10);
			System.out.println(" DB Properties "+ dbProperties );
		}catch(IOException ex){
			ex.printStackTrace();
			System.out.println("Failed !! loading DB properties");
		}
	}*/

	/*public static Connection getConnection() throws Exception{		
		
		return datasource.getConnection();
		
	}*/
	public static Connection getConnection(){
		
		Connection con=null;
		try{
			dbProperties.load(DataBaseUtils.class.getResourceAsStream("DBProperties.properties"));
		
		Class.forName(dbProperties.getProperty("db.driverclassName"));
		//System.out.println(c.getClass());
		con=DriverManager.getConnection(dbProperties.getProperty("db.url"),dbProperties.getProperty("db.username"),dbProperties.getProperty("db.password"));
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Connection not established");
			
		}
		
		return con;
	}
}

