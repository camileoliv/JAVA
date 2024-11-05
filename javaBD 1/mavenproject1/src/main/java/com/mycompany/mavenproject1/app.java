/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.util.Locale;
import entidade.*;

/**
 *
 * @author aluno.den
 */
public class app {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);    
        Scanner sc = new Scanner (System.in);
        int number;
        FuncionarioTer FuncionarioTer;

        System.out.print("Você deseja acessar qual funcionário? 1- Funcionário terceirizado  2- Funcionário nativo");
        number = sc.nextInt();
                
                if(number == 1){
                    
                System.out.print("Informe o nome do funcionário: ");
                String nome = sc.nextLine();
                
                System.out.print("Informe as horas trabalhadas: ");
                int hrT = sc.nextInt();
        
                System.out.print("Informe as horas trabalhadas: ");
                int vHr = sc.nextInt();
                
                System.out.print("Informe a despesa adicional: ");
                double despesa = sc.nextDouble();
              
                System.out.print(dados);
                
                }
                else
                {
                    
                System.out.print("Informe o nome do funcionário: ");
                String nome = sc.nextLine();
                                
                System.out.print("Informe as horas trabalhadas: ");
                int hrT = sc.nextInt();
                        
                System.out.print("Informe as horas trabalhadas: ");
                int vHr = sc.nextInt();
                              
                System.out.print(dados);}

    }
}
