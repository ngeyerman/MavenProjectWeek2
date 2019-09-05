package model;

public class InvestmentInfo {
	
	double investmentReturn; 
	double averageReturn = .10;// average return for the S&P is historically about 10%

	// method to calculate the gain in the investment
	public double calculateReturn(Investor investor) {
		double acctReturn;
		acctReturn = investor.getRateOfReturn() * investor.getCapital();
		return acctReturn;

	}

	// method to compare investment return percent to the average for the S&P 500.
	public boolean betterThanAverage(Investor investor) {
		 
		boolean talentedInvestor;

		if (investor.getRateOfReturn() <= averageReturn) {
			talentedInvestor = false;
		} else {
			talentedInvestor = true;
		}
		return talentedInvestor;

	}

	public boolean activeVsPassive(Investor investor) {// method to determine if investor should choose individual
														// securities or index funds
		
		boolean investFreely;

		if (investor.getRateOfReturn() >= averageReturn) {// if the rate of return is >= to average try to continue to
															// beat the market
			investFreely = true;
		} else {
			investFreely = false;//if return is < than average, perhaps stick to index funds
		}

		return investFreely;

	}

	public double calcTotalReturn(Investor investor) { //method to calculate the total account value, capital + return
		double totalValue;
		totalValue = ((investor.getRateOfReturn()) * investor.getCapital())+investor.getCapital();
		
		return totalValue;

		

	}
}
