import java.util.Scanner; 
public class score { 
	public static void main(String[] args) { 
		Scanner x = new Scanner(System.in); 
		System.out.println("������ɼ�"); 

		int a=x.nextInt();  
		int n=a/10; 
		switch(n){ 
			case 10: 
			case 9: 
			System.out.println("��"); 
			break; 
			case 8: 
			System.out.println("��"); 
			break; 
			case 7: 
			System.out.println("��"); 
			break; 
			case 6: 
			System.out.println("����"); 
			break; 
			case 5: 
			case 4: 
			case 3: 
			case 2: 
			case 1: 
			case 0: 
			System.out.println("������"); 
			break; 
			default:System.out.println(" ������һ����ȷ�ĳɼ�"); 
		} 
	} 
} 
