package com.haile.li;

import java.util.Scanner;

/**
 * Created by lihou on 2018/3/7.
 * 计算器测试类
 */
public class OperationTest {
    public static void main(String args[]){
        System.out.print("请输入要计算的公式：" );
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.next();
        OperationUtil operationUtil = new OperationUtil();
        double result = operationUtil.calculate(formula);
        System.out.println("结果为：" + result);

    }
}
