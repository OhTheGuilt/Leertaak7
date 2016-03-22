package controller;

import java.io.File;
import java.util.ArrayList;

import model.Gezelschap;
import server.JSONFileServer;

public class RestaurantSysteem {
	
	private String bestelUrl;
	private String reserveerUrl;
	private static ArrayList<Gezelschap> reserveringen = new ArrayList<Gezelschap>();
	
	public RestaurantSysteem() {
		
	}
	
	public static void main(String[] args) {
		
		JSONFileServer server = new JSONFileServer(new File("webapp/app"), 8888);
		RestaurantSysteem restaurantSysteem = new RestaurantSysteem();
		BestelController bestelController = new BestelController(restaurantSysteem);
		ReserveerController reserveerController = new ReserveerController(restaurantSysteem);
		/*
		 * 
		server.registerHandler(bestelUrl, bestelController);
		server.registerHandler(reserveerUrl, reserveerController);
		 */
		server.start();
		
		
		
	}

}
