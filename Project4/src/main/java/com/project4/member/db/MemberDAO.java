package com.project4.member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.connector.Response;

public class MemberDAO {
	
	Connection con;
	String sql;
	ResultSet rs;
	PreparedStatement pstmt;
	
	// DB 연결 메서드 getCon()
	public void getCon() throws Exception {
		
		Context initCTX = new InitialContext();
		
		DataSource ds = (DataSource) initCTX.lookup("java:comp/env/jdbc/mvc");
		con = ds.getConnection();
		System.out.println(" DAO : DB 연결 성공(커넥션풀)");
		System.out.println("DAO : " + con);
		
	}
	// DB 연결 메서드 getCon()
	
	// DB 해제 메서드 closeDB()

	public void closeDB() {
			try {
				if (rs != null)	rs.close();
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	// DB 해제 메서드 closeDB()
	
	// 로그인 상태 체크 메서드 loginCheck() 
	
	
	// 로그인 상태 체크 메서드 loginCheck() 
	
}