import java.util.Scanner;
public class ExercicioFor3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, i;
        double altura, somaAltura = 0, alturaX = 0, peso;
        int idadeX = 0, pesoX = 0;
        
        for(i=0;i<11;i++){
            System.out.println("Digite uma idade");
            idade = leia.nextInt();
            
            System.out.println("Digite uma altura");
            altura = leia.nextDouble();
            
            System.out.println("Digite um peso");
            peso = leia.nextDouble();
            
            if(idade > 50){
                idadeX++; 
            }
            
            if( (idade >= 10) && (idade <= 20) ){
                alturaX++;   
                somaAltura = altura + somaAltura; 
            }
            
            if(peso < 40){
                pesoX++;   
            }
           
            System.out.println("\n");
        };
        
        if(idadeX > 0){
            System.out.println("Qntde de pessoas com idade acima de 50 anos: " + idadeX + "\n");
        } else{
            System.out.println("Nenhuma pessoa tem acima de 50 anos \n");
        }
        
        if(alturaX > 0){
            System.out.println("A média de pessoas entre 10 e 20 anos é: " + (somaAltura / alturaX) + "\n");
        } else{
            System.out.println("Nenhuma pessoa tem idade entre 10 e 20 anos \n");
        }
        
        if(pesoX > 0){
            System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (pesoX * 100 / (i - 1)) + " %");
        } else{
            System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
        }
    }
}