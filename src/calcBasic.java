import java.util.Scanner;

public class calcBasic{
    Scanner input = new Scanner(System.in);
    private double b;
    public double getSoma(double a){
        System.out.println("Digite segundo número para operação");
        this.b = input.nextDouble();
        return a+b;
    }
    public double getMultiplicacao(double a){
        System.out.println("Digite segundo número para operação");
        this.b = input.nextDouble();
        return a*b;
    }
    public double getDivisao(double a){
        System.out.println("Digite segundo número para operação");
        this.b = input.nextDouble();
        return a/b;
    }
    public double getSubtracao(double a){
        System.out.println("Digite segundo número para operação");
        this.b = input.nextDouble();
        return a-b;
    }
}
