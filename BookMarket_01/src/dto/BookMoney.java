package dto;

import java.util.Date;

public class BookMoney {

	private int mem_id;
	private int money;
	private Date money_update_day;
	
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Date getMoney_update_day() {
		return money_update_day;
	}
	public void setMoney_update_day(Date money_update_day) {
		this.money_update_day = money_update_day;
	}
	@Override
	public String toString() {
		return "BookMoney [mem_id=" + mem_id + ", money=" + money + ", money_update_day=" + money_update_day + "]";
	}
	
	
	
}
