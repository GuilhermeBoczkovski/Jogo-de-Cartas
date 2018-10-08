/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

import java.util.ArrayList;

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 15/04/2016
 */
public class Jogador implements IJogador {
    
    private String nome;
    private ArrayList<Carta> mao = new ArrayList();
    
    public Jogador(){
        
    }
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * Retira uma das cartas do Jogador. Esta operacao eh utilizada para realizar uma jogada (baixar uma carta na mesa)
     * A carta sai da mao (ou seja, a carta sai da lista das cartas que o jogador possui)
     * @return Retorna a Carta qiue foi retirada da mao do jogador (lista das cartas que ele possui)
     */
    public Carta baixaCartaDaMao(){	 	  	  		      	     	      			       	 	
        Carta carta = this.mao.get(0);
        this.mao.remove(0);
        return carta;
    }

    /**
     *
     * @return Retorna a mao atual do jogador (lista das cartas que ele possui)
     */
    public ArrayList<Carta> getMao(){
        return mao;
    }

    /**
     * Inclui na mao do jogador a carta passada como parametro
     * @param carta Carta que sera incluida na mao do jogador
     */
    public void incluiCartaNaMao(Carta carta){
        this.mao.add(carta);
    }

    /**
     * Retira da mao do jogador a carta passada como parametro.
     * @param carta Carta que sera retirada da mao do jogador (lista das cartas que ele possui)
     */
    public void removeCartaNaMao(Carta carta){
        this.mao.remove(carta);
    }
    
}	 	  	  		      	     	      			       	 	
