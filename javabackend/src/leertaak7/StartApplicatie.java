package controller;

import java.io.File;
import java.util.ArrayList;

import model.Gezelschap;
import server.JSONFileServer;

/* @author Zak Wever */
public class StartApplicatie {
	
	private String bestelUrl;
	private String reserveerUrl;
	private static ArrayList<Gezelschap> reserveringen = new ArrayList<Gezelschap>();
	
public static void main(String[] args) {
		
		JSONFileServer server = new JSONFileServer(new File("webapp/app"), 8888);
		
		RestaurantSysteem restaurantSysteem = new RestaurantSysteem();
		
		BestelController bestelController = new BestelController(restaurantSysteem);
		ReserveerController reserveerController = new ReserveerController(restaurantSysteem);
		
		/*
		 *  We hebben nog de URL's nodig om de handlers te registreren. 
		 *  URL's opslaan in de 2 instantie variabelen (bestelUrl, reserveerUrl)
		 *  
		server.registerHandler(bestelUrl, bestelController);
		server.registerHandler(reserveerUrl, reserveerController);
		 */
		
		server.start();
		
		
		
	}

}
