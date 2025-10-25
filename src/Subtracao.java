public class Subtracao implements IOperacao {

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }

    @Override
    public String getSimbolo() {
        return "-";
    }
}