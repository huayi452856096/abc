public class Test {  
	public String pub=¡±abc¡±;  
	private String pri=¡±abc¡±;  
	protected String pro=¡±abc¡±; 
	String def=¡±abc¡±; 
	public void a(){  
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	} 
	protected void a(){  
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	} 

	private void a(){  
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	} 

	void a(){  
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	} 

}

