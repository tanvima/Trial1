package com.cybage;

public class Product  {

		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		private String name;
		private int quantity;
		private double price;
		
		public Product(){
			super();
		}
		public Product(int id, String name, double price, int quantity){
			this.id=id;
			this.name=name;
			this.price=price;
			this.quantity=quantity;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", quantity="
					+ quantity + ", price=" + price + "]\n";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + quantity;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(price) != Double
					.doubleToLongBits(other.price))
				return false;
			if (quantity != other.quantity)
				return false;
			return true;
		}
		
		
		
}
