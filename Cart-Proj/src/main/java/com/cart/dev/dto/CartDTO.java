package com.cart.dev.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_table")
public class CartDTO implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	private int id;
	@Column(name="item_name")
	private String items;
	@Column(name="item_quantity")
	private String quantity;
	@Column(name="item_price")
	private double price;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getItems() {
		return items;
	}
	public String getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "CartDTO [id=" + id + ", items=" + items + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
