package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(DemoApplication.class, args);

        PrintQuotes p = context.getBean(PrintQuotes.class);

        p.print();

		DisplayQuotes d=context.getBean(DisplayQuotes.class);

		d.display();
    }
}

// Interface
interface Quotes {
    void getQuotes();
}

// Implementation 1
@Component
@Primary
class FriendshipQuotes implements Quotes {

	@PostConstruct
    public void init() {
        System.out.println("FriendshipQuotes Bean Created");
    }

    @Override
    public void getQuotes() {

        System.out.println("A friend in need is a friend indeed.");
        System.out.println("True friendship never fades.");
        System.out.println("Friends make life beautiful.");

    }

	@PreDestroy
	public void destroy() {
    System.out.println("FriendshipQuotes Bean Destroyed");
}
}

// Implementation 2
@Component
@Lazy
@Scope("prototype")
class HardWorkQuotes implements Quotes {
	
	public HardWorkQuotes() {
        System.out.println("HardWorkQuotes Object Created");
    }

    @Override
    public void getQuotes() {

        System.out.println("Hard work beats talent.");
        System.out.println("Success follows discipline.");
        System.out.println("Consistency creates results.");
        System.out.println("Work hard in silence.");

    }
}

// Consumer Class
@Component
class PrintQuotes {

    @Autowired
    private Quotes quotes;

    public void print() {
        quotes.getQuotes();
    }
}

@Component
class DisplayQuotes {

	// Field injection
    // @Autowired
    // @Qualifier("hardWorkQuotes")
    private Quotes quotes;


	//Setter Injection
	// private Quotes quotes;

    // @Autowired
    // public void setQuotes(Quotes quotes) {
    //     this.quotes = quotes;
    // }

	//Constructor Injection
	//@Autowired
	
    public DisplayQuotes(@Qualifier("hardWorkQuotes") Quotes quotes) {
        this.quotes = quotes;
    }


    public void display() {
        quotes.getQuotes();
    }
}
