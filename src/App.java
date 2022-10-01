import java.util.Scanner;

public class App {

    static final byte NUMERO_DE_AVALIACOES = 4;
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        float nota1 = 0f;
        float nota2 = 0f;
        float nota3 = 0f;
        float nota4 = 0f;
        float somaNotas = 0f;
        double media = 0;


        System.out.print("Digite a primeiro nota: ");
        nota1 = console.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = console.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = console.nextFloat();
        System.out.print("Digite a quarta nota: ");
        nota4 = console.nextFloat();

        somaNotas = nota1 + nota2 + nota3 + nota4;
        media = somaNotas / NUMERO_DE_AVALIACOES;

        System.out.println("A média das notas foi: " + media);
        console.close();
    }
}
