package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.InvestmentInfo;
import model.Investor;

public class TestInvestor1 {

	InvestmentInfo investor1 = new InvestmentInfo();
	Investor dave = new Investor("Dave");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateReturn() {
		dave.setCapital(10000);
		dave.setRateOfReturn(.11);
		double gains = investor1.calculateReturn(dave);
		assertEquals(1100, gains, 0.001);
		System.out.println("Account growth is: $" +gains);

	}
	
	@Test
	public void testBetterThanAverage() {
		dave.setRateOfReturn(.11);
		assertTrue(investor1.betterThanAverage(dave));
		System.out.println("The investor is better than average: " +investor1.betterThanAverage(dave));
		
	}
	
	@Test
	public void testActiveVsPassive() {
		dave.setRateOfReturn(.07);
		assertFalse(investor1.activeVsPassive(dave));
		System.out.println("The investor with " + dave.getRateOfReturn()+ " return would be better off picking securities: "+investor1.activeVsPassive(dave));
	}
	
	

}
