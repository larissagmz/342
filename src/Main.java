import desafio.Funcionario;
import desafio.Holerite;
import desafio.Programador;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("larissa", 90);
        Programador programador = new Programador("Hericles", 50, 150);


        System.out.println(funcionario.gerarHolerite(8," 1 de janeiro "));
        System.out.println(programador.gerarHolerite(8, " 1 de janeiro "));

    }
}
