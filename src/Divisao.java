public class Divisao implements IOperacao {

    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return a / b;
    }

    @Override
    public String getSimbolo() {
        return "/";
    }
}