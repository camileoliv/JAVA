/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atetividad;
import java.util.Scanner;
import java.util.Locale;
import entidades.EstoqueClass;
/**
 *
 * @author aluno.den
 */
public class Atetividad {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Digite o nome do produto: ");
        
        System.out.print("Digite o preço: ");
        
        System.out.print("Digite a quantidade em estoque: ");
        
        System.out.print(est);
        
        System.out.print("Deseja adicionar ou retirar um produto?   1-Adicionar 2-Retirar");
        
        if(num == 1){
            System.out.print("Quantidade a ser adicionada: ");
            int quantia = sc.nextInt();
            System.out.print(est);
        }else{
            System.out.print("Quantidade a ser retirada: ");
            int quantia = sc.nextInt();
            System.out.print(est);
        }
    }
}
