/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.para.sexta;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author me
 */
public class TrabalhoParaSexta {
static     ArrayList<cursos> osCursos = new ArrayList<>();
static Continuar continuar = new Continuar();
static Scanner sc =new Scanner(System.in);
 static  ArrayList<Formando> osFormandos = new ArrayList<>();
  static  ArrayList<Inscricoes> asInscricoes = new ArrayList<>();
   static  ArrayList<Disciplinas> asDisciplinas = new ArrayList<>();
  static  ArrayList<AdicionarDisciplinas> asAdiDis = new ArrayList<>(); 
 static int idFormando = 1;
 static int idCurso = 1;
  static int idDisciplina = 1;

    public static void main(String[] args) {
      
        Continuar continuar = new Continuar();

        Menus menu = new Menus();
        Scanner sc =new Scanner(System.in);
        
        int escolha = 0;
        int escolhaSec = 0;
        do{
            escolha = menu.showMenuprincipal();           
            switch(escolha){
                case 1:
                    do {
                    escolhaSec = menu.showMenuSecundario("Formando");
                   switch (escolhaSec){
                       case 1:
                           System.out.println("inserir formando");
                           inserirFormando();
                           break;
                       case 2:
                           System.out.println("Modificar formando");
                           modificarFormando();
                           break;
                           case 3:
                           System.out.println("Eliminar formando");
                          eliminarformando();
                           break;
                           case 4:
                           System.out.println("Listar formando");
                         
                           for(Formando oFormando : osFormandos)
                             System.out.println(oFormando.toString());
                           break;
                   }
                    }while(escolhaSec != 9);
                    break;
                 case 2:
                    do {               
                    escolhaSec = menu.showMenuSecundario("Curso");
                                       switch (escolhaSec){
                       case 1:
                           System.out.println("inserir curso");
                            inserirCurso();
                           break;                         
                       case 2:
                           System.out.println("Modificar curso");
                           modificarcurso();
                           break;
                           case 3:
                           System.out.println("Eliminar curso");
                           eliminarcurso();
                           break;
                           case 4:
                           System.out.println("Listar curso");
                                                      for(cursos oCurso : osCursos)
                             System.out.println(oCurso.toString());
                           break;
                                       }
                    }while(escolhaSec != 9);
                    break;
           case 3:
                    do {               
                    escolhaSec = menu.showMenuSecundario("disciplina");
                                       switch (escolhaSec){
                       case 1:
                           System.out.println("inserir dsciplina");
                            inserirdisciplina();
                           break;                         
                       case 2:
                           System.out.println("Modificar disciplina");
                           modificardisciplina();
                           break;
                           case 3:
                           System.out.println("Eliminar disciplina");
                           eliminardisciplina();
                           break;
                           case 4:
                           System.out.println("Listar disciplinas");
                                                      for(Disciplinas aDisciplina : asDisciplinas)
                             System.out.println(aDisciplina.toString());                           
                                            
                                       }
                    }while(escolhaSec != 9);
                    break;
             case 4:
                    do {               
                    escolhaSec = menu.showMenuDisciplinaCurso("disciplina");
                    switch (escolhaSec){
                       case 1:
                           System.out.println("inserir disciplina em curso");
                            adicionarDisciplinaCurso();
                           break;                         
                           case 2:
                           System.out.println("Listar disciplinas");
                                                      for(AdicionarDisciplinas asAdiDis : asAdiDis)
                             System.out.println(asAdiDis.toString());                           
                                               break;
                                       }
                    }while(escolhaSec != 9);
                    break;
              case 5:
                    do {               
                    escolhaSec = menu.showMenuFormandoCurso("Formando");
                    switch (escolhaSec){
                       case 1:
                           System.out.println("inserir Formando em curso");
                            adicionarFormandoCurso();
                           break;                         
                           case 2:
                           System.out.println("Listar disciplinas");
                                                      for(Inscricoes asInscricoes : asInscricoes)
                             System.out.println(asInscricoes.toString());                           
                                               break;
                                       }
                    }while(escolhaSec != 9);
                    break;
            }
        
                    
                
        
        }while (escolha != 9);      
    }
    
private static void adicionarFormandoCurso() {
Scanner sc =new Scanner(System.in);
        Inscricoes in = new Inscricoes();
        for(cursos oCurso : osCursos){
        System.out.println(oCurso.toString());       
        }
        System.out.println("Qual id do curso?");
        int idC = sc.nextInt();
        in.setIdCurso(idC);
         for (Formando oFormando : osFormandos) {
           System.out.println(oFormando.toString());
        }
        System.out.println("Qual id do Formando?");
        int idF = sc.nextInt();
        in.setIdFormando(idF);
        asInscricoes.add(in);     


}

    
    private static void adicionarDisciplinaCurso() {
        Scanner sc =new Scanner(System.in);
        AdicionarDisciplinas ad = new AdicionarDisciplinas();
        for(cursos oCurso : osCursos){
        System.out.println(oCurso.toString());       
        }
        System.out.println("Qual id do curso?");
        int id = sc.nextInt();
        ad.setIdCurso(id);
        for (Disciplinas aDisciplina : asDisciplinas) {
           System.out.println(aDisciplina.toString());
        }
        System.out.println("Qual id da disciplina?");
        int idD = sc.nextInt();
        ad.setIdDisciplina(idD);
        asAdiDis.add(ad);     
    }
   

    
   private static void eliminarcurso() {
        cursos cursos = new cursos();
       if (osCursos.size() == 0) {
           System.out.println("Não existe cursos");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       for (cursos oCurso : osCursos) {
           System.out.println(oCurso.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Escolha um ID do curso para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= osCursos.size()) {          
           if (osCursos.size() == 0){
               System.out.println("Não existe cursos!");
           } else
           {           
               osCursos.remove(id - 1);
               idCurso = 2;
               int w = osCursos.size();
               for (int x = 2; x < w+1; x++){
                   cursos = osCursos.get(x-1);
                   cursos.setIdCurso(idCurso++);
                   
                   
               }
              System.out.println("O curso" + id + "foi eliminado");
              for (cursos c : osCursos) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("Não existe um curso com o ID " + id);
       }
  
   }
   }    
       
    private static void eliminarformando() {
        Formando formando = new Formando();
       if (osFormandos.size() == 0) {
           System.out.println("Não existe formandos");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       for (Formando oFormando : osFormandos) {
           System.out.println(oFormando.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Escolha um ID do Formando para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= osFormandos.size()) {          
           if (osFormandos.size() == 0){
               System.out.println("Não existe Formandos!");
           } else
           {           
               osFormandos.remove(id - 1);
               idFormando = 2;
               int w = osFormandos.size();
               for (int x = 2; x < w+1; x++){
                   formando = osFormandos.get(x-1);
                   formando.setIdFormando(idFormando++);
                   
               }
              System.out.println("O Formando" + id + "foi eliminado");
              for (Formando c : osFormandos) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("Não existe um Formando com o ID " + id);
       }
  
   }     
   
        
        
   }
        
    private static void eliminardisciplina() {
        Disciplinas disciplina = new Disciplinas();
       if (asDisciplinas.size() == 0) {
           System.out.println("Não existe Disciplina");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       for (Disciplinas aDisciplina : asDisciplinas) {
           System.out.println(aDisciplina.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Escolha um ID da Disciplina para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= asDisciplinas.size()) {          
           if (asDisciplinas.size() == 0){
               System.out.println("Não existe Disciplinas!");
           } else
           {           
               asDisciplinas.remove(id - 1);
               idDisciplina = 2;
               int t = asDisciplinas.size();
               for (int r = 2; r < t+1; r++){
                   disciplina = asDisciplinas.get(r-1);
                   disciplina.setIdDisciplinas(idDisciplina++);
                   
               }
              System.out.println("A Disciplina" + id + "foi eliminada");
              for (Disciplinas c : asDisciplinas) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("Não existe uma Disciplina com o ID " + id);
       }
  
   }          
    } 
    
    

    private static void inserirCurso() {
/* Scanner sc =new Scanner(System.in); */


   
do {
    cursos cursos = new cursos();
    sc = new Scanner(System.in);
cursos.setIdCurso(idCurso++); 
            System.out.println("Nome do Curso:");
            cursos.setNome(sc.nextLine());
         
                System.out.println("e horas?");
                cursos.setHoras(sc.nextInt());
          

            osCursos.add(cursos);

        }while(continuar.perguntar());

        for(cursos f: osCursos){
            System.out.println(f.toString());
        }

    }
    
    
    
    private static void inserirFormando() {

        do{
            Formando formando = new Formando();
            Scanner sc = new Scanner(System.in);
            formando.setIdFormando(idFormando++);
            System.out.println("Nome do formando:");
            formando.setNome(sc.nextLine());
            System.out.println("Masculino (true/false):");
            formando.setMasculino(sc.nextBoolean());

                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());
        

            osFormandos.add(formando);

        }while(continuar.perguntar());

        for(Formando f : osFormandos){
            System.out.println(f.toString());
        }
    }

    private static void inserirdisciplina() {
/*
        if (osCursos.size() == 0) {
            System.out.println("Não existe cursos disponiveis para inserir uma Disciplina!");

    }else{
        */
do{
    

    Scanner sc = new Scanner(System.in);

    Disciplinas disciplina = new Disciplinas();
    /*       
    for (cursos oCurso : osCursos) {
               System.out.println(oCurso.toString());
           }
    System.out.println("ID do curso:");
    idCurso = sc.nextInt();
    if (idCurso <= osCursos.size() && idFormando > 0) {
        
    }
    
    */
    
    
            sc = new Scanner(System.in);
            disciplina.setIdDisciplinas(idDisciplina++);          
            System.out.println("Nome da Disciplina:");
            disciplina.setNome(sc.nextLine());
            System.out.println("horas da Disciplina:"); 
            disciplina.setHoras(sc.nextInt());
          


            asDisciplinas.add(disciplina);

        }while(continuar.perguntar());

        for(Disciplinas f : asDisciplinas){
            System.out.println(f.toString());
        }
    }
    
    
    
    
    
    private static void modificarFormando() {
        if(osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
    } 
    else {
    
Scanner sc = new Scanner(System.in);
for(Formando oFormando : osFormandos){
    System.out.println(oFormando.toString());
}

        System.out.println("Id do Formando:");
    int id = sc.nextInt();
    try {
       Formando formando = osFormandos.get(id - 1);
       sc = new Scanner(System.in);
        System.out.println("O formando existe");
                  System.out.println("Nome do formando:");
                  String nome = sc.nextLine();
                  if(!nome.isEmpty())
               formando.setNome(nome);
            System.out.println("Masculino (true/false):");
                              String genero = sc.nextLine();
                  if(!genero.isEmpty())
               formando.setMasculino( (genero.equals("true"))? true : false);
            
                  
                  
                  
            /*
            formando.setMasculino(sc.nextBoolean());
            do{
                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());
            }while(continuar.perguntar());
        */
        
        

    } catch (Exception e) {
        System.out.println("O formando " + id + " não existe");
    }
    

        }
    }

        
   private static void modificarcurso() {
        if(osCursos.size() == 0) {
            System.out.println("Não há cursos!");
    } 
    else {
    
Scanner sc = new Scanner(System.in);
for(cursos oCurso : osCursos){
    System.out.println(oCurso.toString());
}

        System.out.println("Id do Curso:");
    int id = sc.nextInt();
    try {
       cursos curso = osCursos.get(id - 1);
       sc = new Scanner(System.in);
        System.out.println("O curso existe");
                  System.out.println("Nome do Curso:");
                  String nome = sc.nextLine();
                  if(!nome.isEmpty())
               curso.setNome(nome);
            System.out.println("Horas do curso:");
                curso.setHoras(sc.nextInt());
        
 
       } catch (Exception e) {
        System.out.println("O Curso " + id + " não existe");
    }           
        }
   }
    
    private static void modificardisciplina() {
        if(asDisciplinas.size() == 0) {
            System.out.println("Não há Disciplinas!");
    } 
    else {
    
Scanner sc = new Scanner(System.in);
for(Disciplinas aDisciplina : asDisciplinas){
    System.out.println(aDisciplina.toString());
}

        System.out.println("Id da Disciplina:");
    int id = sc.nextInt();
    try {
       Disciplinas disciplina = asDisciplinas.get(id - 1);
       sc = new Scanner(System.in);
        System.out.println("O curso existe");
                  System.out.println("Nome da Disciplina:");
                  String nome = sc.nextLine();
                  if(!nome.isEmpty())
               disciplina.setNome(nome);
            System.out.println("Horas da Disciplina:");
                disciplina.setHoras(sc.nextInt());
        
 
       } catch (Exception e) {
        System.out.println("A Disciplina " + id + " não existe");
    }           
        }
    }
}
                  
                  
                  
                  
                  
                  
                  /*
        do{
            Formando formando = new Formando();
            Scanner sc = new Scanner(System.in);
            formando.setIdFormando(idFormando++);
            System.out.println("Nome do formando:");
            formando.setNome(sc.nextLine());
            System.out.println("Masculino (true/false):");
            formando.setMasculino(sc.nextBoolean());
            do{
                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());
            }while(continuar.perguntar());

            lista.add(formando);

        }while(continuar.perguntar("Inserir mais um formando?"));

        for(Formando f : lista){
            System.out.println(f.toString());
*/