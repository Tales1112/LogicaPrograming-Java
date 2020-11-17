package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client cliente;

	private List<OrdemItem> items = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public void addItem(OrdemItem item) {
		items.add(item);
	}

	public void removeItem(OrdemItem item) {
		items.remove(item);
	}

	public Double total() {
		double sum = 0;
		for (OrdemItem c : items) {
			sum += c.SubTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder cs1 = new StringBuilder();

		cs1.append("Order Moment:" + moment + "\n");
		cs1.append("Order Status:" + status + "\n");
		cs1.append("Cliente" + cliente + "\n");
		cs1.append("Ordem items:" + "\n");
		for (OrdemItem c : items) {
			cs1.append(c.getProduct() + "\n");
			cs1.append(c.getPrice() + "\n");
			cs1.append(c.getQuantity() + "\n");
			cs1.append(c.SubTotal() + "\n");
		}
		cs1.append(total());
		return cs1.toString();

	}

}
