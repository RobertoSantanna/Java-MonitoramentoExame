//@author Roberto Santana
import java.util.Scanner; 

//Todos exames devem armazenar algumas características em comum como por exemplo, 
//nome do paciente, tipo sanguíneo e ano de nascimento.
public class InfoPaciente {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) { 
        String nome = coletarNomePaciente(); 
        int anoNascimento = coletarAnoNascimento(); 
        String tipoSangue = coletarTipoSangue(); 
    }
    
    private static String coletarNomePaciente() { 
        System.out.println("Insira o nome do paciente: ");
        return sc.nextLine();
    }
    
    private static int coletarAnoNascimento() { 
        System.out.println("Insira o ano de nascimento: ");
        int ano =  sc.nextInt();
        sc.nextLine();
        return ano; 
    }
    private static String coletarTipoSangue() { 
        System.out.println("Insira o tipo de sangue: ");
        return sc.nextLine();
    }
    
}
