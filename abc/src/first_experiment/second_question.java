import java.util.Scanner; 
public class score { 
	public static void main(String[] args) { 
		Scanner x = new Scanner(System.in); 
		System.out.println("请输入成绩"); 

		int a=x.nextInt();  
		int n=a/10; 
		switch(n){ 
			case 10: 
			case 9: 
			System.out.println("优"); 
			break; 
			case 8: 
			System.out.println("良"); 
			break; 
			case 7: 
			System.out.println("中"); 
			break; 
			case 6: 
			System.out.println("及格"); 
			break; 
			case 5: 
			case 4: 
			case 3: 
			case 2: 
			case 1: 
			case 0: 
			System.out.println("不及格"); 
			break; 
			default:System.out.println(" 请输入一个正确的成绩"); 
		} 
	} 
} 
