package entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class alunos {
    public String nome;
    public double n1;
    public double n2;
    public double n3;
    
    public double mediaCal(){
    return (n1 + n2 + n3) /3 ;
    }
    
    public void status(double mediaCal ){
        if (mediaCal >= 60){
            System.out.print("Aprovado.");
            } else {
            System.out.print("Reprovado.");
            }}
    
    public double pontosFal(double mediaCal){
        return mediaCal - 60;
    }
    
    
}
