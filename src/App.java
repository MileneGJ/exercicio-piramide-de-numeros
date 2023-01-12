public class App {
    public static void main(String[] args) throws Exception {

        int quantidade = 5;

        for(int i=1; i<=quantidade; i++) {
            String printedNum = ""+i;
            for(int j =1; j<i; j++) {
                printedNum += i;
            }
            System.out.println(printedNum);   
        }
    }
}
