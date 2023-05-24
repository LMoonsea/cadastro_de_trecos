/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lmoonsea.cadastro_de_trecos;

import java.util.Scanner;
/**
 *
 * @author 16128412023.1
 */
 public class Cadastro_de_trecos {
 static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        clearScreen();
        mainMenu();
    }
        //Metodo que exibe o menu principal
       public static void mainMenu() {
           System.out.println("Cadastro de Trecos\n\nMenu:\n\t[1] Listar todos\n\t[2] Listar\n\t[3] Novo\n\t[4] Editar\n\t[5] Apagar\n\t[0] Sair");
        System.out.print("\nOpção: ");
        
        // recebe a opção do teclado.
        String option = scanner.next();
       
        // Executa um método conforme a opção escolhida
     switch (option) {
         case "0":
             exitProgram();
             break;
         case "1":
             listAll();
             break;
         case "2":
             listOne();           
             break;
         case "3":
             newThing();
             break;
         case "4":
             editThing();
             break;
         case "5":
             deleteThing();
             break;
         default:
             reloadMenu();
             
       }
       }
       // Método que encerra o programa.
       public static void exitProgram(){
           scanner.close();
         clearScreen();
           System.out.println("\n\nFui!\n\n");
           System.exit(0);
       }
       // Lista todos os trecos cadastrados.
       public static void listAll(){}
       
       // Lista um treco especifico pelo Id.
       public static void listOne(){}
       
       // Cadastra um novo treco.
       public static void newThing(){}
       
       // Edita um treco pelo Id.
       public static void editThing(){}
       
       // Apaga um treco pelo Id.
       public static void deleteThing(){}
       
       // Recarrega o menu principal.
    public static void reloadMenu(){
      clearScreen();
      System.out.println("\n\nburra!!\n\n");
      mainMenu();}
    // Limpa a tela do console.
    public static void clearScreen(){
        for(int i = 0; i < 100; i++){
            System.out.println("\n");
        }
    }
 }

