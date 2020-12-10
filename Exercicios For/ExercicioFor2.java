import java.util.Scanner;
public class ExercicioFor2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int id1=0, id2=0, id3=0, id4=0, id5=0, i, idade;
		float por1, por2, por3, por4, por5;
		for(i=0;i<=9;i++) {
		System.out.println("Insira a idade");
		idade = leia.nextInt();
			if(idade<=15) {
				id1++;
			} else if(idade>=16 && idade<31) {
				id2++;
			} else if(idade>=31 && idade<46) {
				id3++;
			} else if(idade>=46 && idade<61) {
				id4++;
			} else if(idade>=61) {
				id5++;
			};
			
		}
		
		por1 = (id1*100)/10;
		por2 = (id2*100)/10;
		por3 = (id3*100)/10;
		por4 = (id4*100)/10;
		por5 = (id5*100)/10;
		
		System.out.println("A porcentagem de pessoas abaixo de 15 anos é "+por1);
		System.out.println("A porcentagem de pessoas de 16 à 30 anos é "+por2);
		System.out.println("A porcentagem de pessoas de 31 à 45 anos é "+por3);
		System.out.println("A porcentagem de pessoas de 46 à 60 anos é "+por4);
		System.out.println("A porcentagem de pessoas com mais de 60 anos é "+por5);
	}

}