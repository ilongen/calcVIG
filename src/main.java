import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        view view = new view(scanner);
        historicoCalc historico = new historicoCalc();
        typeOperation operation = new typeOperation(view,historico);
        typeOperation2 operation2 = new typeOperation2(view);
        view.viewInitial();
        int select = view.viewSelect();

        if (select == 1) {
            operation.calcinitial();
        } else {
            operation2.operationComplex();
        }

        view.viewFinal();

        scanner.close();
    }
}
