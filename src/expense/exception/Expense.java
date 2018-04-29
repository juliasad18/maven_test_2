package expense.exception;

import java.math.BigDecimal;

public class Expense {
	private String name;
	private String category;
	private BigDecimal amount;
	
	public Expense(BigDecimal amount, String name, String category) {
		this.name = name;
		this.category = category;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "\n" + "Amount: " + amount + "\n" + "Name: " + name + "\n" + "Category: " + category;
	}


}
