import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Inicio do sistema de agenda
      System.out.print("-=-=-=-=-=-=-");
      System.out.print("Agenda de Numeros");
      System.out.print("-=-=-=-=-=-=-\n");


      // Variaveis:
      Scanner scanner = new Scanner(System.in);
      ArrayList <String> nomes = new ArrayList <String> ();
      ArrayList <Integer> contatos = new ArrayList <Integer> ();
      int opcao = -1;
      

      /* Opções:
          1- Adicionar;
          2- Editar
          3- Listar todos os contatos
          4- Remover 
          5- Sair da agenda
      
      
      */  


      while (opcao != 0){
        System.out.println("Escolha a opção de 0 a 4:\n1- Adicionar;\n2- Editar;\n3- Listar todos os contatos;\n4- Remover;\n0- Sair da agenda;\n");
        opcao = scanner.nextInt();
        scanner.nextLine();

// Adicionar
        if (opcao == 1){
          System.out.println("1- Adicionar um contato:\n");
          System.out.print("Informe o nome do contato: ");
          String nome = scanner.nextLine();
          nomes.add(nome);

          System.out.print("Informe o número: ");
          int num = scanner.nextInt();
          contatos.add(num);

        
          System.out.print("\n-=-=-=-=-=-=-");
          System.out.print("Cadastrado com Sucesso");
          System.out.println("-=-=-=-=-=-=-\n");

        }

// Editar
        else if(opcao == 2){
          System.out.println("2- Editar contato:\n");
          if(nomes.size()<=0){
            System.out.print("-=-=-=-=-=-=-");
            System.out.print("Agenda vazia!");
            System.out.println("-=-=-=-=-=-=-\n");
          }else{
            System.out.print("Deseja alterar o nome ou número?\n (0 - nome | 1 - Número) ");
            int escolherMudança = scanner.nextInt();
            // Alteração de nome
            if(escolherMudança == 0){
              System.out.print("\n-=-=-=-=-=-=-");
              System.out.print("Alterar nome!");
              System.out.println("-=-=-=-=-=-=-\n");

              System.out.print("Informe o indice do nome a ser alterado: ");
              int indice = scanner.nextInt();
              scanner.nextLine();
              if ((indice > nomes.size()-1) || (nomes.size() == 0)){
                System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
                System.out.println("\tIndice = "+indice+" fora dos limites!\n");
                System.out.println("\t\tAção Cancelada!");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
              }else{
                System.out.print("\nQual será o novo nome: ");
                String novoNome = scanner.nextLine();
                nomes.set(indice,novoNome);
                System.out.print("\n-=-=-=-=-=-=-Nome Atualizado-=-=-=-=-=-=-\n");

              }
            // alteração do numero
            }else if(escolherMudança==1){
              System.out.print("\n-=-=-=-=-=-=-");
              System.out.print("Alterar número!");
              System.out.println("-=-=-=-=-=-=-\n");

              System.out.print("Informe o indice do número a ser alterado: ");
              int indice = scanner.nextInt();
              scanner.nextLine();
              if ((indice > contatos.size()-1) || (contatos.size() == 0)){
                System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
                System.out.println("\tIndice = "+indice+" fora dos limites!\n");
                System.out.println("\t\tAção Cancelada!");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
              }else{
                System.out.print("\nQual será o novo número: ");
                int novoNumero = scanner.nextInt();
                contatos.set(indice,novoNumero);
                System.out.print("\n-=-=-=-=-=-=-Numero Atualizado-=-=-=-=-=-=-\n");

              }
            }else{
              System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
              System.out.println("Opção fora dos paramêtros");
              System.out.print("Ação Cancelada!");
              System.out.println("-=-=-=-=-=-=-\n");
            }
            
          }

        }

// Listar
        else if(opcao == 3){
          System.out.println("3- Listar todos os contatos:\n");
          if (nomes.size()==0){
            System.out.print("-=-=-=-=-=-=-");
            System.out.print("Nenhum Contato Agendado!");
            System.out.println("-=-=-=-=-=-=-\n");
          }else{
            for (int i = 0; i<contatos.size();i++){
              System.out.println(i+"º "+nomes.get(i)+" = "+contatos.get(i)+";");
            }
            System.out.print("\n-=-=-=-=-=-=-");
            System.out.print("Fim da Agenda");
            System.out.println("-=-=-=-=-=-=-\n");
          }
        }

// Remover
        else if(opcao == 4){
          System.out.println("4- Remover um contato:");
          System.out.print("Informe o indice do contato: ");
          int indice = scanner.nextInt();
          if ((indice > nomes.size()-1) || (nomes.size() == 0)){
            System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.println("\tIndice = "+indice+" fora dos limites!\n");
            System.out.println("\t\tAção Cancelada!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
          }else{
            System.out.printf("Deseja remover o contato {%s : %d}? \n(S - sim | N - Não) "
            ,nomes.get(indice),contatos.get(indice));
            char remover = scanner.next().toUpperCase().charAt(0);
            if (remover == 'S'){
              nomes.remove(indice); contatos.remove(indice);
              System.out.print("\n-=-=-=-=-=-=-");
              System.out.print("Contato Removido!");
              System.out.println("-=-=-=-=-=-=-\n");
            }else{
              System.out.print("\n-=-=-=-=-=-=-");
              System.out.print("Ação Cancelada!");
              System.out.println("-=-=-=-=-=-=-\n");
            }
          }


        }

// Saida
        else if(opcao == 0){
          System.out.println("0- Sair da Agenda:\n");
          System.out.print("-=-=-=-=-=-=-");
          System.out.print("Fechando a Agenda");
          System.out.println("-=-=-=-=-=-=-\n");
        }   
        
      }
      
      
      
      scanner.close();
      
    }


}
