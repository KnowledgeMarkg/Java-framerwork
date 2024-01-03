package com.learn.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.jpa.dao.Opration;
import com.learn.jpa.entities.UserEntities;

@SpringBootApplication
public class JpaLearnApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaLearnApplication.class, args);
		Opration bean = context.getBean(Opration.class);
//		UserEntities user  = new UserEntities();
//		user.setName("Faiz");
//		user.setCity("Kolkata");
//		
//		UserEntities user1  = new UserEntities();
//		user1.setName("Faiz");
//		user1.setCity("Kolkata");
//		
//		UserEntities user2  = new UserEntities();
//		user2.setName("Faiz");
//		user2.setCity("Kolkata");
//		
//		
////		UserEntities save = bean.save(user);
//		List<UserEntities> list = List.of(user1, user2);
//		Iterable<UserEntities> saveAll = bean.saveAll(list);
//	    for(UserEntities u : saveAll) {
//	    	System.out.println(u);
//	    }
	    
//	    Optional<UserEntities> byId = bean.findById(2);
//	    UserEntities userEntities = byId.get();
//	    userEntities.setCity("Mumbai");
//	    userEntities.setName("Choit");
//	    
//	    UserEntities save = bean.save(userEntities);
//	    System.out.println(save);
		
//		Iterable<UserEntities> all = bean.findAll();
//		
//		all.forEach(user->System.out.println(user));
		
		bean.deleteById(52);
		
		
	    
	}

}