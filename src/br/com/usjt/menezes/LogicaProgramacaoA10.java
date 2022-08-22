package br.com.usjt.menezes;

import java.util.Scanner;

public class LogicaProgramacaoA10 {
    Scanner scanner = new Scanner(System.in);

    public void Exercicio41() {

        double[] vetor = new double[10];
        double soma = 0;
        double numero;

        for(int i=0;i<vetor.length;i++) {

            System.out.println("Digite um numero inteiro");
            numero =  scanner.nextDouble();

            vetor[i] = numero;
            soma +=vetor[i];

        }

        System.out.println(soma/vetor.length);

    }

    public void Exercicio42() {

        int[] vetor = new int[5];
        int numero;

        for(int i=0;i<vetor.length;i++) {

            System.out.println("Digite um numero inteiro");
            numero =  scanner.nextInt();

            vetor[i] = numero;


        }

        for(int i = vetor.length-1; i >= 0 ; i--) {

            System.out.println(vetor[i]);
        }


    }

    public void Exercicio43() {

        double[] vetor = new double[15];
        double numero;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        for(int i=0;i<vetor.length;i++) {

            System.out.println("Digite um numero real");
            numero =  scanner.nextDouble();

            vetor[i] = numero;


        }

        for(int i=0;i<vetor.length;i++) {


            if(vetor[i]< menor) {

                menor = vetor[i];

            }
            if(vetor[i]>maior) {

                maior = vetor[i];

            }


        }

        System.out.println("Maior: " + maior +" Menor: " + menor);


    }

    public void Exercicio44() {

        double[] salariosVetor = new double[5];
        double salario;

        for(int i=0;i<salariosVetor.length;i++) {

            System.out.println("Digite um salario");
            salario =  scanner.nextDouble();

            salariosVetor[i] = salario;

        }

        for(int i=0;i<salariosVetor.length;i++) {


            if(salariosVetor[i]< 1500) {

                salariosVetor[i] = salariosVetor[i] * 1.08;
                System.out.println(salariosVetor[i]);

            }else {

                salariosVetor[i] = salariosVetor[i] * 1.05;
                System.out.println(salariosVetor[i]);
            }



        }

    }

    public void Exercicio45() {

        int[] primeiroVetor = new int[5];
        int[] segundoVetor = new int[5];
        int[] terceiroVetor = new int[5];
        int numero;

        for(int i=0;i<primeiroVetor.length;i++) {

            System.out.println("Digite um numero inteiro");
            numero =  scanner.nextInt();

            primeiroVetor[i] = numero;


        }
        for(int i=0;i<segundoVetor.length;i++) {

            System.out.println("Digite um numero inteiro");
            numero =  scanner.nextInt();

            segundoVetor[i] = numero;


        }

        for(int i=0;i<terceiroVetor.length;i++) {

            terceiroVetor[i] = primeiroVetor[i] + segundoVetor[i] ;

            System.out.println(terceiroVetor[i]);
        }


    }

    public void Exercicio46() {

        double[] vetor = new double[20];
        int impar = 0;
        int multiploSete = 0;
        int negativo=0;
        double numero;

        for(int i=0;i<vetor.length;i++) {

            System.out.println("Digite um numero inteiro");
            numero =  scanner.nextInt();

            vetor[i] = numero;

            if(vetor[i]<0) {

                impar++;

            }if(vetor[i]%2==0) {

                impar++;

            }if(vetor[i]%7==0) {

                multiploSete++;

            }


        }

        System.out.println("quandide de impares:" + impar + " quantidade de multiplos de sete: " + multiploSete +" quantidade de negatiovos" + negativo);


    }
}

