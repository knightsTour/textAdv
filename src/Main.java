import java.util.Scanner;


public class Main {
	
	public Scanner scan;
	
	Main(){
		scan = new Scanner(System.in);
	}
	
	public void askName(){
		System.out.println("Hello! What's your name?");
		String name;
		
		StringBuffer sB = new StringBuffer();
		
		try{
			name = scan.nextLine();
			sB.append(name).reverse();
			System.out.println("Hello " + sB.toString());
		} catch(Exception e){
			askName();
		}
	}
	
	public static void main(String... args){
		Main main = new Main();
		main.askName();
	}
}
