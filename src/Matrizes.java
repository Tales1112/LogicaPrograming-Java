import java.util.Scanner;

public class Matrizes {
public static void Igualdade(int[][]matriz)
{
	int negative = 0;
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			if(j == i) {
				System.out.println("Numeros diagonal" + matriz[i][j]);
			}
			if(matriz[i][j] < 0)
			{
				negative++;
			}
		}
	}
	
	System.out.println("Numero negativo" + negative);
}
public static void Mostrar(int [][]matrizB, int numero)
{
	for (int i = 0; i < matrizB.length; i++) {
		for (int j = 0; j < matrizB.length; j++) {
			if(matrizB[i][j] == numero) {
				System.out.println(matrizB[i][j -1]);
				System.out.println(matrizB[i - 1][j]);
				System.out.println(matrizB[i][j+1]);
				System.out.println(matrizB[i +1][j]);
			}
		}
	}
	
}
public static void Soma(int [][]matrizA) {
	int resultado = 0;
	for (int i = 0; i < matrizA.length; i++) {
		for (int j = 0; j < matrizA.length; j++) {
			resultado += matrizA[i][j];
		}
		System.out.println(resultado);
		if(resultado % 2 == 0)
		{
			System.out.println("fileira" + i + "é par");
		}
		resultado = 0;
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
		int [][] matrizes =  new int [][] {{5,-3,10},
        	                               {15,8,2},
        	                               {7,9,-4}};
     Soma(matrizes);
        sc.close();
	}

}
