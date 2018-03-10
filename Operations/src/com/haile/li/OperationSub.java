package com.haile.li;

/**
 * Created by lihou on 2018/3/7.
 * 继承于Operation类的减法类
 */
public class OperationSub  extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber1() - getNumber2();
        return result;
    }
}
