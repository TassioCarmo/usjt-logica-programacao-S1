package br.com.usjt.menezes;

public class LogicaProgramacaoA7 {

    public void Exercicio41(String estadoSigla) {

        String estadoNome;

        switch (estadoSigla.toLowerCase()) {
            case "ac":
                estadoNome = "acriano";
                break;
            case "al":
                estadoNome = "alagoano";
                break;
            case "ap":
                estadoNome = "amapaense";
                break;
            case "am":
                estadoNome = "amazonense";
                break;
            case "ba":
                estadoNome = "baiano";
                break;
            case "ce":
                estadoNome = "cearense";
                break;
            case "df":
                estadoNome = "brasiliense";
                break;
            case "es":
                estadoNome = "espírito-santense";
                break;
            case "go":
                estadoNome = "goiano";
                break;
            case "ma":
                estadoNome = "maranhense";
                break;
            case "ms":
                estadoNome = "sul-mato-grossense";
                break;
            case "mt":
                estadoNome = "mato-grossense";
                break;
            case "mg":
                estadoNome = "mineiro";
                break;
            case "pa":
                estadoNome = "paraense";
                break;
            case "pb":
                estadoNome = "paraibano";
                break;
            case "pr":
                estadoNome = "paranaense";
                break;
            case "pe":
                estadoNome = "pernambucano";
                break;
            case "pi":
                estadoNome = "piauiense";
                break;
            case "rj":
                estadoNome = "fluminense ";
                break;
            case "rn":
                estadoNome = "norte-rio-grandense";
                break;
            case "rs":
                estadoNome = "gaúcho";
                break;
            case "ro":
                estadoNome = "rondoniano  ";
                break;
            case "rr":
                estadoNome = "roraimense";
                break;
            case "sc":
                estadoNome = "catarinense ";
                break;
            case "sp":
                estadoNome = "paulista ";
                break;
            case "se":
                estadoNome = "sergipano";
                break;
            case "to":
                estadoNome = "tocantinense";
                break;

            default:
                estadoNome = "Invalid month";
                break;
        }
        System.out.println(estadoNome);
    }

    public void Exercicio42(double primeiroNota, double segundoNota, double terceiroNota, double quartaNota) {

        double mediaAritmeticaSimples = (primeiroNota + segundoNota + terceiroNota + quartaNota) / 4;
        double mediaAritmeticaPonderada = (primeiroNota + 2 * segundoNota + 3 * terceiroNota + 4 * quartaNota) / 9;
        double mediaGeometrica = Math.pow(primeiroNota * segundoNota * terceiroNota * quartaNota, (1.0 / 4.0));
        double mediaHarmonica = 4/((1 / primeiroNota) + (1 / segundoNota) + (1 / terceiroNota) + (1 / quartaNota));
        ;
        System.out.println("A M�dia aritm�tica simples �: " + mediaAritmeticaSimples
                + "\nA M�dia aritm�tica ponderada �: " + mediaAritmeticaPonderada + "\nA M�dia geom�trica simples �: "
                + mediaGeometrica + "\nA M�dia harm�nica simples �:" + mediaHarmonica);

    }

    public void Exercicio43(String sexo, int idade) {

        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") && idade < 10 || idade > 65) {

                System.out.println("Valor = R$0,50;");

            } else if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") && idade >= 10 || idade <= 17) {

                System.out.println("Valor = R$ 4,28;");

            } else if (sexo.equalsIgnoreCase("f") && idade >= 18 || idade <= 65) {

                System.out.println("Valor = R$ 5,50;;");

            } else if (sexo.equalsIgnoreCase("m") && idade >= 18 || idade <= 65) {

                System.out.println("Valor = R$ 8,25;");

            }

        } else {
            System.out.println("Digite uma sigla valida");
        }

    }

    public void Exercicio44(int month) {

        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }

    public void Exercicio45(int indicePrato, int indiceSobremesa, int indiceBebida) {

        int valorCaloricoPrato;
        int valorCaloricoSobremesa;
        int valorCaloricoBebida;
        int valorCaloricoTotal;

        switch (indicePrato) {
            case 1:
                valorCaloricoPrato = 180;
                break;
            case 2:
                valorCaloricoPrato = 230;
                break;
            case 3:
                valorCaloricoPrato = 250;
                break;
            case 4:
                valorCaloricoPrato = 350;
                break;
            default:
                valorCaloricoPrato = 0;
                break;

        }
        switch (indiceSobremesa) {
            case 1:
                valorCaloricoSobremesa = 75;
                break;
            case 2:
                valorCaloricoSobremesa = 110;
                break;
            case 3:
                valorCaloricoSobremesa = 170;
                break;
            case 4:
                valorCaloricoSobremesa = 200;
                break;
            default:
                valorCaloricoSobremesa = 0;
                break;

        }
        switch (indiceBebida) {
            case 1:
                valorCaloricoBebida = 20;
                break;
            case 2:
                valorCaloricoBebida = 70;
                break;
            case 3:
                valorCaloricoBebida = 100;
                break;
            case 4:
                valorCaloricoBebida = 65;
                break;
            default:
                valorCaloricoBebida = 0;
                break;

        }

        valorCaloricoTotal = valorCaloricoPrato + valorCaloricoBebida + valorCaloricoSobremesa;

        System.out.println("O valor total de calorias �: " + valorCaloricoTotal);

    }

    public void Exercicio46(int primeiroLado, int segundoLado, int terceiroLado) {

        if ((primeiroLado + segundoLado) > terceiroLado || (terceiroLado + segundoLado) > primeiroLado
                || (terceiroLado + primeiroLado) > segundoLado) {

            System.out.println("� um triangulo");

        } else {

            System.out.println("N�o � um triangulo");

        }

    }

    public void Exercicio47(int primeiroLado, int segundoLado, int terceiroLado) {

        if (primeiroLado < 0 || segundoLado < 0 || terceiroLado < 0) {
            System.out.println("digite um numero positivo");

        } else {

            if ((primeiroLado + segundoLado) > terceiroLado || (terceiroLado + segundoLado) > primeiroLado
                    || (terceiroLado + primeiroLado) > segundoLado) {

                if (primeiroLado == segundoLado && segundoLado == terceiroLado) {

                    System.out.println("Triangulo  equilatero");

                } else if (primeiroLado != segundoLado && segundoLado != terceiroLado) {

                    System.out.println("Triangulo escaleno");

                } else {

                    System.out.println("triangulo is�sceles");

                }

            } else {

                System.out.println("n�o � triangulo");

            }
        }

    }

}


