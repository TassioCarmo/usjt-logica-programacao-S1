package br.com.usjt.menezes;

import java.util.Scanner;

public class LogicaProgramacaoA5A6 {

    public void Exercicio41(double numero) {

        if (numero < 0) {
            System.out.println("positivo�,");

        } else {
            System.out.println("n�o-positivo");
        }

    }

    public void Exercicio42(int numero) {

        if (numero % 2 == 0) {
            System.out.println("Par");

        } else {
            System.out.println("Impar");
        }

    }

    public void Exercicio43(double primeiroNumero, double segundoNumero, double terceiroNumero) {

        if (primeiroNumero >= segundoNumero && segundoNumero >= terceiroNumero) {

            System.out.println("O maior numero é o primeiro numero: " + primeiroNumero);

        }
        if (segundoNumero >= primeiroNumero && primeiroNumero >= terceiroNumero) {

            System.out.println("O maior numero é o segundo numero: " + segundoNumero);
        } else {
            System.out.println("O maior numero é o terceiro numero: " + terceiroNumero);
        }

    }

    public void Exercicio44(double primeiroNumero, double segundoNumero, double terceiroNumero) {

        if (primeiroNumero <= segundoNumero && segundoNumero <= terceiroNumero) {

            System.out.println("A ordem crescentes dos numeros é " + primeiroNumero + " , " + segundoNumero + " , " + terceiroNumero);

        } else if (primeiroNumero <= terceiroNumero && terceiroNumero <= segundoNumero) {

            System.out.println("A ordem crescentes dos numeros é " + primeiroNumero + " , " + terceiroNumero + " , " + segundoNumero);

        } else if (segundoNumero <= primeiroNumero && primeiroNumero <= terceiroNumero) {

            System.out.println("A ordem crescentes dos numeros é " + segundoNumero + " , " + primeiroNumero + " , " + terceiroNumero);

        } else if (segundoNumero <= terceiroNumero && terceiroNumero <= primeiroNumero) {

            System.out.println("A ordem crescentes dos numeros é " + segundoNumero + " , " + terceiroNumero + " , " + primeiroNumero);

        } else if (terceiroNumero <= primeiroNumero && primeiroNumero <= segundoNumero) {

            System.out.println("A ordem crescentes dos numeros é " + terceiroNumero + " , " + primeiroNumero + " , " + segundoNumero);

        } else {

            System.out.println("A ordem crescentes dos numeros é " + terceiroNumero + " , " + segundoNumero + " , " + primeiroNumero);

        }
    }

    public void Exercicio45(double redimentoAnual) {

        double aliquota;
        double imposto;

        if (redimentoAnual <= 1200) {

            aliquota = 0;
            imposto = redimentoAnual * (aliquota/100);
            System.out.println("O valor do impost a ser pago é R$ " + imposto);

        } else if (redimentoAnual > 1200 && redimentoAnual <= 2300) {

            aliquota = 7.5;
            imposto = redimentoAnual * (aliquota/100);
            System.out.println("O valor do impost a ser pago é R$ " + imposto);

        } else if (redimentoAnual > 2300 && redimentoAnual <= 3700) {

            aliquota = 12.5;
            imposto = redimentoAnual * (aliquota/100);
            System.out.println("O valor do impost a ser pago é R$ " + imposto);

        } else if (redimentoAnual > 3700 && redimentoAnual <= 5100) {

            aliquota = 17.5;
            imposto = redimentoAnual * (aliquota/100);
            System.out.println("O valor do impost a ser pago é R$ " + imposto);

        } else {

            aliquota = 27.5;
            imposto =  redimentoAnual * (aliquota/100);
            System.out.println("O valor do impost a ser pago é R$ " + imposto);

        }

        imposto = redimentoAnual * aliquota / 100;
        System.out.println("O imposto a ser paga �: " + imposto);

    }

    public void Exercicio46(double altura, double massa) {

        double imc = massa / (altura * altura);

        if (imc < 20) {

            System.out.println("Com o imc de"+ imc +"Voce esta Abaixo do peso.;");

        } else if (imc >= 20 && imc < 25) {

            System.out.println("Com o imc de"+ imc +"Voce esta com o Peso normal");

        } else if (imc >= 25 && imc < 30) {

            System.out.println("Com o imc de"+ imc +"Voce esta com exceso de peso.�;");
        } else if (imc >= 30 && imc < 35) {

            System.out.println("Com o imc de"+ imc +"voce esta com Obesidade");
        } else {

            System.out.println("Com o imc de"+ imc +"Voce esta com Obesidade morbida");
        }
    }

    public void Exercicio47(double placa) {

        if (placa < 1000 && placa >= 10000) {

            System.out.println("erro placa invalida");

        } else{
            if (placa % 10 == 1 || placa % 10 == 2) {

            } else if (placa % 10 == 1 || placa % 10 == 2) {

                System.out.println("Finais 1 � 2, rod�zio �s segundas;");

            } else if (placa % 10 == 3 || placa % 10 == 4) {

                System.out.println("Finais 3 � 4, rod�zio �s ter�as");

            } else if (placa % 10 == 5 || placa % 10 == 6) {

                System.out.println("Finais 5 � 6, rod�zio �s quartas;");

            } else if (placa % 10 == 7 || placa % 10 == 8) {

                System.out.println("Finais 7 � 8, rod�zio �s quintas");

            } else if (placa % 10 == 9 || placa % 10 == 0) {

                System.out.println("Finais 9 � 0, rod�zio �s sextas.");

            }

        }
    }

    public void Exercicio48(int numeroDePessoas, int numeroDeDias) {
        double precoTotal;
        if (numeroDePessoas < 0 || numeroDeDias < 0 ) {
            System.out.println("Erro numeros negativos de pessoas � negativo");

        }

        if (numeroDePessoas >= 1 && numeroDePessoas <= 4) {

            precoTotal = 110 / (numeroDePessoas * numeroDeDias);

        } else if (numeroDePessoas >= 5 && numeroDePessoas <= 8) {

            precoTotal = 105 / (numeroDePessoas * numeroDeDias);
        } else {

            precoTotal = 95 / (numeroDePessoas * numeroDeDias);

        }

        System.out.println("Valor a ser pago pelo grupo � " + precoTotal);

    }

    public void Exercicio49(double primeiroNumero, double segundoNumero, double terceiroNumero) {

        double delta;
        double primeiraRaiz;
        double segundaRaiz;

        delta = segundoNumero * segundoNumero - 4 * primeiroNumero * terceiroNumero;
        if (delta < 0) {

            System.out.println("Delta "+ delta + " negativo, N�o existem ra�zes reais");

        }else {

            primeiraRaiz = (-segundoNumero - Math.sqrt(delta)) / (2 * primeiroNumero);
            segundaRaiz = (-segundoNumero + Math.sqrt(delta)) / (2 * primeiroNumero);

            System.out.println("A primeira raiz �: " + primeiraRaiz);
            System.out.println("A segunda raiz �: " + segundaRaiz);
        }
    }

    public void Exercicio410(double x) {

        double y;
        if (x == 4 || x == -4) {

            System.out.println("Erro divis�o por 0");
        } else {

            y = (5 * x + 3) / (Math.pow(x, 2)- 16);

            System.out.println("O valor de y �" + y);

        }

    }

    public void Exercicio411(int numero) {

        int unidade = numero % 10;
        int dezena = numero % 100 - unidade;
        int centena = numero % 1000 - dezena - unidade;
        int milhar = numero % 10000 - centena - dezena - unidade;

        if (milhar / 1000 == unidade && centena / 100 == unidade && dezena / 10 == unidade) {

            System.out.println("O numero: " + numero + " � pal�ndromo");

        } else {

            System.out.println("O numero: " + numero + " � n�o pal�ndromo");

        }
    }

    public void Exercicio412(double primeiroNumero, double segundoNumero, double terceiroNumero, double quartoNumero) {

        if (primeiroNumero <= segundoNumero && segundoNumero <= terceiroNumero && terceiroNumero <= quartoNumero) {

            System.out.println("O menor numero � " + primeiroNumero);

        } else if (segundoNumero <= primeiroNumero && primeiroNumero <= terceiroNumero
                && terceiroNumero <= quartoNumero) {

            System.out.println("O menor numero � " + segundoNumero);
        } else if (terceiroNumero <= segundoNumero && segundoNumero <= primeiroNumero
                && primeiroNumero <= quartoNumero) {
            System.out.println("O menor numero � " + terceiroNumero);
        } else {

            System.out.println("O menor numero � o: " + quartoNumero);
        }

    }

}


