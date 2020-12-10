import java.util.Scanner;
public class ExercTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int E = 5;
		int i, r, i2, a[];
		
		a = new int[E];
		
		
		for(i2=0; i2<=4; i2++) {
			System.out.println("Insira um número para obter sua tabuada:");
			a[i2] = in.nextInt();
			
			for (i=0; i<=10; i++) {
			r = a[i2]*i;
			System.out.println(a[i2]+"x"+i+ " = "+r);
			
			}
		}
	}

}
