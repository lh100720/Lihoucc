package com.haile.li;

/**
 * Created by lihou on 2018/3/8.
 * 控制没有括号情况下的加减乘除的顺序的类
 */
public class OperationOrder {
    public double operationOrder(String string ){
        double number1 = 0;
        double number2 = 0;
        double result = 0;
        int i = 0;
        int j = 0;
        String[] array = string.split("");
        for(i = 0;string.contains("*") ;i++){
           if (array[i].equals("*") && i != 0){
               Operation operation = OperationFactory.createOperation("*");
               //GetValue getValue = new GetValue();
              // number1 = getValue.getLeftValue(string,"*",i);
              // number2 = getValue.getRightValue(string,"*",i);
               operation.setNumber1(Double.parseDouble(array[i - 1]));
               operation.setNumber2(Double.parseDouble(array[i + 1]));
               result = operation.getResult();
               String string1 = string.substring(0,i-1);
               String string2 = string.substring(i+2);
               string = string1 + (int)result + string2 ;
               array = string.split("");
               i = 0;

           }
        }
        //System.out.print(string);
        array = string.split("");
        for(j = 0;string.contains("/");j++){
            if (array[j].equals("/") && j != 0) {
                Operation operation2 = OperationFactory.createOperation("/");
                operation2.setNumber1(Double.parseDouble(array[j - 1]));
                operation2.setNumber2(Double.parseDouble(array[j + 1]));
                result = operation2.getResult();
                String string3 = string.substring(0, j - 1);
                String string4 = string.substring(j + 2);
                string = string3 +  (int)result + string4;
                array = string.split("");
                j = 0;
            }
        }

        //System.out.print(string);
        array = string.split("");
        for(j = 0;string.contains("+");j++){
            if (array[j].equals("+") && j != 0) {
                Operation operation2 = OperationFactory.createOperation("+");
                operation2.setNumber1(Double.parseDouble(array[j - 1]));
                operation2.setNumber2(Double.parseDouble(array[j + 1]));
                result = operation2.getResult();
                String string3 = string.substring(0, j - 1);
                String string4 = string.substring(j + 2);
                string = string3 + (int) result + string4;
                array = string.split("");
                j = 0;
            }
        }
        //System.out.print(string);
        array = string.split("");
        for(j = 0;string.contains("-");j++){
            if (array[j].equals("-") && j != 0) {
                Operation operation2 = OperationFactory.createOperation("-");
                operation2.setNumber1(Double.parseDouble(array[j - 1]));
                operation2.setNumber2(Double.parseDouble(array[j + 1]));
                result = operation2.getResult();
                String string3 = string.substring(0, j - 1);
                String string4 = string.substring(j + 2);
                string = string3 + (int) result + string4;
                array = string.split("");
                j = 0;
            }
        }
        return result;
    }
}
