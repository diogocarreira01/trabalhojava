/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.para.sexta;

import java.util.Scanner;

/**
 *
 * @author me
 */
public class Menus {
    Scanner sc = new Scanner(System.in);
    public int showMenuprincipal() {
        int escolha = 0;
        do{
        System.out.println("========");
        System.out.println(" 1. Formando");    
        System.out.println(" 2. Cursos");     
        System.out.println(" 3. Disciplinas"); 
        System.out.println(" 4. Inscrever Disciplina em um curso");
        System.out.println(" 5. Inscrever formando em um curso");
        System.out.println("9. Sair");
        System.out.println("========");
        System.out.println("Escolha uma opção: ");
         escolha = sc.nextInt();
        }while  (escolha != 1 && escolha != 2 && escolha != 3 && escolha !=4 && escolha != 9 && escolha !=5);;
    return escolha;
                }
    
    
    
    
 public int showMenuSecundario(String tipo) {      
     int escolha = 0;
        do{
        System.out.println("========");
        System.out.println(" 1. Inserir " + tipo);    
        System.out.println(" 2. Modificar " + tipo);     
        System.out.println(" 3. Eliminar " + tipo); 
        System.out.println(" 4. Listar " + tipo); 
        System.out.println();
        System.out.println(" 9. Sair");
        System.out.println("========");
        System.out.println("========");
        System.out.println("Escolha uma opção: ");
        escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 9);
    return escolha;
                }

        public int showMenuDisciplinaCurso(String tipo) {
        int escolha = 0;
        do {
            System.out.println("========");
            System.out.println(" 1. Inscrever disciplina em um curso");
            System.out.println(" 2. Listar Disciplinas existentes");
            System.out.println("");
            System.out.println("");
            System.out.println(" 9. Sair");
            System.out.println("========");
            System.out.println("========"); 
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 9);
    return escolha;
    }


public int showMenuFormandoCurso(String tipo) {
        int escolha = 0;
        do {
            System.out.println("========");
            System.out.println(" 1. Inscrever formando em um curso");
            System.out.println(" 2. Listar formandos em cursos existentes");
            System.out.println("");
            System.out.println("");
            System.out.println(" 9. Sair");
            System.out.println("========");
            System.out.println("========"); 
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 9);
    return escolha;
    }
}


