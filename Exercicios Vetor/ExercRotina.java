import java.util.Scanner;
public class ExercRotina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], n;
		boolean analise = false;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira um número para o vetor A: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("A[] = ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n");
		System.out.println("Insira um número para ver se ele está presente no vetor A: ");
		n = in.nextInt();
		
		for (i=0; i<TAM; i++) {
            if (a[i]==n){
                analise = true ;
            }
        }
		
		if (analise){
            System.out.println("O número "+n+" foi encontrado no vetor A!");
        }else{
            System.out.println("O número "+n+" não foi encontrado no vetor A.");
        }
		
	}
}
