public record typeOperation(view view, historicoCalc historico) {

    public void iniciar() {
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

            while (select < 1 || select > 4) {
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

    public double operationBasic(int select, double a) {
        double resultado = a;
        int continueOperation;

        // POLIMORFISMO: Cria a operação baseado no select
        IOperacao operacao = FabricaOperacoes.criar(select);

        do {
            System.out.println("Digite o segundo valor:");
            double b = view.getValorDouble();

            try {
                double valorAnterior = resultado;

                // Calcula usando a interface (polimorfismo)
                resultado = operacao.calcular(resultado, b);

                System.out.println("Resultado: " + resultado);

                // Adiciona ao histórico com o símbolo correto
                historico.adicionarOperacao(
                        valorAnterior,
                        operacao.getSimbolo(),
                        b,
                        resultado
                );

            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("\nDeseja continuar com esta operação?");
            System.out.println("1 -> Sim (repetir operação)");
            System.out.println("Qualquer número -> Não (irá permitir trocar operação)");
            continueOperation = view.getValorInt();

        } while (continueOperation == 1);

        return resultado;
    }
}