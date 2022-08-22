package br.com.usjt.menezes;

public class Acao {
    private double[] cotacoes;

    Acao(int tamanho) {
        cotacoes = new double[tamanho];
    }

    public double getCotacoes(int posicao) {
        return cotacoes[posicao];
    }

    public void setCotacoes(int posicao, double cotacao) {
        if (posicao >= 0) {
            cotacoes[posicao] = cotacao;
        } else {
            System.out.println("Numero negativo");
        }
    }

    public double CalculaMedia() {
        double media = 0;
        double soma = 0;
        for (int i = 0; i < cotacoes.length; i++) {
            soma += cotacoes[i];

        }
        media = soma / cotacoes.length;
        return media;
    }

    public double CotacaoMaiorMedia() {
        double cotacaoMaior = 0;
        for (int i = 0; i < cotacoes.length; i++) {
            if (cotacoes[i] > CalculaMedia()) {
                cotacaoMaior = cotacoes[i];
            }
        }
        return cotacaoMaior;
    }

    public double MenorCotacao() {
        double menorCotacao = cotacoes[0];
        for (int i = 0; i < cotacoes.length; i++) {
            if (cotacoes[i] < menorCotacao) {
                menorCotacao = cotacoes[i];
            }
        }
        return menorCotacao;
    }

    public int Posicao(double cotacao) {
        int posicao = 0;
        for (int i = 0; i < cotacoes.length; i++) {
            if (cotacao == cotacoes[i]) {
                posicao = i;
                return posicao;
            }

        }
        return -1;
    }

}


