/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public abstract class Animal {
    protected String nome;
    protected String tipo;
    protected String habitat;
    
    public Animal(String nome, String tipo, String habitat){
        this.nome = nome;
        this.tipo = tipo;
        this.habitat= habitat;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTipo(){
        return tipo;
    }
    public String getHabitat(){
        return habitat;
    }
    
    public abstract String emitirSom();
    public abstract String exibirDados();
}
