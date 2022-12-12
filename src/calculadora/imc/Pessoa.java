package calculadora.imc;

public class Pessoa implements Calculo{
    private String nome;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprimentar() {
        System.out.println("Olá " + getNome().toUpperCase());
    }
    @Override
    public void calularImc() {
        double resultImc = getPeso() / (getAltura() * getAltura());

        System.out.printf(getNome().toUpperCase() + " seu IMC é: %.1f %n", resultImc);

        if (resultImc < 18.5){
            System.out.println("Magreza");
        } else if (resultImc >= 18.5 && resultImc <= 24.9) {
            System.out.println("Normal");
        } else if (resultImc >= 25.0 && resultImc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (resultImc >= 30.0 && resultImc <= 39.9) {
            System.out.println("Obesidade");
        } else if (resultImc > 40.0) {
            System.out.println("Obesidade Grave");
        }
    }
}
