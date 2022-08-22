

public class LogicaProgramacaoA8 {




    public void Exercicio41(int numero) {

        int contador = 0;
        int soma = 0;
        if(numero<0){
            System.out.println("Escreva um numaro positivo");
        }else{
            while(contador <= numero) {
                soma += contador;
                contador++;
            }

            System.out.println("A soma de todos os numeros ate "+ numero+ " é " + soma);
        }
    }

    public void Exercicio42(int numero) {

        int contador = 0;
        if(numero<0){
            System.out.println("Escreva um numaro positivo");
        }else {
            while (contador <= numero) {
                if (contador % 3 == 0) {
                    System.out.println(contador);

                }

                contador++;

            }
        }
    }

    public void Exercicio43() {

        for(int i=50;i>=1;i--) {

            System.out.println(i);

        }

    }

    public void Exercicio44() {
        for(int i=1;i<=20;i++) {

            System.out.println("O quadrado de: " + i + " � "+i*i);

        }

    }

    public void Exercicio45(int numero) {

        int soma = 0;
        if(numero <0) {

            System.out.println("Erro numero negativo");


        }else {
            for(int i = 0;i<=numero;i++) {
                soma += (i*i);
                System.out.println("A soma quadrado de: "+ i + " � " +soma);

            }

        }
    }

    public void Exercicio46(int primeiro,int razao) {

        int progressaoAritmetica;

        for(int i = 1;i<=25;i++) {
            progressaoAritmetica = primeiro + (i - 1 ) * razao;
            System.out.println("A progress�o aritmetica de " + i + " � " + progressaoAritmetica);
        }


    }

    public void Exercicio47(int primeiro,int razao) {

        int progressaoGeometrica;

        for(int i = 1;i<=25;i++) {
            progressaoGeometrica = (int) (primeiro * (Math.pow(razao , (i-1))));
            System.out.println("A progress�o Geometrica de " + i + " � " + progressaoGeometrica);
        }


    }

    public void Exercicio48(double a,double n){
        if(n<0){
            System.out.println("Erro numero negativo");
        }else{
            for (int i=0;i<=n;i++){
                System.out.println(Math.pow(a,i));
            }
        }
    }
    public void Exercicio49(double a,double n){
        if(n>0){
            System.out.println("Erro numero positivo");
        }else{
            for (int i=0;i>=n;i--){
                System.out.println(Math.pow(a,i));
            }
        }
    }
    public void Exercicio410(int fatorial){

        int resultado =1;
        if(fatorial<=0){
            System.out.println("Erro numero negativo");
        }else{
            for (int i=1;i<=fatorial;i++){
               resultado *= i;
               System.out.println(resultado);
            }
            System.out.println(resultado);
        }
    }


    public void Exercicio411(double numero) {

        int contador=1;

        double maior = Double.MIN_VALUE;
        while(contador <= 25)
        {
            System.out.println("digite um numero  ");


            if(numero >= maior) {

                maior = numero;
            }

            contador++;
        }
        System.out.println("O menor valor �"+ maior);

    }
    public void Exercicio412(double numero) {

        int contador=1;

        double menor = Double.MAX_VALUE;
        while(contador <= 25)
        {
            System.out.println("digite um numero  ");


            if(numero <= menor) {

                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor valor �"+ menor);

    }

    public void Exercicio413(int numero) {


        int i = 1;
        int contador = 0 ;
        while(i <=25) {
            System.out.println("digite um numero  ");

            if(numero%7==0) {

                contador++;
            }

            i++;
        }
        System.out.println(contador);

    }

    public void Exercicio414(double numero) {

        double maior = Double.MIN_VALUE;
        int contador=0;
        while(contador<25) {

            System.out.println("Digite um numero inteiro");


            if(numero > maior) {

                maior = numero;
            }

            contador++;

        }
    }

    public void Exercicio415(double numero) {

        double menor = Double.MAX_VALUE;
        int contador=0;
        while(contador<25) {

            System.out.println("Digite um numero inteiro");


            if(numero < menor) {

                menor = numero;
            }

            contador++;

        }
    }

    public void Exercicio416( double numero) {
        double multiplosDeSete = 0;

        int contador=0;
        while(contador<20) {

            System.out.println("Digite um numero inteiro");


            if(numero%3==0) {

                multiplosDeSete++;
            }

            contador++;
        }

        System.out.println(multiplosDeSete);
    }

    public void exercicio14(double numero) {


        double soma =0;
        int contador=0;
        while(contador<30) {

            System.out.println("Digite um numero inteiro");


            if(numero < 0) {

                System.out.println(numero);
            }
            else {

                soma += numero;
            }

            contador++;
        }

        System.out.println("suma dos numeros positivos" + soma);
    }

    public void exercicio15(double numero) {


        double soma = 0;
        int contador=0;
        while(contador<30) {

            System.out.println("Digite um numero inteiro");


            if(numero > 0) {

                soma += 1/numero;

            }
            else {

                soma += numero;
            }

            contador++;
        }

        System.out.println("suma dos numeros positivos" + soma);


    }

}


