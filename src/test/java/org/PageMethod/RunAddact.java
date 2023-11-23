package org.PageMethod;

import java.io.IOException;

public class RunAddact extends AddactPagemethod {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		RunAddact r = new RunAddact();
		r.login();
		r.Searchhotel();
		r.Selecthotel();
		r.Booknow();
		r.Bookingconfirm();
		r.logout();
		
		
		// to do this we need to make all the method of AddactPagemethod Class to static
//		AddactPagemethod.login();
//		AddactPagemethod.Searchhotel();
//		AddactPagemethod.Selecthotel();
//		AddactPagemethod.Booknow();
//		AddactPagemethod.Bookingconfirm();
//		AddactPagemethod.logout();
		
		// OR
		
//		AddactPagemethod.Login(BaseClass.excelRead(1, 2), BaseClass.excelRead(1, 3));
	}

}
