package com.codingshuttle.assignment.one;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneApplication implements CommandLineRunner {

	private CakeBaker cakeBaker;

	public OneApplication(CakeBaker cakeBaker) {
		this.cakeBaker = cakeBaker;
	}

	public static void main(String[] args)
	{
	SpringApplication.run(OneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
