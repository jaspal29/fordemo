package groovy;

import org.openqa.selenium.firefox.FirefoxDriver
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;

public class NewTest {
	def key;
	@BeforeTest
	public void beforeTest() {
		
		key=new Keyword();
		key.setDriver(new FirefoxDriver())
	}
  @Test
  public void dayTest() {  
	  def day={driver,utill->		  
		  driver.get("C:\\Users\\jaspalchandramola\\Desktop\\first.html")
		  driver.findElement(By.id(utill.returnLocator("dayButton"))).click()
		  def str=driver.findElement(By.id(utill.returnLocator("dayTextField"))).getText()  
		  println utill.returnLocator(str);
		  println new Date().day;
		  assert utill.returnLocator(str)!=new Date().day;
		  		  
	  }
	  key.getInfo(day)	  
	  
	  }
	  
	 @Test
	 public void  monthTest(){
	  def month={driver,utill->		  
		  driver.get("C:\\Users\\jaspalchandramola\\Desktop\\first.html")
		  driver.findElement(By.id(utill.returnLocator("monthButton"))).click()
		  def str=driver.findElement(By.id(utill.returnLocator("monthTextField"))).getText()
		  println utill.returnLocator(str);
		  println new Date().month;
		  assert utill.returnLocator(str)!=new Date().month;
						
	  }
	  key.getInfo(month)
	
	  
	  }
	  
	 @Test 
	 public void yearTest(){	 
	  def year={driver,utill->		  
		  driver.get("C:\\Users\\jaspalchandramola\\Desktop\\first.html")
		  driver.findElement(By.id(utill.returnLocator("yearButton"))).click()
		  def str=driver.findElement(By.id(utill.returnLocator("yearTextField"))).getText()
		  println str;
		  println 1900+new Date().year;
		   assert str!=(1900+new Date().year)
	
	  }
	  key.getInfo(year)
	  
	
	 }
	  
/*	
 *  @Test 
	 public void hourtest(){
	 def hour={driver,utill->
		  
		  driver.get("C:\\Users\\jaspalchandramola\\Desktop\\first.html")
		  driver.findElement(By.id(utill.returnLocator("hourButton"))).click()
		  def str=driver.findElement(By.id(utill.returnLocator("hourTextField"))).getText()
		  assert str!=(1900+new Date().hour)
		
	  }
	  key.getInfo(hour)
	 
			  
  }
  */

}
