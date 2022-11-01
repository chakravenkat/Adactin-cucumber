package com.singleDesignPattern;

import org.openqa.selenium.WebDriver;

import com.pojo.BookHotel;
import com.pojo.BookedItenararyPage;
import com.pojo.BookingConfirmPage;
import com.pojo.LogInPage;
import com.pojo.MyItenararyPage;
import com.pojo.SearchHotel;
import com.pojo.SelectHotel;
import com.pojo.bookedItenaryPage;

public class PageObjectManager {
	public static WebDriver driver;

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public LogInPage getLogInPage() {
		LogInPage lp = new LogInPage(driver);
		return lp;
	}
	public bookedItenaryPage getbookedItenaryPage() {
		bookedItenaryPage bk=new bookedItenaryPage(driver);
		return bk;
	}
    public SelectHotel getSelectHotel() {
    	
    	SelectHotel sh= new SelectHotel(driver);
    	return sh;
    }
    public BookHotel getBookHotel() {
    	BookHotel bh=new BookHotel(driver)
;    	return bh;
    }
	public BookingConfirmPage getBookingConfirmPage() {
		BookingConfirmPage bc=new BookingConfirmPage(driver);
		return bc;
	}
	public BookedItenararyPage getBookedItenararyPage() {
		BookedItenararyPage bi=new BookedItenararyPage(driver);
		return bi;
	}
	public SearchHotel getSearchHotel() {
		SearchHotel sh=new SearchHotel(driver);
		return sh;
	}
	public MyItenararyPage getMyItenararyPage() {
		MyItenararyPage my=new MyItenararyPage(driver);
		return my;
	}
	
	
}
