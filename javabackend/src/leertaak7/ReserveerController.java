package controller;

import server.Conversation;
import server.Handler;

/* @author Zak Wever */
/* ding */
public class ReserveerController implements Handler {
	
	private RestaurantSysteem restaurantSysteem;
	
	
	public ReserveerController(RestaurantSysteem restSys) {
		restaurantSysteem = restSys;
	}

	
	public void handle(Conversation conversation) {
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
	
	private void doIetsAnders(Conversation conversation) {
		System.out.println("iets");
		
		
	}
	
	
	
	

}
