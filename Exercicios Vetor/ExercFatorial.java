import java.util.Scanner;
public class ExercFatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 15; 
		int i, i2, fat = 1;
		long a[], b[];
		
		a = new long [TAM];
		b = new long [TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o primeiro número para obter seu fatorial:");
			a[i] = in.nextInt();
			
			for(i2=1; i2<=a[i]; i2++) {
				fat = fat*i2;
			}
			b[i] = fat;
			fat = 1;
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

	}
}

