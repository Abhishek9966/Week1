package day1;

import java.text.DecimalFormat;

public class Temperature {

	public Double convertToFarenhite(Double celsius)
	{
		Double ans=(celsius*(9.0/5.0))+32;
		DecimalFormat dec=new DecimalFormat("#0.00");
		return Double.parseDouble(dec.format(ans));
	}
	
	public Double convertToCelsius(Double Farenhite)
	{
		Double ans=(Farenhite-32)*(5.0/9.0);
		DecimalFormat dec=new DecimalFormat("#0.00");
		return Double.parseDouble(dec.format(ans));
	}
}
