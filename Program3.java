import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		
        if(n<=2) {
			for(int i = 1; i<=n; i++) {
				if(i%2!=0) {
					System.out.println(i+" ");
				}
			}
		}
		
		else if(n>2) {
			for(int i = 3; i<=2*n; i++) {
				if(n%2==0&&n>0){
					
					
					if(i%2!=0) {
						
					     
					System.out.println(i-2+" ");
					}
					
					
				}
				else if(n%2!=0) {
					for(i = 1; i<=2*n; i++) {
					if(i%2!=0) {
						
					
					System.out.println(i+" ");
					}
					}
				}
			}

		}
		

	}

}
