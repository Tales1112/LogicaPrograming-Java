

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Composicao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contratos;
		String name;
		WorkerLevel level = null;
		Double salary;
		String departament;

		System.out.println("Enter departament's name");
		departament = sc.next();
		System.out.println("Enter worker data");
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Level:");
		level = WorkerLevel.valueOf(sc.next());
		System.out.println("BaseSalary");
		salary = sc.nextDouble();
		Worker trabalhador = new Worker(name, level, salary, new Departament(departament));
		System.out.println("How many contractors to this worker?");
		contratos = sc.nextInt();

		System.out.println(trabalhador.toString());
		for (int i = 0; i < contratos; i++) {
			System.out.println("Enter Contract#" + i + 1 + "data:");
			Double valorHora;
			Integer hours;
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Date DD/MM/YYYY");
			Date data1 = formato.parse(sc.next());
			System.out.println("Value por hour:");
			valorHora = sc.nextDouble();
			System.out.println("Duration");
			hours = sc.nextInt();
			trabalhador.addContract(new HourContract(data1, valorHora, hours));
			System.out.println(trabalhador.contracts.get(i).toString());
		}
		System.out.println();
		System.out.println("Enter month and year to calculate Income(MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name:" + trabalhador.getName());
		System.out.println("Departament" + trabalhador.getDepartament().getName());
		System.out.println("Income for" + monthAndYear + ":" + trabalhador.Income(year, month));
	}
}
