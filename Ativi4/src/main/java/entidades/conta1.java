/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */

public class conta1 {
    private int numero;
    private String titular;
    private double saldo;
    
    public int getNumero(){
        return numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public conta1(int numero, String titular, double depInicial){
        this.numero = numero;
        this.titular= titular;
        deposito(depInicial);
    }
    
    public conta1(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }
    
    public void deposito(double quantia){
        saldo += quantia;
    }
    
    public void saque(double quantia){
        saldo -= quantia +5.0;
    }
    
    public String toString(){
        return "Conta: " + numero 
               + ", Titular: " + titular
               + "Saldo: R$ "
               + String.format("%.2f", saldo);
    }
}
