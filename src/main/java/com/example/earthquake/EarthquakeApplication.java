package com.example.earthquake;

import com.example.earthquake.model.Earthquake;
import com.example.earthquake.service.EarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EarthquakeApplication implements CommandLineRunner {

	@Autowired
	private EarthquakeService earthquakeService;
	public static void main(String[] args) {
		SpringApplication.run(EarthquakeApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter country : ");
		String country = input.nextLine();
		System.out.print("Enter the number of days : ");
		int days = input.nextInt();

		List<Earthquake> response=earthquakeService.getEarthquakesByCountryAndDays(country,days);

		if (response.isEmpty()) {
			System.out.println("No Earthquakes were recorded past " + days + " days");
		} else {
			System.out.println("Country \t Place \t\t\t Date \t Magnitude");
			for (Earthquake r: response) {
				System.out.println(r.getCountry() + " " + r.getPlace() + " " + r.getDateTime() + " " + r.getMagnitude());
			}
		}
	}

}
