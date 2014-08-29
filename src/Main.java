import java.util.Scanner;


public class Main {
	
	public Scanner scan;
	
	Main(){
		scan = new Scanner(System.in);
	}
	
	public void start(){
		
		try{
			System.out.println("TYPE BEGIN to start or EXIT to quit");
			String answ = scan.nextLine();
			
			if(answ.equalsIgnoreCase("begin")){
				begin();
			}
			else{
				System.exit(0);
			}
		} catch(Exception e){
			start();
		}
	}
	
	public void begin(){
		
	}
	public static void main(String... args){
		Main main = new Main();
		main.start();
	}
}
