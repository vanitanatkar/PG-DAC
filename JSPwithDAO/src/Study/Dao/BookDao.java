package Study.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookDao {
	
	public static Connection makeConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("the driver class is not found in the classpath");
		}
		String jdbc_url = "jdbc:mysql://localhost:3306/bookshop"; //bookshop and db1
		String uname ="root";
		String pass= "Root";
		
		Connection con=null;
		try {
			con = DriverManager.getConnection(jdbc_url, uname, pass);
		} catch (SQLException e) {
			
			System.out.println("could not counnect to DB "+e);
		}
		return con;
	}
	
	public BookPojo getBookInfo(int Bookid)
	{
		
		Connection con  = BookDao.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from book where id=?");
		    pstmt.setInt(1, Bookid);
		   ResultSet rs=pstmt.executeQuery();
		   
		if(rs.next()) {
			//we are mapping result set values to object Properties
			BookPojo obj=new BookPojo();
			obj.setId(rs.getInt(1));
			obj.setCost(rs.getInt(2));
			obj.setName(rs.getString(3));
			return obj;
			
		}
		else {
			return null;
		 }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<BookPojo> getAllBooks()
	{
		Connection con = this.makeConnection();
		ArrayList<BookPojo> al = new ArrayList<BookPojo>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from book");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				//WE ARE MAPPING RESULSET Column Values to Object Properties
				BookPojo obj = new BookPojo();
				obj.setId(rs.getInt(1));
				obj.setCost(rs.getInt(2));
				obj.setName(rs.getString(3));
				al.add(obj);
			}//end of loop
		}//end of try
		catch (SQLException e) {
			e.printStackTrace();
		}//end of catch
		
		return al;
		
	}//end of getAllBooks

}
