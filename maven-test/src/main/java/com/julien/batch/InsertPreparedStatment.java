package com.julien.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPreparedStatment {

	public InsertPreparedStatment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {

		InsertPreparedStatment insertPreparedStatment = new InsertPreparedStatment();
		for (int i = 0; i < 0; i++) {
			insertPreparedStatment.deleteRecords();
			insertPreparedStatment.insertRecords();
		}
		for (int i = 0; i < 1; i++) {
			insertPreparedStatment.deleteRecords();
			insertPreparedStatment.insertBatchRecords();
		}
	}

	public void deleteRecords() throws Exception {

		Connection c = this.getConnection();

		long start = System.currentTimeMillis();

		PreparedStatement ps = c.prepareStatement("TRUNCATE TABLE test_insert");

		ps.executeUpdate();

		long end = System.currentTimeMillis();

		System.out.println("Truncate Table in " + (end - start));

		ps.close();

		c.close();

	}

	public void insertRecords() throws Exception {

		Connection c = this.getConnection();

		c.setAutoCommit(false);
		PreparedStatement ps = c
				.prepareStatement("INSERT INTO test_insert (data, date) VALUES(?, ?)");

		java.util.Date today = new java.util.Date();
		java.sql.Date sqlToday = new java.sql.Date(today.getTime());

		long start = System.currentTimeMillis();
		int cpt = 100000;

		for (int i = 0; i < cpt; i++) {
			ps.setString(1, "data " + i);
			ps.setDate(2, sqlToday);
			ps.executeUpdate();
			//cpt = cpt + ps.getUpdateCount();
		}

		c.commit();

		long end = System.currentTimeMillis();

		System.out.println("Insert Batch" + cpt + " record in " + (end - start));

		ps.close();
		c.close();

	}

	public void insertBatchRecords() throws Exception {

		Connection c = this.getConnection();

		c.setAutoCommit(false);
		PreparedStatement ps = c.prepareStatement("INSERT INTO test_insert (data, date) VALUES(?, ?)");
		
		java.util.Date today = new java.util.Date();
		java.sql.Date sqlToday = new java.sql.Date(today.getTime());

		long start = System.currentTimeMillis();
		int cpt = 100000;
		
		for (int i = 0; i < cpt; i++) {
			ps.setString(1, "data " + i);
			ps.setDate(2, sqlToday);
			ps.addBatch();
			
			if(((i+1)%1000) == 0) {
				ps.executeBatch();
			}
		}
		
		ps.executeBatch();
		
		c.commit();

		long end = System.currentTimeMillis();

		System.out.println("Insert " + cpt +" record in " + (end - start));

		ps.close();
		c.close();

	}

	private Connection getConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "", "");

		return con;
	}

}
