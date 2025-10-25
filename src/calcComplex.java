public class calcComplex extends typeOperation{
    double valor;
    double percentage;

    public double porcentagem(){
        System.out.println("Digite seu valor");
        valor = input.nextDouble();
        System.out.println("Digite sua porcentagem");
        percentage = input.nextDouble();
        return (valor * percentage)/100;
    }
    public double log(){
        System.out.println("Digite seu valor");
        valor = input.nextDouble();
        return Math.log10(valor);
    }
}
