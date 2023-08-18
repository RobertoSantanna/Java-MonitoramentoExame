//@author Roberto Santana
import java.util.Scanner; 

public class Principal  {

    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        boolean sair = false; 
        
        while(!sair) { 
            exibirMenu();
            int escolher = sc.nextInt();
            
            switch(escolher) { 
                case 1: 
                    //aqui ele vai chamar o método pro exame de Glicemia
                    ExameGlicemia exameGlicemia = ExameGlicemia.cadastrarExameGlicemia(); 
                    exameGlicemia.classificarResultado();
                    exameGlicemia.mostrarResultado();
                    break;
                case 2: 
                    //aqui ele vai chamar o método pro exame de Colesterol
                    ExameColesterol exameColesterol = ExameColesterol.cadastrarExameColesterol();
                    exameColesterol.classificarResultado();
                    exameColesterol.mostrarResultado();
                    break;
                case 3: 
                    //aqui ele vai chamar o método pro exame de Triglicerídeos
                    ExameTriglicerídeos exameTriglicerídeos = ExameTriglicerídeos.cadastrarExameTriglicerideos();
                    exameTriglicerídeos.classificarResultado();
                    exameTriglicerídeos.mostrarResultado();
                    break;
                case 4: 
                    sair = true; 
                    System.out.println("Encerrando o programa! ");
                    break; 
            }
        }
        sc.close();
        }
    //exibir o menu de exame
    private static void exibirMenu(){ 
                System.out.println("Escolha qual tipo de exame: ");
                System.out.println("Digite 1 para Exame de Glicemia");
                System.out.println("Digite 2 para Exame de Colesterol");
                System.out.println("Digite 3 para Exame de Triglicerídeos");
                System.out.println("Digite 4 para sair do Menu");
            }

} 
