package desafio;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir(){
     System.out.printf("nome: %s, %s, salario: %.2f", nome, mesAno, valorSalario);
    }
}
