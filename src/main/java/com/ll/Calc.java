package com.ll;

import lombok.Getter;

public class Calc {
    @Getter
    private int Res;
    private String Operate;

    Calc() {
        Res = 0;
        Operate = "+";
    }

    public int run(String exp) {
        if (exp.isBlank()) return 0;

        if (operateCheck(exp)) {
            String[] Sarray = operateSplit(exp);
            int[] intarray = StringAsInt(Sarray);

            switch (Operate) {
                case "\\+":
                    Res = plus(intarray);
                    break;
                case "-":
                    Res = minus(intarray);
                    break;
                case "\\*":
                    Res = multiple(intarray);
                    break;
                case "/":
                    Res = divide(intarray);
                    break;
            }
        }


        return Res;
    }

    Boolean operateCheck(String exp) {
        return exp.contains("+") || exp.contains("-") || exp.contains("*") || exp.contains("/");
    }

    String[] operateSplit(String exp) {
        if (exp.contains("+")) { //곱하기 분기
            Operate = "\\+";
        } else if (exp.contains("-")) { //더하기 분기
            Operate = "-";
        } else if (exp.contains("*")) {
            Operate = "\\*";
        } else if (exp.contains("/")) {
            Operate = "/";
        }


        String[] Sarray = exp.split(Operate);
        for(int i = 0;i<Sarray.length;i++){
            Sarray[i] = Sarray[i].trim();
        }
        return Sarray;
    }

    int[] StringAsInt(String[] Sarray) {
        for (int i = 0; i < Sarray.length; i++) {
            if (operateCheck(Sarray[i])) {
                Sarray[i] = String.valueOf(run(Sarray[i]));
            }
        }

        int[] intarray = new int[2];
        intarray[0] = Integer.parseInt(Sarray[0].trim());
        intarray[1] = Integer.parseInt(Sarray[1].trim());

        return intarray;
    }

    private int multiple(int[] intarray) {
        return intarray[0] * intarray[1];
    }

    int plus(int[] intarray) {
        return intarray[0] + intarray[1];
    }

    int minus(int[] intarray) {
        return intarray[0] - intarray[1];
    }

    int divide(int[] intarray) {
        return intarray[0] / intarray[1];
    }
}
