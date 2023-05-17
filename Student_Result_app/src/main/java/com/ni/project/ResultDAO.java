package com.ni.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDAO {
	ResultBean rb;
	
	ResultBean getResult(int rollNo) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1234");
			
			PreparedStatement pstm=
					con.prepareStatement("select * from result where rollNo=?");
			pstm.setInt(1, rollNo);
			ResultSet rs=pstm.executeQuery();
			rb=new ResultBean();
			rs.next();
				rb.setRollNo(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setC(rs.getInt(3));
				rb.setCpp(rs.getInt(4));
				rb.setJava(rs.getInt(5));
				return rb;
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return rb;
	}
}
