import java.util.Scanner;
public class ExercDiferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10; 
		int i, j, a[], b[], c[], x=0, diferenca=0;
		boolean igual = false; 
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o primeiro elemento de A:");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o primeiro elemento de B:");
			b[i] = in.nextInt();
		}
		
		System.out.print("")
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
	
		System.out.println("\n");
	
		System.out.print("B = "); 
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
	
	
		for(i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					igual = true;
				}
			}
			if (igual == false) {
				c[x] = a[i];
				x++;
				diferenca++; 
			}
			igual = false; 
		}
		
		System.out.println("\n");
		
		System.out.print("A-B = "); 
		for(i=0;i<x;i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
