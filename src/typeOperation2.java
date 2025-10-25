public class typeOperation2 extends calcComplex{
    private final calcComplex calcComplex;

    public typeOperation2( ) {
        this.calcComplex = new calcComplex();
    }

    public void operationComplex (){
        System.out.println("Qual operação deseja selecionar?");
        System.out.println("1: % , 2: log");
        int select = input.nextInt();
        while (select < 1 || select > 2) {
            System.out.println("Operação não localizada, tente novamente!");
            System.out.println("---------------------------------");
            System.out.println("Qual operação deseja selecionar?");
            System.out.println("1: % , 2: log");
            select = input.nextInt();
        }
        double resultant;
        switch (select){
            case 1:
                do {
                    resultant = calcComplex.porcentagem();
                    System.out.println("Resultado: " + resultant);
                    System.out.println("Deseja continuar? 1- Sim");
                    select = input.nextInt();
                } while (select == 1);
                break;
            case 2:
                do {
                    resultant = calcComplex.log();
                    System.out.println("Resultado: " + resultant);
                    System.out.println("Deseja continuar? 1- Sim");
                    select = input.nextInt();

                } while (select == 1);
                break;
        }
    }
}
