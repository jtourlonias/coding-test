package com.julien.application.integration.event;

import java.util.Date;
import java.util.List;

import com.julien.application.integration.event.entity.Event;

/*
 * Bussiness Object (BO) to providing interface for bussiness operations
 */
public interface EventBo {
	
    void add(Event event);
    
    void update(Event event);
 
    void delete(Event event);
 
    List<?> findAll();
 
    List<?> findById(int id);
 
    List<?> findByDate(Date date);
    
    List<?> findByComment(String comment);
}
