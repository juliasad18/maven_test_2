package expense.exception;

import java.math.BigDecimal;

public class CreateExpense {
	public void createExpense (String cex) {
		String[] parts = cex.split(":");  //массив который называется parts
											//в него попадают значение, разделенные :
		if (parts.length != 3) {
			throw new IllegalArgumentException("One line should contain 3 parts, with ':' separator");
		}
		
		BigDecimal amount = new BigDecimal(parts[0]);
		String name = parts[1];
		String category = parts[2];
		
		Expense exp = new Expense(amount, name, category);
		System.out.println("New expense created: " + exp);
	}

}
