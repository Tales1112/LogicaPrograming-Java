package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double p() {
		double resultado = (a + b + c) / 2.00;
		return resultado;
	}
	public double area() {
		double resultado = Math.sqrt(p() * (p() - a) * (p()- b)*(p() - c));
		return resultado;
	}
}
