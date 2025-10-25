import java.util.Scanner;

public class view {
    Scanner input = new Scanner(System.in);

    public void viewInitial(){
        System.out.println("-------------------");
        System.out.println("CALCULADORA VIG");
        System.out.println("-------------------");

    }
    public int viewSelect(){
        System.out.println("Você quer realizar que tipo de cálculo?");
        System.out.println("1- Básico");
        System.out.println("2- Complexo");
        int selectUser =  input.nextInt();
        while(selectUser < 1 || selectUser > 2){
            System.out.println("Operação não localizada, tente novamente!");
            selectUser = input.nextInt();
        }
        return selectUser;
    }

    public void viewFinal(){
        System.out.println("------------------");
        System.out.println("Agradecemos pelo uso");
        System.out.println("------------------");
    }
}
