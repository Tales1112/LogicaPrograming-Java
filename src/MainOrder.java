import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class MainOrder {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		String name, email;
		Double price;
		Integer quantity;
		OrderStatus level = null;
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter Cliente data:");
		System.out.print("Name:");
		name = sc.next();
		System.out.print("Email:");
		email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY:");
		Date p1 = sdf1.parse(sc.next());

		Client Tales = new Client(name, email, p1);
		System.out.print("Enter order Data:");
		System.out.print("Status:");
		level = OrderStatus.valueOf(sc.next());
		Order pedido = new Order(new Date(), level, Tales);
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (1 + i) + "item data:");
			System.out.print("Product name:");
			name = sc.next();
			System.out.println("Product price:");
			price = sc.nextDouble();
			System.out.println("Quantity");
			quantity = sc.nextInt();
			Product Tv = new Product(name, price);
			pedido.addItem(new OrdemItem(quantity, price, Tv));

		}
		System.out.println(pedido.toString());
		sc.close();
	}

}
