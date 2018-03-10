package com.haile.li;

/**
 * Created by lihou on 2018/3/7.
 * 继承于Operation类的除法类
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if(getNumber2() == 0){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
            }
        }
        result = getNumber1() / getNumber2();
        return result;
    }
}
