package com.julien.batch;

import java.util.Date;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.StatelessSession;

import com.julien.batch.domain.TestInsert;

public class InsertHibernate {

	public InsertHibernate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		InsertHibernate insertHibernate = new InsertHibernate();

		insertHibernate.deleteRecords();
		insertHibernate.insertRecords();

		HibernateUtil.getSessionFactory().close();
	}

	public void deleteRecords() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		long start = System.currentTimeMillis();

		SQLQuery query = session.createSQLQuery("truncate table test_insert");
		query.executeUpdate();

		long end = System.currentTimeMillis();

		System.out.println("Truncate Table in " + (end - start));

		session.getTransaction().commit();

	}

	private void insertRecords() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Date date = new Date();

		long start = System.currentTimeMillis();
		int cpt = 100000;

		for (int i = 0; i < cpt; i++) {
			TestInsert testInsert = new TestInsert();
			testInsert.setData("data " + i);
			testInsert.setDate(date);
			session.save(testInsert);

			if( i % 50 == 0 ) {
	               session.flush();
	               session.clear();
	            }
		}

		long end = System.currentTimeMillis();

		System.out.println("Insert Hibernate " + cpt + " record in "
				+ (end - start));

		session.getTransaction().commit();

	}
}
