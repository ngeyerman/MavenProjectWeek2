package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.InvestmentInfo;
import model.Investor;

public class TestInvestor2 {

	InvestmentInfo investor2 = new InvestmentInfo();
	Investor jill = new Investor("Jill");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcTotalReturn() {
		jill.setCapital(10000);
		jill.setRateOfReturn(.11);
		double acctValue = investor2.calcTotalReturn(jill);
		System.out.println("Total account value is: $" + investor2.calcTotalReturn(jill));
		assertEquals(11100, acctValue, 0.001);

	}

}
