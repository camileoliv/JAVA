/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class contaEspecial extends conta1{
    
    private double limiteEmprestimo;
    private double limit;

    public contaEspecial(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    public double setLimite(){
        return limit;
    }

    public void limite(double quantia){
        limit -= limiteEmprestimo + 10;
    }
    
}
