package homwork.m01.day0102;

public class WrapperEx3 {
    public static void main(String[] args) {
        String str = "Hello 1234";
        isCharacter(str);
        System.out.println("--------------------------");
        isInteger(str);
    }

    private static void isInteger(String str) {
        System.out.println("(Integer 사용)");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c))
                sb.append(c);
        }
        System.out.println("문자 " + sb + "입니다.");
        Integer arr = Integer.parseInt(sb.toString());
        System.out.println("숫자 " + arr + "입니다.");
        System.out.printf("숫자 %d + %d = %d입니다.", arr, 2, arr + 2);

    }

    public static void isCharacter(String str) {
        System.out.println("(Character 사용)");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                System.out.printf("%c는 대문자입니다.\n", c);
            else if (Character.isLowerCase(c))
                System.out.printf("%c는 소문자입니다.\n", c);
            else if (Character.isDigit(c))
                System.out.printf("%c는 숫자입니다.\n", c);
        }
    }
}
