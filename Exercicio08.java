package Exercicios;
//8) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis
// A, B, C e D
//). Ao final o programa deve apresentar o resultado do produto (vari�vel P) do primeiro com o terceiro valor,
//e o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado da soma (vari�vel S)
//do segundo com o quarto valor. package Exercicios;
import java.util.Scanner;

public class Exercicio08 {
	
public static void main (String[]args){	
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite o primeiro valor");
double valor1= sc.nextInt();

System.out.println("Digite o segundo valor");
double valor2= sc.nextInt();

System.out.println("Digite o terceiro valor");
double valor3= sc.nextInt();

System.out.println("Digite o quarto valor");
double valor4= sc.nextInt();

double produto ;
produto = valor1*valor3 ;

double soma;
soma = valor2 + valor4;

System.out.println(" O produto (vari�vel P) do primeiro com o terceiro valor:" + produto);
System.out.println("O resultado da soma (vari�vel S) do segundo com o quarto valor" + soma);

}} 



