package ch05;

public class StringArray2 {
    public static void main(String[] args) {
        String[] str = new String[]{"Java", "DB", "JSP", "Spring" };
        StringBuilder sb = new StringBuilder();
        for (String value : str){
            sb.append(value).append("\n");
        }
        System.out.print(sb);
    }
}
