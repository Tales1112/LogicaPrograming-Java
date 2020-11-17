import java.util.Scanner;

public class Repeticao {
  public static void Pares()
  {
	  for(int i = 100; i <= 1000; i++)
	  {
		  
		  if(i % 2 == 0)
		  {
			  System.out.println(i);
		  }
		  
	  }
  }
  public static void idade(int A)
  {
      if(A >= 18)
      {
    	  for(int i = A; i < 30; i++)
    	  {
    		  int resultado = 30 - i;
    		  System.out.println("ainda faltam" + resultado + " para voce completar 30 anos");
    	  }
    	  System.out.println("Voce completou 30 anos");
      }
      else {
    	   System.out.println("Menor de idade");
      }
  }
  public static void Peso(double peso, double altura)
  {   double teste = Math.pow(altura, 2);
	  double imc = peso/ teste ;
	  if(imc >= 20 && imc <=25 )
	  {
		  System.out.println("Peso ideal");
	  }
	  else {
		  if(imc > 25)
		  {
			  System.out.println("sobrepeso");
			while(imc > 25)
			{	 
				peso -= 2;
				imc = peso / teste;
				System.out.println(peso);
			}
		  }
		  else {
			  System.out.println("Abaixo do peso");
		  }
	  }
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         
          int x = 1 ;
          int y = 0;
          int resultado;
          for(int i = 0; i < 5; i++)
          {
        	  resultado = x + y ;
        	  y = x;
        	  x = resultado;
        	  System.out.println(resultado);
          }
          sc.close();
          
          
	}

}
