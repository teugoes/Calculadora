package Entidades;

//import java.io.*;
import java.util.Scanner;
public class Calculadora {
	
	public static void main(String[] args) {
		
		float numA, numB, result;
		int operacao;
		Scanner ler = new Scanner(System.in); //por causa disso tudo vai ser string
		
		System.out.println("***Calculadora Matthewzinho de Luxo***");
		System.out.println("- Ol�, meu nome � Matt e esta calculadora possui quatro BELAS opera��es!");
		System.out.println("- Deseja realizar uma soma (aperte 1), subtra��o (aperte 2), multiplica��o (aperte 3) ou divis�o (aperte 4)? (qualquer outro valor que voc� inserir ser� desconsideradoh)");
		operacao = ler.nextInt();
		if (operacao > 4 || operacao < 0) {
			System.out.println("Eu falei que qualquer outro valor ser� desconsiderado, maricona!");
		}
		else {
			System.out.println("Insira o primeiro valor: ");
			numA = ler.nextFloat(); //converte o que t� em "ler" pra float		
			System.out.println("Insira o segundo valor: ");
			numB = ler.nextFloat();
			
			//criar objeto
			Operacoes calcula = new Operacoes();
			
			switch(operacao) {
				case 1:{
					result = calcula.adicao(numA, numB);
					System.out.println("A soma entre esses dois valores �: " + result);
					break;
				}
				
				case 2:{
					result = calcula.subtracao(numA, numB);
					System.out.println("A subtracao entre esses dois valores �: " + result);
					break;
				}
				case 3:{
					result = calcula.multiplicacao(numA, numB);
					System.out.println("A multiplicacao entre esses dois valores �: " + result);
					break;
				}
				case 4:{
					result = calcula.divisao(numA, numB);
					System.out.println("A divisao entre esses dois valores �: " + result);
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
