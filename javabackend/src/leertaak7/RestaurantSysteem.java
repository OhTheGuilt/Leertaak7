package controller;

<<<<<<< HEAD
import java.io.File;
import java.util.ArrayList;

import model.Bestelling;
import model.Consumptie;
import model.Gezelschap;
import model.Tafel;
import server.JSONFileServer;

/* @author Zak Wever */
/* ding */
public class RestaurantSysteem {
	
	private ArrayList<Bestelling> bestellingen;
	private ArrayList<Consumptie> consumpties;
	private ArrayList<Gezelschap> gezelschappen;
	private ArrayList<Tafel> tafels;
	
	
	public RestaurantSysteem() {
		bestellingen = new ArrayList<Bestelling>();
		consumpties = new ArrayList<Consumptie>();
		gezelschappen = new ArrayList<Gezelschap>();
		tafels = new ArrayList<Tafel>();
		
		
	}
	
	
=======
import java.util.ArrayList;

import model.Reservering;

/**
 *@author Zak Wever
 *
 */

public class RestaurantSysteem {
	
	private static ArrayList<Reservering> reserveringen = new ArrayList<Reservering>();
	
	public RestaurantSysteem() {
		
	}
	
	public static void main(String[] args) {
		
		
		
		
	}
>>>>>>> master

}
