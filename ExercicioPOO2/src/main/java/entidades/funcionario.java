/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class funcionario {
    public String nome;
    public double salaryBruto;
    public double imposto;
    
    public double salaryLiquid(){
        return salaryBruto  - imposto;
    }
    
    public void aumentarSalary(double percentual){
        salaryBruto += salaryBruto * (percentual/100);
    }
    
    public String toString(){
    return nome + ",R$" + String.format("%.2f",salaryLiquid ());
    }
    
}
