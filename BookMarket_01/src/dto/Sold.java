package dto;

import java.util.Date;

public class Sold {

	private int order_id;
	private int seller_id;
	private int book_id;
	private Date sold_date;
	private int sold_price;
	private int buyer_id;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
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
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	@Override
	public String toString() {
		return "Sold [order_id=" + order_id + ", seller_id=" + seller_id + ", book_id=" + book_id + ", sold_date=" + sold_date
				+ ", sold_price=" + sold_price + ", buyer_id=" + buyer_id + "]";
	}
	
	
}
