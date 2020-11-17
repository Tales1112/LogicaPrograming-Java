import java.util.Scanner;

public class Arrays {
       public static void iguais(int[]numeros) {
    	   for(int i = 0; i< numeros.length; i++)
    	   {
    		   if(numeros[i]== 5) {
    			   System.out.println(i);
    		   }
    	   }
       }
       public static int[]multiplicao(int[]numeroA,int[]numeroB){
    	   int [] resultado = new int[numeroA.length];
    	   for(int i = 0; i<numeroA.length; i++) {
    		   resultado[i] = numeroA[i] * numeroB[i];
    	   }
    	   return resultado;
       }
       public static  void impares(int[]algarismos,int A,int B){   
    	   for(int i = A; i < B; i++) {
    		    if(algarismos[i] % 2 != 0) {
    		    	System.out.println(algarismos[i]);
    		    }
    	   }
       }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
        	 
        	   int [] numero = new int[]{ 5,3,5,6,7,9,9,13};
        	   int [] numero2 = new int[] {5,5,4,3,8,7};
        	   
        	    impares(numero,2,7);
        	   
           sc.close();
           }
	
}
