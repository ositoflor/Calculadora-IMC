package calculadora.imc;

import java.util.Scanner;
public class CalcularImc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int option = 0;

        System.out.println("Digite seu nome:");
        pessoa.setNome(scn.next());
        pessoa.comprimentar();

        while (option != 2) {
            switch (option) {
                case 1:
                    System.out.println("Calcular IMC");
                    System.out.println("Informe sua altura:");
                    pessoa.setAltura(scn.nextDouble());
                    System.out.println("Informa seu peso:");
                    pessoa.setPeso(scn.nextDouble());
                    pessoa.calularImc();
                    break;
                case 2:
                    break;
            }

            System.out.println("Calculadora de IMC");
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Sair");
            System.out.println("Escolha uma opção:");
            option = scn.nextInt();
        }
    }
}
