package Entidades;

//import java.io.*;
import java.util.Scanner;
public class Calculadora {
	
	public static void main(String[] args) {
		
		float numA, numB, result;
		int operacao;
		Scanner ler = new Scanner(System.in); //por causa disso tudo vai ser string
		
		System.out.println("***Calculadora Matthewzinho de Luxo***");
		System.out.println("- Olá, meu nome é Matt e esta calculadora possui quatro BELAS operações!");
		System.out.println("- Deseja realizar uma soma (aperte 1), subtração (aperte 2), multiplicação (aperte 3) ou divisão (aperte 4)? (qualquer outro valor que você inserir será desconsideradoh)");
		operacao = ler.nextInt();
		if (operacao > 4 || operacao < 0) {
			System.out.println("Eu falei que qualquer outro valor será desconsiderado, maricona!");
		}
		else {
			System.out.println("Insira o primeiro valor: ");
			numA = ler.nextFloat(); //converte o que tá em "ler" pra float		
			System.out.println("Insira o segundo valor: ");
			numB = ler.nextFloat();
			
			//criar objeto
			Operacoes calcula = new Operacoes();
			
			switch(operacao) {
				case 1:{
					result = calcula.adicao(numA, numB);
					System.out.println("A soma entre esses dois valores é: " + result);
					break;
				}
				
				case 2:{
					result = calcula.subtracao(numA, numB);
					System.out.println("A subtracao entre esses dois valores é: " + result);
					break;
				}
				case 3:{
					result = calcula.multiplicacao(numA, numB);
					System.out.println("A multiplicacao entre esses dois valores é: " + result);
					break;
				}
				case 4:{
					result = calcula.divisao(numA, numB);
					System.out.println("A divisao entre esses dois valores é: " + result);
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
