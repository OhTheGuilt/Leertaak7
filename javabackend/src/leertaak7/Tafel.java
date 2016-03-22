/**
 * 
 */
package leertaak7;

/**
 * @author berto_000
 *
 */
public class Tafel {
	public Gezelschap gezelschap;
	public Date datums[];
	public int tafelnummer;
	public int aantalStoelen;
	public Tafel(int tnr, int as){
		tnr = tafelnummer;
		as= aantalStoelen;
}
	public int getTafelNummer(){
		return tafelnummer;
}
	public void setGezelschap(Gezelschap gezelschap){
	this.gezelschap = gezelschap;
		}}


