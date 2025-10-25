import java.util.Scanner;

public class typeOperation2 {
    Scanner input = new Scanner(System.in);
    private final view view;

    public typeOperation2( view view) {
        this.view = view;
    }

    public void operationComplex() {
        System.out.println("Qual operação deseja selecionar?");
        System.out.println("1: %");

        int select = input.nextInt();
        while (select != 1) {
            System.out.println("Operação não localizada, tente novamente!");
            select = input.nextInt();
        }

        double valor = view.getValorDouble();
        double percentage = view.getValorDouble();

        calcComplex calc = new calcComplex(valor, percentage);
        double resultado = calc.porcentagem();

        System.out.println("Resultado: " + resultado);
    }
}