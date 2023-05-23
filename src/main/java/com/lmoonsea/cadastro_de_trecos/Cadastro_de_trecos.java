/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lmoonsea.cadastro_de_trecos;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author 16128412023.1
 */
public class Cadastro_de_trecos {

    public static void main(String[] args) {
        
       System.out.println("Cadastro de Trecos\n\nMenu:\n\t[1] Listar todos\n\t[2] Listar\n\t[3] Novo\n\t[4] Editar\n\t[5] Apagar\n\t[0] Sair");
        System.out.print("\nOpção: ");
        
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
       
    }
    
    
}
