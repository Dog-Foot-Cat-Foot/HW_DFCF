//Eunji Q1
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		for(int i = 0; i < w; i++) {
			for(int j =0; j< h; j++) {
				if((i == 0 && j ==0)||(i==0&&j==h-1)||
						(i==w-1&&j==0)||(i==w-1&&j==h-1)) 
					System.out.print("+");
				else if(i == 0 || i==w-1)
					System.out.print("-");
				else if(j==0|| j== h-1) 
					System.out.print("|");
				else
					System.out.print(" ");		
			}
			System.out.println();
			System.out.println();
		}
	}
}

//Eunji Q2
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j <6; j++)
				System.out.print(j + " * " + i + " = " + (j*i) +"\t");
			System.out.println();
		}	
	}
}

