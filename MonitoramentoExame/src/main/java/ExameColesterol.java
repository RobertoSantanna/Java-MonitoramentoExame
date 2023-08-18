//@author Roberto Santana
import java.util.Scanner;
//- Colesterol: precisa armazenar além dos dados do exame a quantidade de LDL e HDL por mg/l 
//e o risco do paciente (B - baixo, M - medio e A - alto)
public class ExameColesterol {

    private String nome;
    private String tipoSangue;
    private int anoNascimento;
    private double valorLdl;
    private double valorHdl;
    private String riscoPaciente;

    public ExameColesterol(String nome, String tipoSangue, int anoNascimento, double valorLdl, double valorHdl) {
        this.nome = nome;
        this.tipoSangue = tipoSangue;
        this.anoNascimento = anoNascimento;
        this.valorLdl = valorLdl;
        this.valorHdl = valorHdl;
        calcularRisco();
    }

    private void calcularRisco() {
        if (valorLdl < 100) {
            riscoPaciente = "Baixo";
        } else if (valorLdl < 130) {
            riscoPaciente = "Médio";
        } else {
            riscoPaciente = "Alto";
        }
    }
    //- Para Colesterol HDL: De 0 a 19 anos..: superior a 45 mg/dL (HDL - BOM)
    //Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
    //- Para Colesterol LDL: Se o paciente for risco baixo, o colesterol LDL deve estar abaixo de 100 mg/dL
    //Se o paciente for risco médio, o colesterol LDL deve estar abaixo de 70 mg/dL    
    //Se o paciente for risco alto, o colesterol LDL deve estar abaixo de 50 mg/dL
    public void classificarResultado() {
        System.out.println("Classificação do Colesterol: ");
        System.out.println("LDL: " + valorLdl + "mg/dL \n Risco: " + riscoPaciente);
        System.out.println("HDL: " + valorHdl + "mg/dL");
    }
    //- Mostrar resultado: escrever na tela o valor do exame + a classificação obtida.
    public void mostrarResultado() {
        System.out.println("Exame de colesterol: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo do sangue: " + tipoSangue);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("LDL: " + valorLdl + "Mg/dL");
        System.out.println("HDL: " + valorHdl + "Mg/dL");
    }
    //- Cadastrar Exame: no cadastro de exame, deve ser lido os dados do exame, 
    //bem como a quantidade em mg/dL já examinado pelo laboratório
    public static ExameColesterol cadastrarExameColesterol() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do paciente: ");
        String nome = sc.nextLine();

        System.out.print("Insira o tipo de sangue dele: ");
        String tipoSangue = sc.nextLine();

        System.out.print("Insira o ano de nascimento dele: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Insira o valor de LDL (mg/dL): ");
        double valorLdl = sc.nextDouble();

        System.out.print("Insira o valor de HDL (mg/dL): ");
        double valorHdl = sc.nextDouble();

        return new ExameColesterol(nome, tipoSangue, anoNascimento, valorLdl, valorHdl);
    }
}