package entities;

public class OrdemItem {
	private Integer quantity;
	private Double price;
	private Product product;

	public OrdemItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(int Quantity) {
		this.quantity = Quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double SubTotal() {
		return quantity * price;
	}

}
