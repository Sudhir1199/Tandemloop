import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 1; i<=2*n; i++) {
			if(i%2!=0) {
				System.out.println(i+" ");
			}
		}

	}

}
