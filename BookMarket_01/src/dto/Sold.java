package dto;

import java.util.Date;

public class Sold {

	private int order_id;
	private int seller;
	private int book_id;
	private Date sold_date;
	private int sold_price;
	private int buyer;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getSeller() {
		return seller;
	}
	public void setSeller(int seller) {
		this.seller = seller;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public Date getSold_date() {
		return sold_date;
	}
	public void setSold_date(Date sold_date) {
		this.sold_date = sold_date;
	}
	public int getSold_price() {
		return sold_price;
	}
	public void setSold_price(int sold_price) {
		this.sold_price = sold_price;
	}
	public int getBuyer() {
		return buyer;
	}
	public void setBuyer(int buyer) {
		this.buyer = buyer;
	}
	@Override
	public String toString() {
		return "Sold [order_id=" + order_id + ", seller=" + seller + ", book_id=" + book_id + ", sold_date=" + sold_date
				+ ", sold_price=" + sold_price + ", buyer=" + buyer + "]";
	}
	
	
}
