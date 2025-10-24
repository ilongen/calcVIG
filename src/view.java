import java.util.Scanner;

public class view {
    public void terminalController(){
        Scanner input = new  Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("---CALCULADORA VIG---");
        System.out.println("-------------------");




        String escolhaUser = input.nextLine();
    }
    public String operationBasic(){
        System.out.println("Qual operação deseja selecionar? ");
        System.out.println("+ , - , / , * ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
