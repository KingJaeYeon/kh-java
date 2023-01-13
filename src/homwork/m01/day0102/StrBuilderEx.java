package homwork.m01.day0102;

public class StrBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str1 = "I am a";
        String str2 = " Java Programmer";

        sb.append(str1).append(str2);
        System.out.println(sb);

        sb.replace(7,11,"JSP");
        System.out.println(sb);

        System.out.println(sb.substring(7));
    }
}
