/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ExercicioPOO3Alunos;

import java.util.Scanner;
import entidades.alunos;

/**
 *
 * @author aluno.den
 */
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        alunos alunos = new alunos();
        
        System.out.print("Digite seu nome: ");
        alunos.nome = scan.nextLine();
        
        System.out.print("Digite sua primeira nota: ");
        alunos.n1 = scan.nextDouble();
        
        System.out.print("Digite sua segunda nota: ");
        alunos.n2 = scan.nextDouble();
        
        System.out.print("Digite sua terceira nota: ");
        alunos.n3 = scan.nextDouble();
    }
}
