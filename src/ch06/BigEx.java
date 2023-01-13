package ch06;

import java.math.BigInteger;

public class BigEx {
    static BigInteger factorial(int n){
        BigInteger fac = BigInteger.ONE;
        for (int i = 1; i<=n;i++){
            fac = fac.multiply(BigInteger.ONE);
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
