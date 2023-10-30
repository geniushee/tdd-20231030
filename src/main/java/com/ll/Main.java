package com.ll;

public class Main {
    public static void main(String[] args) {
        Calc Calc;
        String text;

        Calc = new Calc();
        text = "3 * 1";
        Calc.run(text);
        System.out.println(text + " = " + Calc.getRes());
    }
}