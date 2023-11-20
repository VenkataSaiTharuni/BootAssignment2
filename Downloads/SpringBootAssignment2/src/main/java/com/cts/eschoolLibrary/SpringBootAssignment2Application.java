package com.cts.eschoolLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAssignment2Application {
	
	@Bean
	public Book bookBean(){
		return new Book("Wings of Fire","A.P.J.Abdul Kalam");
	}

	@Bean
	public Library libraryBean(){
		return new Library();
	}
	
	@Bean
	public Student studentBean(){
		return new Student("Tharuni",22);
	}

	@Bean
	public Classroom classroom() {
		Student student=null;
		return new Classroom(studentBean());
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(SpringBootAssignment2Application.class, args);
		ApplicationRunnerImpl applicationrunner =ac.getBean(ApplicationRunnerImpl.class);
		ac.close();
		
		
}
}
