package demo;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new NeroCustomerManager();
		try {
			customerManager.Save(new Customer(1,"aydin","baskara","xxxxx","123456"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
