package org.PageMethod2;

import java.io.IOException;

import org.PageMethod.BaseClass;

public class AddactPageMethod2 {
	
	public static class AddactPagemethod2 extends BaseClass {
		
		// Login(String username, String password)
		public static void login(String username, String password ) throws IOException, InterruptedException {
			
			urlLaunch(excelRead(1, 1));
			maximize();
			Thread.sleep(2000);
			
			findElement("//input[@id='username']");
//			sendKeys(excelRead(1, 2)); 
			sendKeys(username);

			findElement("//input[@id='password']");
//			sendKeys(excelRead(1, 3));
			sendKeys(password);
			Thread.sleep(2000);
			
			findElement("//input[@id='login']");
			clicks();

		}
		
		public static void Searchhotel(String location, String hotels, String room_type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) throws IOException, InterruptedException {
			
			findElement("//select[@id='location']");
			sendKeys(location);
			Thread.sleep(1000);
			
			findElement("//select[@id='hotels']");
//			selectByvalue(excelRead(1, 5));
			sendKeys(hotels);
			Thread.sleep(1000);
			
			findElement("//select[@name='room_type']");
//			selectByVisibilText(excelRead(1, 6));
			sendKeys(room_type);
			Thread.sleep(1000);
			
			findElement("//select[@name='room_nos']");
			selectByVisibilText(room_nos);
			
			Thread.sleep(2000);
			findElement("//input[@id='datepick_in']");
			clear();
			sendKeys(datepick_in);
			
			Thread.sleep(2000);
			findElement("//input[@id='datepick_out']");
			clear();
			sendKeys(datepick_out);
			Thread.sleep(1000);
			
			findElement("//select[@name='adult_room']");
			selectByVisibilText(adult_room);
			Thread.sleep(1000);
			
			findElement("//select[@name='child_room']");
			selectByVisibilText(child_room);
			Thread.sleep(2000);
			
			findElement("//input[@id='Submit']");
			clicks();
			

		}
		
		public static void Selecthotel() throws InterruptedException {
			
			findElement("//input[@id='radiobutton_0']");
			clicks();
			Thread.sleep(2000);
			
			findElement("//input[@id='continue']");
			clicks();

		}
		
		public static void Booknow() throws IOException, InterruptedException {
			
			findElement("//input[@id='first_name']");
			sendKeys(excelRead(1, 12));
			
			findElement("//input[@id='last_name']");
			sendKeys(excelRead(1, 13));
			
			findElement("//textarea[@id='address']");
			sendKeys(excelRead(1, 14));
			
			findElement("//input[@id='cc_num']");
			sendKeys(excelRead(1, 15));
			
			findElement("//select[@id='cc_type']");
			selectByvalue(excelRead(1, 16));
			
			findElement("//select[@id='cc_exp_month']");
			selectByVisibilText(excelRead(1, 17));
			
			findElement("//select[@id='cc_exp_year']");
			selectByVisibilText(excelRead(1, 18));
			
			findElement("//input[@id='cc_cvv']");
			sendKeys(excelRead(1, 19));
			Thread.sleep(2000);
			
			findElement("//input[@id='book_now']");
			clicks();
			Thread.sleep(6000);
			

		}
		
		public static void Bookingconfirm() throws IOException, InterruptedException {
			
			findElement("//input[@id='order_no']");
			getAttributes();
			takesScreenShot();
			Thread.sleep(2000);
			
			findElement("//input[@id='logout']");
			clicks();
			
			//quit();

		}
		
		public static void logout() {
			
			quit();
		
		}
		
		// if we make all the above method static. We don't need to create another class or method. we can do as below.
		
//		public static void main(String[] args) {
//			login();
//			Searchhotel();
			
		}
		
	}

