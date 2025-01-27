package desafio;

public class Programador extends Funcionario {
    private double valorBonus;

    public Programador(String nome, double valorHora, double valorBonus) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }
    @Override
    protected final double calcularSalario(int horasTrabalhadas){
        return super.calcularSalario(horasTrabalhadas) + valorBonus ;
    }

    @Override
    public String toString() {
        return "Programador{" +
                " valorBonus = " + valorBonus +
                '}';
    }
}
