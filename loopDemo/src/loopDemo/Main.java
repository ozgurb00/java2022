package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("For döngüsü bitti");
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i += 1;
		}
		
		System.out.println("While döngüsü bitti");
		
		int j = 100;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j += 2;
		} while(j < 10);
		
		System.out.println("Do-While döngüsü bitti.");

	}

}
