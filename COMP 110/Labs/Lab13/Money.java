/*
 File: Money.java
 Date: 10/28/2020
 Author: David Landaverde
 */
package Lab13;

public class Money
{
	private int dollars;
	private int cents;
	
	public Money() {
		dollars = 0;
		cents = 0;
	}
	
	public Money(int dollar, int cent) {
		this.dollars = dollar;
		this.cents = cent;
	}
	
	public int getDollars() {
		return dollars;
	}
	
	public void setDollars(int dollar) {
		this.dollars = dollar;
	}
	
	public int getCents() {
		return cents;
	}
	
	public void setCents(int cent) {
		this.cents = cent;
	}
	
	//Add
	public Money add(Money m) {
		Money out = new Money();
		out.setDollars(this.dollars + m.getDollars());
		
		if(this.cents + m.getCents() >=100) {
			out.setDollars(out.getDollars() + 1);
			out.setCents(this.cents + m.getCents() - 100);
		}
		else {
			out.setCents(this.cents + m.getCents());
		}
		
		return out;
	}
	
	//Subtract
	public Money subtract(Money m) {
		if (m.getDollars() > dollars) 
			return null;
		else if ((m.getDollars() == dollars) && (m.getCents() > cents))
			return null;
		
		Money out = new Money();
		out.setDollars(this.dollars - m.getDollars());
		
		if (this.cents - m.getCents() < 0) {
			out.setDollars(out.getDollars() - 1);
			out.setCents(-(this.cents - m.getCents()));
		}
		else {
			out.setCents(this.cents - m.getCents());
		}
		
		return out;
	}
	
	public String toString() {
		return String.format("$%1$d.%2$d", dollars, cents);
	}
	
}
/* If you see this that means I'm switching to c# and preferring that language instead */