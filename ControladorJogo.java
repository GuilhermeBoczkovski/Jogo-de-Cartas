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
public class ControladorJogo implements IControladorJogo {
 
    private ArrayList<Carta> baralho = new ArrayList();
    private ArrayList<Jogador> jogadores = new ArrayList();
 
    /**
     * Permite incluir um novo Personagem na lista de personagens do jogo
     * @param energia Energia do novo Personagem
     * @param habilidade Habilidade do novo Personagem
     * @param velocidade Velocidade do novo Personagem
     * @param resistencia Resistencia do novo Personagem
     * @param tipo TipoPersonagem (Enum) do novo Personagem. Deve ser utilizado TipoPersonagem.TIPO
     * @return Retorna o Personagem incluido na lista
     */
    public Personagem incluiPersonagemNaLista(int energia, int habilidade, int velocidade, int resistencia, TipoPersonagem tipoPersonagem){
        return new Personagem(energia,habilidade,velocidade,resistencia,tipoPersonagem);
    }
    
    /**
     * Permite incluir uma nova Carta no baralho do jogo
     * @param personagem Personagem da nova carta que sera incluida
     * @return Retorna a Carta que foi incluida no baralho
     */
    public Carta incluiCartaNoBaralho(Personagem personagem){	 	  	  		      	     	      			       	 	
        Carta carta = new Carta(personagem);
        this.baralho.add(carta);
        return carta;
    }

    /**
     * Permite incluir um novo Jogador, que eh colocado na lista de jogadores
     * @param nome Nome do Jogador a ser incluido
     * @return Retorna o Jogador incluido na lista
     */
    public Jogador incluiJogador(String nome){
        Jogador jogador = new Jogador(nome);
        this.jogadores.add(jogador);
        return jogador;
    }

    /**
     * Inicia o jogo, incluindo os dois jogadores na partida
     * Tambem distribui aleatoriamente 5 cartas do baralho para cada jogador
     *
     * @param jogador1 Jogador 1
     * @param jogador2 Jogador 2
     */
    public void iniciaJogo(Jogador jogador1, Jogador jogador2){
        this.jogadores.add(jogador1);
        this.jogadores.add(jogador2);
        for(int i = 0; i < 5; i++){
            int j = (int)(Math.random() * ((baralho.size()-1 - 0) + 1)) + 0;
            jogador1.incluiCartaNaMao(baralho.get(j));
            baralho.remove(j);
        }
        for(int i = 0; i < 5; i++){
            int j = (int)(Math.random() * ((baralho.size()-1 - 0) + 1)) + 0;
            jogador2.incluiCartaNaMao(baralho.get(j));
            baralho.remove(j);
        }	 	  	  		      	     	      			       	 	
    }

    /**
     * Realiza uma jogada, ou seja:
     * 1. Recebe a mesa onde estao as cartas lancadas pelo Jogador 1 e pelo Jogador 2
     * 2. Compara os valores totais das cartas dos jogadores
     * 3. Inclui na mao do Jogador vencedor a carta do perdedor
     * 4. Se o outro jogador perdedor nao tem mais cartas na mao, retorna o Jogador vencedor como vencedor da partida
     * @param mesa Mesa atual, contendo: Jogador 1, Jogador 2, Carta do Jogador 1 e Carta do Jogador 2
     * @return Retorna o Jogador vencedor como vencedor da partida. Se nenhum jogador venceu a partida, retorna NULL
     */
    public Jogador jogada(Mesa mesa){
        if(mesa.getCartaJogador1().getValorTotalCarta() > mesa.getCartaJogador2().getValorTotalCarta()){
            mesa.getJogador1().incluiCartaNaMao(mesa.getCartaJogador2());
            mesa.getJogador2().removeCartaNaMao(mesa.getCartaJogador2());
            if(mesa.getJogador2().getMao().size() > 0){
                return null;
            }
            return mesa.getJogador1();
        }else{
            mesa.getJogador2().incluiCartaNaMao(mesa.getCartaJogador1());
            mesa.getJogador1().removeCartaNaMao(mesa.getCartaJogador1());
            if(mesa.getJogador1().getMao().size() > 0){
                return null;
            }
            return mesa.getJogador2();
        }
    }
    
}	 	  	  		      	     	      			       	 	
