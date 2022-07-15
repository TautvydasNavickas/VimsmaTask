package com.example.visma;

import com.example.visma.entity.Meeting;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class VismaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VismaApplication.class, args);
	}

}
