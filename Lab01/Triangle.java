import java.util.Scanner;

public class Triangle {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input height n");
		int n = keyboard.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		keyboard.close();
	}
}