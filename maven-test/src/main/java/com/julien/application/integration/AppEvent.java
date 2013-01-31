package com.julien.application.integration;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.julien.application.integration.event.EventBo;
import com.julien.application.integration.event.entity.Event;

public class AppEvent {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"resources/spring/config/applicationContext.xml");

		EventBo eventBo = (EventBo) appContext.getBean("eventBo");

		/** insert **/
		Event event = new Event();
		event.setComment("test comment !");
		event.setDate(new Date());
		eventBo.add(event);

		System.out.println("Done");
	}

}
