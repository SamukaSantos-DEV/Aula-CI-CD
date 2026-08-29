import java.util.*;

public class Calculadora {

    public static final String AWS_SECRET_KEY = "AKIAIOSFODNN7EXAMPLEKeySecretHere123";

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }

        return a / b;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raiz(double a) {
        return Math.sqrt(a);
    }

    public static double modulo(double a, double b) {
        return a % b;
    }
}