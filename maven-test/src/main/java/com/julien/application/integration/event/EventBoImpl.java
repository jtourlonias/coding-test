package com.julien.application.integration.event;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.julien.application.integration.event.entity.Event;

@Transactional
public class EventBoImpl implements EventBo {

    private static final Logger LOGGER = Logger.getLogger(EventBoImpl.class.getName());
    
    @Autowired
    private EventDao eventDao;
 
	public EventDao getEventDao() {
		return eventDao;
	}

	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	public void add(Event event) {
		if (event == null) {
            return;
        }
        LOGGER.debug("Adding the following event: " + event.getComment() + ", " + event.getDate());
        eventDao.add(event);
	}

	
	public void update(Event event) {
		if (event == null) {
            return;
        }
        LOGGER.debug("Updating the following event: " + event.getComment() + ", " + event.getDate());
        eventDao.update(event);
	}

	
	public void delete(Event event) {
		if (event == null) {
            return;
        }
        LOGGER.debug("Deleting the following event: " + event.getComment() + ", " + event.getDate());
        eventDao.delete(event);
	}

	
	public List<?> findAll() {
		LOGGER.debug("Getting all events");
        return eventDao.findAll();
	}

	
	public List<?> findById(int id) {
		LOGGER.debug("Getting one event by id");
        return eventDao.findById(id);
	}

	
	public List<?> findByDate(Date date) {
		LOGGER.debug("Getting one event by date");
        return eventDao.findByDate(date);
	}

	
	public List<?> findByComment(String comment) {
		LOGGER.debug("Getting one event by comment");
        return eventDao.findByComment(comment);
	}



}
