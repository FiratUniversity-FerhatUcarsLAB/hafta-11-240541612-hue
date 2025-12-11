/*
240541612
Amr Mohammed 
11.12.2025
 */
public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // a * b + c islemi
        return a * b + c;
    }

    public static double expSum(double x) {
        // x * e^(-x) + sqrt(1 - e^(-x))
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }

    public static void main(String[] args) {

        // multadd basit test
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));

        // sin(pi/4) + cos(pi/4)/2
        double result1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        // log(10) + log(20)
        double result2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + result2);

        // expSum test
        double result3 = expSum(2.0);
        System.out.println("expSum(2) = " + result3);
    }
}

