/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 15/04/2016
 */
public class Carta implements ICarta {
    
    private Personagem personagem;
    
    public Carta(Personagem personagem){
        this.personagem = personagem;
    }
    
    /**
     * Soma e retorna todos os valores dos atributos do personagem da Carta
     * @return Retorna o somatorio de todos os atributos do personagem da Carta
     */
    public int getValorTotalCarta(){
        return this.personagem.getEnergia()+this.personagem.getHabilidade()+this.personagem.getVelocidade()+this.personagem.getResistencia();
    }

    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
    
    public Personagem getPersonagem(){
        return this.personagem;
    }
    
}	 	  	  		      	     	      			       	 	
