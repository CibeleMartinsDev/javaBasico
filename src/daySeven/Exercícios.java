package daySeven;

import dayOne.Calculadora;

import java.util.Scanner;

public class Exercícios {

    public void showNumbers(){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Double valor1 = input1.nextDouble();
        System.out.println("Digite mais um número: ");
        Double valor2 = input2.nextDouble();
        System.out.println("Números informados: " + valor1 + " " + valor2);
    }

    public void makeQuestions(){
        Scanner input = new Scanner(System.in);
        Scanner inputDivisao = new Scanner(System.in);
        Scanner inputRange = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Double number = input.nextDouble();
        System.out.println("Esse número dividido por dois resulta em? ");
        Double respostaDivisao = inputDivisao.nextDouble();
        Double resultadoDivisao = Calculadora.dividir(number, 2);
        if (resultadoDivisao == respostaDivisao) {
            System.out.println("Você acertou! :D");
        } else if (resultadoDivisao != respostaDivisao) {
            System.out.println("Você errou. :(");
        }
    }
}
