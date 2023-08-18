//@author Roberto Santana
import java.util.Scanner;
//- Triglicerídeos: precisa armazenar além dos dados do exame a quantidade de triglicerídeo por mg/l
public class ExameTriglicerídeos {
    private String nome;
    private String tipoSangue;
    private int anoNascimento;
    private double valorTriglicerídeos;

    public ExameTriglicerídeos(String nome, String tipoSangue, 
            int anoNascimento, double valorTriglicerídeos) {
        this.nome = nome;
        this.tipoSangue = tipoSangue;
        this.anoNascimento = anoNascimento;
        this.valorTriglicerídeos = valorTriglicerídeos;
    }
    // Para Triglicerídeos: De 0 a 9 anos: Com jejum: inferior a 75 mg/dL
    //De 10 a 19 anos: Com jejum: inferior a 90 mg/dL
    //Acima de 20 anos: Com Jejum: inferior a 150 mg/dL
    public void classificarResultado() {
        String classificacaoResultado;

        if (anoNascimento >= 0 && anoNascimento <= 9) {
            if (valorTriglicerídeos < 75) {
                classificacaoResultado = "Normal";
            } else {
                classificacaoResultado = "Elevado";
            }
        } else if (anoNascimento >= 10 && anoNascimento <= 19) {
            if (valorTriglicerídeos < 90) {
                classificacaoResultado = "Normal";
            } else {
                classificacaoResultado = "Elevado";
            }
        } else {
            if (valorTriglicerídeos < 150) {
                classificacaoResultado = "Normal";
            } else {
                classificacaoResultado = "Elevado";
            }
        }

        System.out.println("Classificação dos Triglicerídeos: " + classificacaoResultado);
    }
    //- Mostrar resultado: escrever na tela o valor do exame + a classificação obtida.
    public void mostrarResultado() {
        System.out.println("Exame de Triglicerídeos: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo do sangue: " + tipoSangue);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Valor de triglicerídeos: " + valorTriglicerídeos + "mg/dL");
    }
    //    - Cadastrar Exame: no cadastro de exame, deve ser lido os dados do exame, 
    //bem como a quantidade em mg/dL já examinado pelo laboratório
    public static ExameTriglicerídeos cadastrarExameTriglicerideos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do paciente: ");
        String nome = sc.nextLine();

        System.out.print("Insira o tipo de sangue dele: ");
        String tipoSangue = sc.nextLine();

        System.out.print("Insira o ano de nascimento dele: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Insira o valor de triglicerídeos (mg/dL): ");
        double valorTriglicerideos = sc.nextDouble();

        return new ExameTriglicerídeos(nome, tipoSangue, anoNascimento, valorTriglicerideos);
    }
}