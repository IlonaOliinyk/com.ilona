package Calculator;

/**
 * Created by ilona.oliinyk_tac on 25.05.2017.
 */
public class CalcSingletone {

    private static CalcSingletone instance = null;

    protected CalcSingletone(){

    }

    public static CalcSingletone getInstance(){
        if(instance == null){
            instance = new CalcSingletone();
        }
        return instance;
    }

  int add (int a, int b){
      return a + b;
  }

    int subtraction (int a, int b){
        return a - b;
    }

    int multiply (int a, int b){
        return a * b;
    }

    int div (int a, int b){
        return a / b;
    }
}
