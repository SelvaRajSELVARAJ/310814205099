package com.book.util;

import java.sql.SQLException;

public class TestConnectionUtil {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ConnectionUtil.getConnection();
System.out.println(ConnectionUtil.getConnection());
	}

}