public class main {
    public static void main(String[] args) {

        view view = new view();
        typeOperation operation = new typeOperation();
        typeOperation2 operation2 = new typeOperation2(view);
        view.viewInitial();
        int select = view.viewSelect();
        if(select == 1){
            operation.calcinitial();
            view.viewFinal();
        } else {
            operation2.operationComplex();
            view.viewFinal();
        }
    }
}
