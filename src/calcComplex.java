
public class calcComplex{
    private double valor;
    private double percentage;

    public calcComplex(double a, double b){
        setValor(a);
        setPorcentagem(b);
    }
    public double setValor(double valor){
        this.valor = valor;
        return valor;
    }
    public double setPorcentagem(double percentage){
        this.percentage = percentage;
        return percentage;
    }

    public double getPercentage() {
        return percentage;
    }
    public double getValor() {
        return valor;
    }

    public double porcentagem(){
        double valor = getValor();
        double percentage = getPercentage();
        return (valor * percentage)/100;
    }
}
