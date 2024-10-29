/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class Elefante extends Animal{
    public Elefante(String nome, String tipo, String habitat){
        super(nome, tipo, habitat);
    }
    
    @Override
    public String emitirSom(){
        return String.format("FUUMM UUUUH");
    }
    
    @Override
    public String exibirDados()
    {        
        return String.format("\nNome: %s\nTipo: %s\nHabitat: %s", nome, tipo, habitat);
    }
}
