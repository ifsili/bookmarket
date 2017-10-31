package dto;

import java.util.Date;

public class KeepBook {
 
	private int keepBook_id;
	private int book_id;
	private int mem_id;
	private Date keep_date;
	
	public int getKeepBook_id() {
		return keepBook_id;
	}
	public void setKeepBook_id(int keepBook_id) {
		this.keepBook_id = keepBook_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public Date getKeep_date() {
		return keep_date;
	}
	public void setKeep_date(Date keep_date) {
		this.keep_date = keep_date;
	}
	@Override
	public String toString() {
		return "KeepBook [keepBook_id=" + keepBook_id + ", book_id=" + book_id + ", mem_id=" + mem_id + ", keep_date="
				+ keep_date + "]";
	}
	
	
}
