package com.haile.li;

/**
 * Created by lihou on 2018/3/7.
 * 计算器逻辑代码，分为括号外及括号内的情况
 */
public class OperationUtil {
     Integer firstIndex = 0;
     Integer secondIndex = 0;
     double result = 0;
     String newString ="";
     public  double calculate(String string ){
         String[] array = string.split("");
         for (int i = 0;i < array.length;i++){
             //判断有无括号并找到括号所在的位置
             if (array[i].equals("(")){
                 firstIndex = i;
             }
             if(array[i].equals(")")){
                 secondIndex = i;
             }
             if(secondIndex != 0) {
                 newString = string.substring(firstIndex + 1, secondIndex);
             }
         }
         //计算没有括号的情况
         if (firstIndex == 0 && secondIndex == 0){
             OperationOrder operationOrder = new OperationOrder();
             result = operationOrder.operationOrder(string);
         }
         //计算括号中的内容
         if (firstIndex != 0 || secondIndex != 0) {
             OperationOrder operationOrder = new OperationOrder();
             result = operationOrder.operationOrder(newString);
             String string1 = string.substring(0, firstIndex);
             String string2 = string.substring(secondIndex + 1);
             newString = string1  + (int) result+ string2;
             //计算括号外的内容
             OperationOrder operationOrder2 = new OperationOrder();
             result = operationOrder2.operationOrder(newString);
         }
          return result;
     }
}
