/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativi4;

import java.util.Locale;
import entidades.conta1;
import java.util.Scanner;
import entidades.contaEspecial;

/**
 *
 * @author aluno.den
 */
public class Ativi4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        conta1 conta;
        contaEspecial contaEspecial;
        
        System.out.print("Você deseja acessar qual conta? 1- Conta Especial  2- Conta Comum");
        number = sc.nextInt();
        
        if(number == 1){
            
        System.out.print("Informe o titular da conta: ");
        String titular = sc.nextLine();
        
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Informe se tem deposito inicial (y/n)?");
        char resposta = sc.nextLine().charAt(0);
        if (resposta == 'y'){
            System.out.print("Informe o valor do depósito: ");
            double depInicial = sc.nextDouble();
            conta = new conta1(numero, titular, depInicial);
        } else {
            conta = new conta1(numero, titular);
        }
        
        System.out.print(conta);
        
        System.out.print("Informe o valor do depósito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);
        
        System.out.print(conta);
        
        System.out.print("Informe o limite do empréstimo: ");
        double limit = sc.nextDouble();
        
        }
        else
        {
            
        System.out.print("Informe o titular da conta: ");
        String titular = sc.nextLine();
        
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Informe se tem deposito inicial (y/n)?");
        char resposta = sc.nextLine().charAt(0);
        if (resposta == 'y'){
            System.out.print("Informe o valor do depósito: ");
            double depInicial = sc.nextDouble();
            conta = new conta1(numero, titular, depInicial);
        } else {
            conta = new conta1(numero, titular);
        }
        
        System.out.print(conta);
        
        System.out.print("Informe o valor do saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        
        System.out.print(conta);}
        
        
               
    }
}
