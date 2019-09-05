package model;

public class Investor {

	private String name; //name of investor
	private double capital; //initial amount of investment
	private double rateOfReturn; //return on the investment

	public Investor() {// default no arg constructor
		super();
		// TODO Auto-generated constructor stub
	}

	public Investor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getRateOfReturn() {
		return rateOfReturn;
	}

	public void setRateOfReturn(double rateOfReturn) {
		this.rateOfReturn = rateOfReturn;
	}

}
