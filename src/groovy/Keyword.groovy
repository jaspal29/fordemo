package groovy

class Keyword {
	def date;
	def driver;
	def utill=new Utility();
	public void getInfo(closure)
	{
		closure.call(driver,utill);
		
	}
	
	
		
		
	}
	


