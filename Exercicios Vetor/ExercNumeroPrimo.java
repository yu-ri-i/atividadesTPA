import java.util.Scanner;
public class ExercNumeroPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 10; 
		int i, a[], i2, r=0;
		
		a = new int[E];
		
		for(i2=0; i2<E; i2++) {
			System.out.println("Digite um número para verificar se ele é primo ou não:");
			a[i2] = in.nextInt();
			
			for (i=1; i<a[i2]; i++) {
				if (a[i2] % i == 0) {
					r++;
				}
			}
		
			if (a[i2] == 1) {
				System.out.println("O número "+a[i2]+" não é primo.");
			} else if (r<=2) {
				System.out.println("O número "+a[i2]+" é primo");
			} else {
				System.out.println("O número "+a[i2]+" não é primo");
			}
			r=0;
		}
		
	}

}
