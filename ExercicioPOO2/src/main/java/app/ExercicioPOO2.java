/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import java.util.Scanner;
import java.util.Locale;
import entidades.funcionario;

/**
 *
 * @author aluno.den
 */
public class ExercicioPOO2 {
    public static void main(String[] args) {        
        Locale.setDefault(Locale.US);    
        Scanner scan = new Scanner (System.in);
        funcionario funcionario =  new funcionario();
        
        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = scan.nextLine();
        
        System.out.print("Digite o salário of the funcionario: ");
        funcionario.salaryBruto = scan.nextDouble();
        
        System.out.print("Digite o imposto: ");
        funcionario.imposto = scan.nextDouble();
        
        System.out.print("Funcionário:"+ funcionario);
        System.out.print("Salário:"+ funcionario);
        
        System.out.print("Digite o percentual de aumento: ");
        double percentual = scan.nextDouble();       
        funcionario.aumentarSalary(percentual);
        
        System.out.print("Dados atualiazados: "+funcionario);
    }
}
