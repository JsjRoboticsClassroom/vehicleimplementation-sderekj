package nyc.c4q.dereksantos;

import java.util.Scanner;

public class Bank {

    private final int mNumber;
    private String mString;

    public Bank(int aNumber){
//        this.mNumber = aNumber; // this line of code and
        mNumber = aNumber; //this line of code are exactly the same. There's no difference when using this.
    }

    public Bank(String someString){
        mNumber = 0;
        mString = someString;
    }

    private void getString(){

    }

    public int withdraw(){

    }

    public static void robBank(Bank b){

    }

    public int withdraw(){
        robBank(this); // this refers to the class that you're in
    }

}
