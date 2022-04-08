package com.piotrzawada.driversdeliverymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class DriversDeliveryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriversDeliveryManagementApplication.class, args);
	}


	@Bean
	LoadData data() throws IOException {
		return new LoadData("data/drivers_sample1.csv", "data/routes_sample1.csv");
	}


	@Bean
	public ArrayList<Driver> drivers(@Autowired LoadData loadData) {
		return loadData.loadDriversInfo();
	}


	@Bean
	public ArrayList<Route> routes(@Autowired LoadData loadData) {
		return loadData.loadRoutesInfo();
	}
}

