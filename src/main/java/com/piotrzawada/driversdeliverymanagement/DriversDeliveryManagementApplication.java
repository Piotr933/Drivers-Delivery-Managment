package com.piotrzawada.driversdeliverymanagement;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class DriversDeliveryManagementApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DriversDeliveryManagementApplication.class).headless(false).run(args);
	}

	@Bean
	LoadData data() throws IOException {
		return new LoadData("data/drivers_sample2.csv", "data/routes_sample2.csv");
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

