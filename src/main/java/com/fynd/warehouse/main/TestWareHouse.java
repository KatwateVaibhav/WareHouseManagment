package com.fynd.warehouse.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestWareHouse {

	public TestWareHouse() {

	}

	public static void main(String[] args) throws IOException {
		TestWareHouse sh = new TestWareHouse();
		final String serviceURL = "http://localhost:8080/" ;//createWareHouse/4
		System.out.println("Select menu. PLease select valid input");
		System.out.println("\n 1. .service");
		System.out.println("Please input valid menu number(1,2,3,4,5,6,7)= ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		HttpURLConnection conn = null;
		URL url = null;
		int racks = 0;

		switch (no) {
		case 1:
		{
			System.out.println("Enter number of warehouses you want create");
			Scanner sc = new Scanner(System.in);
			int scNo = sc.nextInt();
			url = new URL( serviceURL+"createWareHouse/"+scNo);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
			racks =scNo;
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Empty Racks created");
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output);
			}

			
		}
		case 2:
		{
			System.out.println("Enter Products to Store in warehouse");
			for(int i =0 ;i<racks ;i++)
			{
			Scanner dd = new Scanner(System.in);
			System.out.println("Enter Product Name .");
		    String product=  dd.nextLine();
		    System.out.println("Enter Product color.");
		    String productColor  = dd.nextLine();
			url = new URL( serviceURL+"storeProduct/"+product+"/"+productColor);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Output from Server \n");
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output);
			}

			}
		}
		
		case 3:
		{
			System.out.println("Enter Products to Sell from warehouse");
			Scanner s = new Scanner(System.in);
		    int sellNo=  s.nextInt();
			url = new URL( serviceURL+"sellProduct/"+sellNo);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Product sold from Rack no" + sellNo);
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output+"\n");
			}
		}
		case 4:
		{
			System.out.println("Getting Status from Rack");
			url = new URL( serviceURL+"status");
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Status of Rack");
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output);
			}
		}
		case 5:
		{
			System.out.println("Get products of color");
			Scanner scColor = new Scanner(System.in);
		    String color=  scColor.nextLine();
			url = new URL( serviceURL+"getProductFromColor/"+color);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Products of color : " +color);
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output);
			}
		}
		case 6:
		{
			System.out.println("Get Slots of color");
			Scanner scColor = new Scanner(System.in);
		    String color=  scColor.nextLine();
			url = new URL( serviceURL+"getSlotFromColor/"+color);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Slots of Rack");
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output);
			}
		}
		
		case 7:
		{
			System.out.println("Get slots from product code");
			Scanner scCode = new Scanner(System.in);
		    String productCode=  scCode.nextLine();
			url = new URL( serviceURL+"getSlotFromProductCode/"+productCode);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Slots of from product Code");
			while ((output = br.readLine()) != null) {
				System.out.println("\n"+output);
			}
		}

		
		}

	}
}
