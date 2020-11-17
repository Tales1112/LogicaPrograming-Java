import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Triangle;
import entities.Product;
import entities.Rectangle;
import entities.Employee;
import entities.Funcionario;
import entities.Math1;
import entities.Conta;
import entities.Rooms;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Double salario;
		Integer id;
		String nome;
		Double porcentage;
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("Quantos funcionarios a serem cadastrados?");
		numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.println("Employee$" + (i + 1) + ":");
			System.out.println("Qual o seu nome");
			nome = sc.next();
			System.out.println("Qual o seu id");
			id = sc.nextInt();
			System.out.println("Qual o seu salario");
			salario = sc.nextDouble();
			funcionarios.add(new Funcionario(id, nome, salario));

		}
		System.out.println("Enter de employee id tha will have the salary increased:");
		int idSalary = sc.nextInt();
		Funcionario resultado = funcionarios.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		// Integer pos = position(funcionarios, idSalary);
		if (resultado == null) {
			System.out.println("Esse id não existe");
		} else {
			System.out.println("What is the percentage");
			porcentage = sc.nextDouble();
			resultado.aumentarSalario(porcentage);
			// funcionarios.get(pos).aumentarSalario(porcentage);
		}

		sc.close();

	}

}
