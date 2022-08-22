package br.com.usjt.menezes;

import br.com.usjt.menezes.Fila;

public class Main {
    public static void main(String[] args) {

        //LogicaProgramacaoA8 logicaProgramacaoA8 = new LogicaProgramacaoA8();
       // LogicaProgramacaoA12 logicaProgramacaoA12 = new LogicaProgramacaoA12();
        //logicaProgramacaoA8.Exercicio41(20);
        //logicaProgramacaoA8.Exercicio42(20);
        //logicaProgramacaoA8.Exercicio46(1,20);
        //logicaProgramacaoA8.Exercicio48(10,7);
        //logicaProgramacaoA8.Exercicio41(5);
        /*Fila fila = new Fila(3);
        fila.setIdades(0,10);
        fila.setIdades(1,21);
        fila.setIdades(2,31);
        fila.getIdade(0);
        System.out.println(fila.maiorIdade());
        System.out.println(fila.IdadesImpares());
        fila.trocaIdades(1,2);*/

        Acao acao = new Acao(3);
        acao.setCotacoes(0,10);
        acao.setCotacoes(1,21);
        acao.setCotacoes(2,31);
        System.out.println(acao.getCotacoes(0));
        System.out.println(acao.CalculaMedia());
        System.out.println(acao.CotacaoMaiorMedia());


    }
}