package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Hobby;
import pojo.User;

public class DBManager {

	private Connection connect;		//class property
	
	public DBManager(){
		
	}
	
	public Connection getConnect()
	{
		return connect;
		
	}
	
	public void openConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbc_url = "jdbc:mysql://localhost:3306/mini_project_db";
		String uname ="root";
		String pass= "root";
		connect = DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("connection to DB is successful ");		
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB connection successful");
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//public boolean validateUser(String uname, String pass)
	public boolean validateUser(User nuser)
	{
		//connect db
		openConnection();
		
		//fire query
		try {
		String query ="SELECT * FROM USER_INFO_TBL WHERE USER_USERNAME='"+nuser.getUsername()+"'AND USER_PASSWORD='"+nuser.getPassword()+"'";
		Statement stmt = connect.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		
		//validate output
		if(rs.next())	//if we have something in rs=any row
		{
			nuser.setId(rs.getInt(1));
			nuser.setFname(rs.getString(2));
			nuser.setLname(rs.getString(3));
			nuser.setEmailId(rs.getString(4));
			nuser.setMobileNo(rs.getString(5));
		
			return true;
		}
		else
			return false;
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {		//finally returns only after closing connection anyhow
			//close connection
			closeConnection();
		}
		
		//return value
		return false;
	}
		
	
/*	public static void main(String[] args) {
		//DBManager obj = new DBManager();
		//boolean result=obj.validateUser("anil", "anil123");
		//boolean result=obj.validateUser(nuser);
		//System.out.println(result);
	}*/

	public void addUser(User nuser) {
		openConnection();
		PreparedStatement pstmt;
		try {
			pstmt = connect.prepareStatement("insert into user_info_tbl values(?,?,?,?,?,?,?)");
			
				pstmt.setInt(1, nuser.getId());
		pstmt.setString(2, nuser.getFname());
		pstmt.setString(3, nuser.getLname());
		pstmt.setString(4, nuser.getEmailId());
		pstmt.setString(5, nuser.getMobileNo());
		pstmt.setString(6, nuser.getUsername());
		pstmt.setString(7, nuser.getPassword());
		
		
		pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	public void addHobby(Hobby hb) {
		openConnection();
		
		String query = "INSERT INTO HOBBY_TBL VALUES(DEFAULT,?,?)";
		
		try {
			PreparedStatement pstmt = connect.prepareStatement(query);
		
			pstmt.setInt(1, hb.getUserid());
			pstmt.setString(2, hb.getHobby());
		
		pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
			System.out.println("Connection closed !!!");
		}
		
		
	}
	
	
	//list of hobby
	public  List<Hobby> viewAllHobby()
	{
		openConnection();
		ArrayList<Hobby> hobbyal = new ArrayList<Hobby>();
		
		String query= "SELECT * FROM HOBBY_TBL";
		try {
			PreparedStatement pstmt = connect.prepareStatement(query);
		ResultSet rs= pstmt.executeQuery();
		
		while(rs.next())
		{
			//WE ARE MAPPING RESULSET Column Values to Object Properties
			Hobby obj = new Hobby();
			
			obj.setId(rs.getInt(1));
			obj.setUserid(rs.getInt(2));
			obj.setHobby(rs.getString(3));
			
		hobbyal.add(obj);
		}//end of while
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hobbyal;
		}//end of method
	
}//end of class
