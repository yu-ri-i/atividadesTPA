import java.util.Scanner;
public class ExercFatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 3; 
		int i, a[], b[], c[], i2, x = 0, iguais=0;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o um número para A:");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o digite um número para B:");
			b[i] = in.nextInt();
		}
		
		
		System.out.print("A = "); 
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
		
		System.out.println("\n");
		
		System.out.print("B = "); 
			for(i=0;i<TAM;i++) {
				System.out.print(b[i]+" ");
			}
		
		System.out.println("\n");
		System.out.print("A ∩ B = "); 
		
		for(i=0; i<TAM; i++) {
			for (i2=0; i2<TAM; i2++) {
				if (a[i] == b[i2]) {
					iguais++;
				}
				
			}
		}
		
		if (iguais == 0) {
			System.out.println("Não há valores iguais, o vetor C está vazio");
		}else {
			for(i=0; i<TAM; i++) {
				for (i2=0; i2<TAM; i2++) {
					if (a[i] == b[i2]) {
						c[x] = a[i];
						System.out.print(c[x]+" ");
						x++;
					}
					
				}
			}
			
		}
	}
}
