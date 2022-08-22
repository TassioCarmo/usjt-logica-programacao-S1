package br.com.usjt.menezes;

import java.util.Scanner;

public class LogicaProgramacaoA9 {

    Scanner scanner = new Scanner(System.in);

    public void Exercicio41() {

        double soma = 0;
        double numero;

        do {
            System.out.println("digite um numero");
            numero = scanner.nextDouble();
            if (numero != -999) {
                soma += numero;
            }

        }

        while (numero != -999);

        System.out.println("a soma de todos os numeros ate agora foi de: " + soma);

    }

    public void Exercicio42() {

        double soma = 0;
        double numero;
        int contador = 0;
        double media;

        do {
            System.out.println("digite um numero");
            numero = scanner.nextDouble();

            soma += numero;
            contador++;

        }

        while (numero != 0);

        media = soma / contador;

        System.out.println("A media dos numeros digitados �:" + media);

        System.out.println("a soma de todos os numeros ate agora foi de: " + soma);

    }

    public void Exercicio43() {

        int soma = 0;
        int numero;

        do {
            System.out.println("digite um numero");
            numero = scanner.nextInt();

            if (numero % 7 == 0) {
                soma += (numero * numero);
            }

        }

        while (numero != 0);

        System.out.println("a soma de todos os numeros ate agora foi de: " + soma);

    }

    public void Exercicio44() {

        int senha = 1786;
        int numero;
        int tentativa = 0;

        do {
            System.out.println("digite a senha");
            numero = scanner.nextInt();

            if (numero == senha) {
                System.out.println("Bom dia! Seja bem-vindo.");
                break;
            } else {
                System.out.println("Acesso negado! Senha inv�lida");
                tentativa++;
            }

        }

        while (tentativa <= 3);

    }

    public void Exercicio45() {

        int quantidade;
        double preco;
        double totalPagar = 0;

        do {
            System.out.println("digite um quantidade");
            quantidade = scanner.nextInt();
            System.out.println("digite um preco");
            preco = scanner.nextDouble();
            if (quantidade < 0 || preco < 0) {

                System.out.println("Erro Digite um numero valido");

            } else {

                totalPagar += (preco * quantidade);

            }

        }

        while (quantidade != 0);
        System.out.println("O valor total a pagar �:" + totalPagar);

    }

    public void Eercicio46() {

        int eleitores = 0;
        int numero;
        int canditato1 = 0;
        int canditato2 = 0;
        int canditato3 = 0;
        int canditato4 = 0;

        do {
            System.out.println("digite o candidato que voce ira votar");
            numero = scanner.nextInt();
            if (numero != -1) {
                if (numero == 1) {
                    canditato1++;
                } else if (numero == 2) {
                    canditato2++;
                } else if (numero == 3) {
                    canditato3++;
                } else if (numero == 4) {
                    canditato4++;
                } else {
                    System.out.println("digite um candidato valido");
                }

                eleitores++;
            }

        } while (numero != -1);


        System.out.println(canditato1);

        System.out.println("O percentual de votos do candidato 1 �:" + (canditato1 / (double) eleitores) * 100 + "%");

        System.out.println("O percentual de votos do candidato 2 �:" + (canditato2 / (double) eleitores) * 100 + "%");
        System.out.println("O percentual de votos do candidato 3 �:" + (canditato3 / (double) eleitores) * 100 + "%");
        System.out.println("O percentual de votos do candidato 4 �:" + (canditato4 / (double) eleitores) * 100 + "%");

        System.out.println("Participaram da vota��o " + eleitores + " eleitores");

    }

    public void Exercicio47() {

        int numero;
        double primeiroNumero;
        double segundoNumero;
        do {
            System.out.println("digite o numero da calculdora");
            numero = scanner.nextInt();
            System.out.println("digite o primeiro numero");
            primeiroNumero = scanner.nextDouble();
            System.out.println("digite o primeiro numero");
            segundoNumero = scanner.nextDouble();
            if (numero == 1) {

                System.out.println("A Adi��o dos valores � " + (primeiroNumero + segundoNumero));

            } else if (numero == 2) {
                System.out.println("A Subtra��o dos valores � " + (primeiroNumero - segundoNumero));
            } else if (numero == 3) {
                System.out.println("A Multiplica��o dos valores � " + (primeiroNumero - segundoNumero));
            } else if (numero == 4) {
                System.out.println("A Divis�o dos valores � " + (primeiroNumero - segundoNumero));
            } else {
                System.out.println("digite um candidato valido");
            }

        }

        while (numero != 9);
    }

}


