public class typeOperation{
    private final view view;
    private final calcBasic calculator;
    private final historicoCalc historico;

    public typeOperation(){
        this.view = new view();
        this.calculator = new calcBasic();
        this.historico = new historicoCalc();
    }

    public void calcinitial(){
        System.out.println("Digite seu primeiro valor:");
        double a = view.getValorDouble();
        int continuarPrograma;

        do {
            System.out.println("\n================================");
            System.out.println("Valor atual: " + a);
            System.out.println("================================");
            System.out.println("Qual operação deseja selecionar? ");
            System.out.println("1: + , 2: - , 3: / , 4: * ");
            int select = view.getValorInt();

            while(select < 1 || select > 4){
                System.out.println("Operação não localizada, tente novamente!");
                System.out.println("---------------------------------");
                System.out.println("Qual operação deseja selecionar?");
                select = view.getValorInt();
            }

            a = operationBasic(select, a);

            System.out.println("\n================================");
            System.out.println("Resultado final: " + a);
            System.out.println("================================");
            System.out.println("Deseja fazer OUTRA operação com esse resultado?");
            System.out.println("1 - Sim");
            System.out.println("Caso queira sair apenas clicar em qualquer número!");
            continuarPrograma = view.getValorInt();

        } while (continuarPrograma == 1);
        System.out.println("\nResultado final: " + a);
        System.out.println("Encerrando calculadora...");
        historico.exibirHistorico();
    }

    public double operationBasic(int select, double a){
        double resultado = a;
        int continueOperation;

        do {
            switch (select) {
                case 1:
                    resultado = calculator.getSoma(resultado);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calculator.getSubtracao(resultado);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calculator.getDivisao(resultado);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = calculator.getMultiplicacao(resultado);
                    System.out.println("Resultado: " + resultado);
                    break;
            }

            System.out.println("\nDeseja continuar com esta operação?");
            System.out.println("1 -> Sim (repetir operação)");
            System.out.println("Qualquer número -> Não (irá permitir trocar operação)");
            double b = view.getValorDouble();
            String operacao = null;
            if(select == 1){
                operacao = "+";
            }
            else if(select == 2){
                operacao = "-";
            }
            else if(select == 3){
                operacao = "/";
            }
            else if(select == 4){
                operacao = "*";
            }
            historico.adicionarOperacao(a,operacao,b,resultado);

            continueOperation = view.getValorInt();

        } while (continueOperation == 1);

        return resultado;
    }
}