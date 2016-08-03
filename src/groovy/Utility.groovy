package groovy

class Utility {
	
	def properties = new Properties()
	
	public Utility(){
	def propertiesFile = new File("C:\\Users\\jaspalchandramola\\Desktop\\MetaProgrammin\\NewApplication\\src\\page.property")
	propertiesFile.withInputStream {
		properties.load(it)
	}
	
	
	
	}
	
	public def returnLocator(args){
	
		properties.getProperty(args)
		
		}
	
	

}
