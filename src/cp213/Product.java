package cp213;

public class Product {
	
	public String num = "";
	public int stock = 0;
	public double price = 0.0;
	public String name = "";
	
	public Product(String num, int stock, double price) {
		
		this.num = num;
		this.stock = stock;
		this.price = price;
		this.name = name;
		
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void updateStock() {
		this.stock = this.stock - 1;
	}
	
	public int getStock() {
		return(this.stock);
	}
	
	public String getName() {
		return(this.name);
	}
	
	public String getNum() {
		return(this.num);
	}
	
	public Double getPrice() {
		return(this.price);
	}
}
