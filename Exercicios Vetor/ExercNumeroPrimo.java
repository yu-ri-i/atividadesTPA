import java.util.Scanner;
public class ExercNumeroPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 10; 
		int i, a[], j, resto0= 0;
		
		a = new int[E];
		
		for(j=0; j<E; j++) {
			System.out.println("Insira um número e veja se ele é primo ou não:");
			a[j] = in.nextInt();
			
			for (i=1; i<a[j]; i++) {
				if (a[j] % i == 0) {
					resto0++;
				}
			}
		
			if (a[j] == 1) {
				System.out.println("O número "+a[j]+" NÃO é primo.");
			} else if (resto0 <=2) {
				System.out.println("O número "+a[j]+" é primo!");
			} else {
				System.out.println("O número "+a[j]+" NÃO é primo!");
			}
			resto0 = 0;
		}
		in.close();
		
	}

}
