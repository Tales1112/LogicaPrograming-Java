package entities;

public class Math1 {
      public static final double pi = 3.14;
	public static double circumference(double radius)
       {
    	    return 2 * 3.14 * radius;
       }
       public static double volume(double radius)
       {
    	   return (4*3.14 * Math.pow(radius, 3)) / 3;
       }
       public static double CurrencyConverter(double dollarPrice, double dollar) {
    	   
    	    double resultado = dollarPrice * dollar;
    	    return resultado - (resultado * 0.6);
       }
       
}
