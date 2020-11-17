import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
		/*1. int x,y;
		 
		 x = sc.nextInt();
		 y = sc.nextInt();
		 
		 if(x > y)
		 {
          System.out.println("O maior valor é:" + x); 
          
	    }
		 else {
			 System.out.println("O maior valor é:" + y);
		 }  */
		
		 /*2. int senha;
		 senha = sc.nextInt();
		 
		 if(senha == 1234)
		 {
			 System.out.println("ACESSO PERMITIDO");
		 }
		 else {
			 System.out.println("ACESSO NEGADO");
		 }*/
		  /* 3 double x , resultado;
		  x = sc.nextDouble();
		  if(x < 12)
		  {
			  resultado = x * 0.30;
		  }
		  else {
			  resultado = x * 0.25;
		  }
		  
		  System.out.println("o valor é:" + resultado); */
		/* double altura, peso ;
		 int sexo;
		 
		 System.out.println("Qual seu sexo 1feminino 2 masculino");
		 sexo = sc.nextInt();
		 
		 altura = sc.nextDouble();
		  
		 if(sexo == 1)
		 {
			System.out.println( peso = (altura * 66.2) - 44.7);	
		 }
		 else{
			System.out.println(peso =(72.7 * altura) - 58);
		 }
		 */
		 int lados;
		 double x,y,z,k,perimetro,area;
		 
		 lados = sc.nextInt();
		 if(lados == 3){
		     x = sc.nextDouble();
		     y = sc.nextDouble();
		     z = sc.nextDouble();
			 perimetro = x + y +z;    	 
		  
		 }
		 else {
			 if(lados == 4)
			 {
				 x = sc.nextDouble();
			 System.out.println(Math.pow(x, 2));
			     
			 }
		 }
           sc.close(); 
		 
}
}
