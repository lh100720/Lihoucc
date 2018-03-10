package com.haile.li;

/**
 * Created by lihou on 2018/3/7.
 * 计算器工厂类，封装计算方法
 */
public class OperationFactory {
    //创建计算器的方法，用于测试类的调用
    public  static Operation createOperation(String operate){
        Operation operation = new Operation();
        switch(operate)
        {
            case"+": operation = new OperationAdd();
                break;
            case"-": operation = new OperationSub();
                break;
            case"*": operation = new OperationMul();
                break;
            case"/": operation = new OperationDiv();
                break;
        }
        return operation;

    }
}
