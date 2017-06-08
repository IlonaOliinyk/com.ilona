package Calculator;

/**
 * Created by ilona.oliinyk_tac on 25.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        int add1 = CalcSingletone.getInstance().add(1,4);
        int des1 = CalcSingletone.getInstance().subtraction(3,7);
        int mul1 = CalcSingletone.getInstance().multiply(3,7);
        int div1 = CalcSingletone.getInstance().div(21,8);

        System.out.println("result of +: " + add1 + "\n" + "result of -: " + des1 + "\n" + "result of *: " + mul1 + "\n" + "result of /: " + div1);


    }
}
