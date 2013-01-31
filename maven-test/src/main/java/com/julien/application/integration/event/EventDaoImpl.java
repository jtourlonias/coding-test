package com.julien.application.integration.event;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.julien.application.integration.event.entity.Event;

public class EventDaoImpl extends HibernateDaoSupport implements EventDao {

	
	public void add(Event event) {
		this.getHibernateTemplate().save(event);
	}

	
	public void update(Event event) {
		this.getHibernateTemplate().update(event);
	}

	
	public void delete(Event event) {
		this.getHibernateTemplate().delete(event);
	}

	
	public List<?> findAll() {
		return getHibernateTemplate().find("from Event");
	}

	
	public List<?> findById(int id) {
		return getHibernateTemplate().find("from Event where id=?", id);
	}

	
	public List<?> findByDate(Date date) {
		return getHibernateTemplate().find("from Event where date=?", date);
	}

	
	public List<?> findByComment(String comment) {
		return getHibernateTemplate().find("from Event where comment=?", comment);
	}

}
