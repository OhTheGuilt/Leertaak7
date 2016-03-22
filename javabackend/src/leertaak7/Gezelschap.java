/**
 * 
 */
package leertaak7;

/**
 * @author berto_000
 *
 */
public class Gezelschap{
	public String naam;
	public int aantalPersonen;
	public int tafel;
	public Gezelschap(String n, int ap){
		n=naam;
		ap=aantalPersonen;
	}
	public void setTafel(int tafel){
		this.tafel = tafel;
	}
}
