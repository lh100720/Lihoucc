package com.haile.li;

/**
 * Created by lihou on 2018/3/9.
 * 取运算符两边数字的方法
 */
public class GetValue {
    int i = 0;
    double number1 = 0;
    double number2 = 0;

    public double getLeftValue(String string, String operate,int i) {
        String[] array = string.split("");
            if (array[i].equals(operate) && i != 0) {
                for (int j = 1; number1 == 0; j++) {
                    if (i - j == 0) {

                        if (i == 1) {
                            number1 = Double.parseDouble(array[i - j]);
                        }
                        if (i == 2) {
                            number1 = Double.parseDouble(array[i - j + 1]) + Double.parseDouble(array[i - j]) * 10;
                        }
                        if (i == 3) {
                            number1 = Double.parseDouble(array[i - j + 2]) * 100 + Double.parseDouble(array[i - j + 1])
                                    + Double.parseDouble(array[i - j]) * 10;
                        }
                    }
                    if (i - j - 1 >= 0) {
                        if (array[i - j - 1].equals("") || array[i - j - 1].equals("+") || array[i - j - 1].equals("-") || array[i - j - 1].equals("*")
                                || array[i - j - 1].equals("/") || array[i - j - 1].equals("(") || array[i - j - 1].equals("）")) {
                            number1 = /*Double.parseDouble(array[i - j - 2]) * 100 + */Double.parseDouble(array[i - j]) + Double.parseDouble(array[i - j - 1]) * 10;
                        }
                    }
                }

            }

        return number1;
    }

    public double getRightValue(String string, String operate,int i) {
        String[] array = string.split("");
            if (array[i].equals(operate) && i != 0) {
                for (int j = 1; number2 == 0; j++) {
                    if (i + j + 1 ==array.length){
                        number2 = Double.parseDouble(array[i+j]) + Double.parseDouble(array[i+ j - 1]) * 10;
                    }
                    if (i + j + 1 < array.length ){
                        if (array[i + j + 1].equals("") || array[i + j  + 1].equals("+") || array[i + j  + 1].equals("-") || array[i + j  + 1].equals("*")
                                || array[i + j + 1].equals("/") || array[i + j + 1].equals("(") || array[i + j + 1].equals("）")) {
                            number2 = Double.parseDouble(array[i+ j]) + Double.parseDouble(array[i+ j - 1]) * 10 /*+ Double.parseDouble(array[i+ j - 2]) * 100*/;
                        }
                    }
                }

                }
        return number2;
    }
    }

