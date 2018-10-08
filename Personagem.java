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
public class Personagem {
    
    private TipoPersonagem tipoPersonagem;
    private int energia;
    private int habilidade;
    private int velocidade;
    private int resistencia;
    
    public Personagem(int energia, int habilidade, int velocidade, int resistencia, TipoPersonagem tipoPersonagem){
        this.energia = energia;
        this.habilidade = habilidade;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.tipoPersonagem = tipoPersonagem;
    }
    
    public void setTipo(TipoPersonagem tipoPersonagem){
        this.tipoPersonagem = tipoPersonagem;
    }
    
    public TipoPersonagem getTipo(){
        return this.tipoPersonagem;
    }
    
    public void setEnergia(int energia){
        this.energia = energia;
    }	 	  	  		      	     	      			       	 	
    
    public int getEnergia(){
        return this.energia;
    }
    
    public void setHabilidade(int habilidade){
        this.habilidade = habilidade;
    }
    
    public int getHabilidade(){
        return this.habilidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }
    
    public int getResistencia(){
        return this.resistencia;
    }
    
}	 	  	  		      	     	      			       	 	
