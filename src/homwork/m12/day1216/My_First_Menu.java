package homwork.m12.day1216;

import java.util.Scanner;

public class My_First_Menu {
    public static void main(String[] args) {
        boolean run = true;
        String[] korFood = new String[]{"김치찌개","된장찌개","삼겹살","비빔밥"};
        String[] japFood = new String[]{"돈까스","비프스테이크","카레라이스"};
        String[] chFood = new String[]{"짜장면","짬뽕","탕수육"};
        int choose_menu = 10;
        Scanner sc = new Scanner(System.in);
        outer:
        while (run){

            System.out.println("==[메 뉴]==");
            System.out.println("(1) 한식");
            System.out.println("(2) 양식");
            System.out.println("(3) 중식");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
            choose_menu = sc.nextInt();
            if (choose_menu>3||choose_menu<1){
                System.out.println("잘못된 메뉴를 골랐습니다.");
                continue outer;
            }

            else if (choose_menu == 0) break;
            else {
                if (choose_menu == 1){
                    System.out.println("[한식메뉴]");
                    for (int i = 0 ; i<korFood.length;i++){
                        System.out.printf("%d.%s\n",i+1,korFood[i]);
                    }
                    System.out.print("한식메뉴를 선택하세요(한식메뉴선택종료: 0, 전체 종료:99)>");
                    int num = sc.nextInt();
                    if (num == 99){
                        break ;
                    }
                    else if (num == 0){
                        continue outer;
                    }
                    else
                        System.out.printf(">>고객님은 %s을 선택하였습니다.\n",korFood[num-1]);
                }
                else if (choose_menu == 2){
                    System.out.println("[양식메뉴]");
                    for (int i = 0 ; i<japFood.length;i++){
                        System.out.printf("%d.%s\n",i+1,japFood[i]);
                    }
                    System.out.print("메뉴를 선택하세요(양식메뉴선택종료: 0, 전체 종료:99)>");
                    int num = sc.nextInt();
                    if (num == 99){
                        break ;
                    }
                    else if (num == 0){
                        continue outer;
                    }
                    else
                        System.out.printf(">>고객님은 %s을 선택하였습니다.\n",japFood[num-1]);
                }
                else if (choose_menu ==3){
                    System.out.println("[중식메뉴]");
                    for (int i = 0 ; i<chFood.length;i++){
                        System.out.printf("%d.%s\n",i+1,chFood[i]);
                    }
                    System.out.print("중식메뉴를 선택하세요(한식메뉴선택종료: 0, 전체 종료:99)>");
                    int num = sc.nextInt();
                    if (num == 99){
                        break ;
                    }
                    else if (num == 0){
                        continue outer;
                    }
                    else
                        System.out.printf(">>고객님은 %s을 선택하였습니다.\n",korFood[num-1]);
                }
            }

        }
        System.out.println("프로그램을 모두 종료합니다.");
    }
}
