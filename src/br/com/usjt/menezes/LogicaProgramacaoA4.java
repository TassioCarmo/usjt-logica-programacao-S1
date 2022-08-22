package br.com.usjt.menezes;

public class LogicaProgramacaoA4 {

    public void Exercicio41(double a, double b, double c) {
        double resultado = 2 * ((a - c) / 8) * b * 5;
        System.out.println(("O Resultado ta expressão: " + resultado));
    }

    public void Exercicio42(double raio) {
        double pi = 3.14159;
        double area = pi * raio * raio;
        double perimetro = 2 * pi * raio;
        System.out.println("A area é: " + area + "\nO perimetro é" + perimetro);

    }


    public void Exercicio43(int primeiroNumero, int segundoNumero) {

        if (primeiroNumero <= 0 || segundoNumero <= 0) {
            System.out.println("Erro digite um numero positivo");

        } else {

            int subtracao = primeiroNumero - segundoNumero;
            int adicao = primeiroNumero + segundoNumero;
            int divisao = primeiroNumero / segundoNumero;
            int multiplicacao = primeiroNumero * segundoNumero;
            System.out.println("Subtra��o: " + subtracao + "\nAdi��o: " + adicao + "\nMultiplica��o: " + multiplicacao
                    + "\nDivis�o: " + divisao);

        }

    }

    public void Exercicio44(double numero) {
        double calculo = numero * 0.04;
        System.out.println("4% do valor lido �: " + calculo);
    }

    public void Exercicio45(double salario) {

        double reajuste = salario * 1.07;
        System.out.println("o valor do salario apos o reajuste de 7% �: " + reajuste);

    }

    public void Exercicio46(int razao, int ordem, int primeiro) {

        double pa = primeiro + (ordem - 1) * razao;
        System.out.println("A P.A (progress�o aritm�tica) de " + ordem + "� �: " + pa);

    }

    public void Exercicio47(int razao, int ordem, int primeiro) {

        double pg = primeiro * Math.pow(razao, ordem - 1);
        System.out.println("A P.G (progress�o geom�trica)) de " + ordem + "� �: " + pg);

    }

    public void Exercicio48(double valorEmprestado, int periodo, double taxaDeJuros) {

        double valorFinal = valorEmprestado * Math.pow((1 + taxaDeJuros / 100), periodo);
        System.out.println("o valor a ser pago ao final do per�odo de " + periodo + " meses � de " + valorFinal);
    }
}
