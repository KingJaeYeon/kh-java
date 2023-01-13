package homwork.m12.day1216;

public class BreakEx4 {
    public static void main(String[] args) {
        boolean run = true;
        int n =1;
        System.out.println("------------------------------");
        while (run){

            System.out.printf("%d Hello World\n",n++);
            if (n==8){
                System.out.printf("%d Hello World\n",n);
                break;
            }
        }
        System.out.println("n값이 8이며 while문 빠져나옴");
        System.out.println("------------------------------");
    }
}
