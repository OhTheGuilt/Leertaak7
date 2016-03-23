package controller;

import server.Conversation;
import server.Handler;

<<<<<<< HEAD
/* @author Zak Wever */
/* ding */
public class BestelController implements Handler {

	private RestaurantSysteem restaurantSysteem;
	
	public BestelController(RestaurantSysteem restSys) {
		restaurantSysteem = restSys;
=======
/**
 *@author Zak Wever
 *
 */
public class BestelController implements Handler {

	
	public BestelController(RestaurantSysteem restaurantSysteem) {
		
>>>>>>> master
		
	}
	
	public void handle(Conversation conversation) {
<<<<<<< HEAD
		if (conversation.getRequestedURI().startsWith(" ")) {
			System.out.println("iets");
		}
		
	}
	
	/**
	 * Deze methode haalt eerst de opgestuurde JSON-data op. Daarna worden
	 * de benodigde gegevens uit het domeinmodel gehaald. Deze gegevens worden
	 * dan weer omgezet naar JSON en teruggestuurd naar de Polymer-GUI!
	 * 
	 * 
	 * DEZE METHODE MOET NOG GEIMPLEMENTEERD WORDEN 
	 * 
	 * @param conversation - alle informatie over het request
	 */
	
	private void doIets(Conversation conversation){
		System.out.println("iets");
		
	}
	
	
=======
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

>>>>>>> master
}
