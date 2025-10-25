public class FabricaOperacoes {

    public static IOperacao criar(int tipo) {
        switch(tipo) {
            case 1:
                return new Soma();
            case 2:
                return new Subtracao();
            case 3:
                return new Multiplicacao();
            case 4:
                return new Divisao();
            default:
                throw new IllegalArgumentException("Operação inválida! Escolha entre 1 e 4.");
        }
    }
}