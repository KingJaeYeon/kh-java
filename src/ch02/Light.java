package ch02;

public class Light {
    public static void main(String[] args) {
        //8바이트(64비트) 정수를 저장
        long lightSpeed;
        long distance;

        lightSpeed = 300000L; //L은 생략가능
        distance = lightSpeed * 365L * 24 * 60 * 60;
        //빛의속도 *24시* 60분 * 60초
        System.out.println("빛이 1년 동안 가는 거리: " + distance + "km");
    }
}
