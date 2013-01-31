package com.julien.application.integration.event;

import java.util.Date;
import java.util.List;

import com.julien.application.integration.event.entity.Event;

/*
 * Data Access Object (DAO) to communicate with database using entity User
 */
public interface EventDao {

    void add(Event event);
    
    void update(Event event);
 
    void delete(Event event);
 
    List<?> findAll();
 
    List<?> findById(int id);
 
    List<?> findByDate(Date date);
    
    List<?> findByComment(String comment);
}
