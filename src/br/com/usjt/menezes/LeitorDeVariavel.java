package br.com.usjt.menezes;

import java.util.Scanner;

public class LeitorDeVariavel {

    Scanner scan;

    public LeitorDeVariavel(Scanner scan) {
        this.scan = scan;
    }

    public void lerNumeroReal(){
        System.out.println();
        double numero = scan.nextDouble();
        // Do something

    }

}
