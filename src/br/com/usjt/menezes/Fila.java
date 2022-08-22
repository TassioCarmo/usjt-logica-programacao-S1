package br.com.usjt.menezes;

public class Fila {

     private int[] idades;


    public Fila(int tamanho){
        idades = new int[tamanho];
    }

    public int getIdade(int posicao){
        return idades[posicao];
    }
    public void setIdades(int posicao,int idade){
        if( posicao >= 0 && posicao < idades.length && idade >=0)   {
            idades[ posicao ] = idade;
        }
    }

    public int maiorIdade(){
        int maiorIdade = 0;
        for(int i=0;i<idades.length;i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }
        return maiorIdade;
    }

    public int menorIdade(){
        int menor = idades[0];

        for (int i = 0; i<idades.length; i++){
            if (idades[i]<menor) {
                menor = idades[i];
            }
        }

        return menor;
    }

    public int IdadesImpares(){
        int numeroDeIdadesImpares = 0;
        for(int i=0;i<idades.length;i++) {
            if (idades[i] % 2 == 0) {

            } else {
                numeroDeIdadesImpares++;
            }
        }
        return numeroDeIdadesImpares;
    }

    public void  trocaIdades(int posicao1,int posicao2){
          int troca = idades[posicao1];
          idades[posicao1] = idades[posicao2];
          idades[posicao2] = troca;

          System.out.println(idades[posicao1]+" "+ idades[posicao2]);
    }


}
