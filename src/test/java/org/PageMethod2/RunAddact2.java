package org.PageMethod2;

import java.io.IOException;

import javax.security.auth.login.LoginContext;

import org.PageMethod2.AddactPageMethod2.AddactPagemethod2;

public class RunAddact2 extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		AddactPagemethod2.login(excelRead(1, 2),excelRead(1, 3));
		AddactPagemethod2.Searchhotel(excelRead(1, 4),excelRead(1, 5), excelRead(1, 6), excelRead(1, 7), excelRead(1, 8), excelRead(1, 9), excelRead(1, 10), excelRead(1, 11));
		AddactPagemethod2.Selecthotel();

		
		// If you don't want to use extends BaseClass, you can use below method
//		AddactPagemethod2.login(BaseClass.excelRead(1, 2), BaseClass.excelRead(1, 3));
//		AddactPagemethod2.Searchhotel(BaseClass.excelRead(1, 4), BaseClass.excelRead(1, 5), BaseClass.excelRead(1, 6), BaseClass.excelRead(1, 7), BaseClass.excelRead(1, 8), BaseClass.excelRead(1, 9), BaseClass.excelRead(1, 10), BaseClass.excelRead(1, 11));
//		

		
	}

}
