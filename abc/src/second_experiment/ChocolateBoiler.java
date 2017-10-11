public class Boiler {  
	private boolean empty;  
	private boolean boiled;  
	public void fill(){  
		if( isEmpty() ){    
			empty =false;   
			boiled = true; 
		} 
	} 
	public String drain(){  
		if( !isEmpty()&&isBoiled() ){    
			empty = true; 
			return "已经煮好了"; 
		}else return "还未煮好"; 
		public void boil(){   
			if( !isEmpty()&&!isBoiled() ){    
				boiled = true; 
			} 
		} 
		public boolean isEmpty(){   
			return empty; 
		} 
		public boolean isBoiled(){   
			return boiled;  
		} 
	}
}
