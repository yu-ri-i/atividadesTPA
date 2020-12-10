import java.util.Scanner;
public class ExercicioFor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i, n, r;
		System.out.println("Insira um número");
		n = leia.nextInt();
		
		for(i=0;i<=10;i++) {
			r = i*n;
			System.out.println(i+"x"+n+" = "+r);
		}

	}
}
