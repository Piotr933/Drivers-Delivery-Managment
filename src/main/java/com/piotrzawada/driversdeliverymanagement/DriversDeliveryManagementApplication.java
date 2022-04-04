package com.piotrzawada.driversdeliverymanagement;

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
		LoadData loadData = new LoadData("data/drivers_sample1.csv", "data/routes_sample1.csv");
		return loadData;
	}


	@Bean
	public ArrayList<Driver> drivers(@Qualifier("data") LoadData loadData) {
		return loadData.loadDriversInfo();
	}


	@Bean
	public ArrayList<Route> routes(@Qualifier("data") LoadData loadData) {
		return loadData.loadRoutesInfo();
	}
}

