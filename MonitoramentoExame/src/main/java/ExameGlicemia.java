//@author Roberto Santana
import java.util.Scanner;
//- Glicemia: precisa armazenar além dos dados do exame a quantidade de glicose por mg/l
public class ExameGlicemia {
    private String nome; 
    private String tipoSangue; 
    private int anoNascimento; 
    private double qntGlicose; 
    
    public ExameGlicemia(String nome, String tipoSangue, 
            int anoNascimento, double qntGlicose){
            this.nome = nome; 
            this.tipoSangue = tipoSangue; 
            this.anoNascimento = anoNascimento; 
            this.qntGlicose = qntGlicose; 
    } 
    //Classificar o resultado:
    //Para Glicemia: Normoglicemia: Inferior a 100 mg/dL
    //Pré-diabetes: Superior ou igual a 100 mg/dL eles Inferior a 126 mg/dL
    //Diabetes estabelecido: Superior ou igual a 126 mg/dL
    public void classificarResultado() { 
        String classificacaoResultado; 
        if(qntGlicose < 100) { 
            classificacaoResultado = "Normoglicemia!"; 
        }
        else if(qntGlicose < 126){ 
            classificacaoResultado = "Pré-diabetes!"; 
        }
        else { 
            classificacaoResultado = "Diabetes estabelecido!";
        }
        System.out.println("Classificação de Glicemia: " + classificacaoResultado);
    }
        //- Mostrar resultado: escrever na tela o valor do exame + a classificação obtida.
        public void mostrarResultado() { 
            System.out.println("Exame de Glicemia: ");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo do sangue: " + tipoSangue);
            System.out.println("Ano de nascimento: " + anoNascimento);
            System.out.println("Quantidade de glicose no organismo: " + qntGlicose); 
        }
        //no cadastro de exame, deve ser lido os dados do exame, 
        //bem como a quantidade em mg/dL já examinado pelo laboratório
        public static ExameGlicemia cadastrarExameGlicemia() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira o nome do paciente: ");
            String nome = sc.nextLine();

            System.out.print("Insira o tipo de sangue dele: ");
            String tipoSangue = sc.nextLine();

            System.out.print("Insira o ano de nascimento dele: ");
            int anoNascimento = sc.nextInt();

            System.out.print("Insira a quantidade de glicose dele (em mg/dL): ");
            double qntGlicose = sc.nextDouble();

            return new ExameGlicemia(nome, tipoSangue, anoNascimento, qntGlicose);
    }
}
        





