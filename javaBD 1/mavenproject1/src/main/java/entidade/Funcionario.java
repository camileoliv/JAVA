/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author aluno.den
 */
public class Funcionario {
    public String nome;
    private int hrT;
    private int vHr;
    double salary;
    
    public Funcionario(String nome, int hrT, int vHr){
    this.nome = nome;
    this.hrT = hrT;
    this.vHr = vHr;
    }
    
    public void salario( int hrT, int vHr){
        salary = hrT * vHr;
    }
    
    
}
