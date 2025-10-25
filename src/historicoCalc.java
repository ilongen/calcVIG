import java.util.ArrayList;

public class historicoCalc {
    private ArrayList<String> historico;

    public historicoCalc() {
        this.historico = new ArrayList<>();
    }

    public void adicionarOperacao(double a, String operacao,double b, double resultado) {
        String registro = a + " " + operacao + " " + b + " = " + resultado;
        historico.add(registro);
        System.out.println("✓ Operação adicionada ao histórico");
    }

    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
            return;
        }

        System.out.println("\n========== HISTÓRICO ==========");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println((i + 1) + ": " + historico.get(i));
        }
        System.out.println("Total de operações: " + historico.size());
        System.out.println("================================\n");
    }
}