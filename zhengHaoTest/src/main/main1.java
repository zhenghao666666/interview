package main;

import main.function.Count;
import main.model.Apple;
import main.model.Strawberry;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        main1.test1();
    }
    public static void test1(){
        Apple apple=new Apple();
        Strawberry strawberry=new Strawberry();
        Boolean flag=false;
        int appleNum=0;
        while (!flag){
            appleNum= Count.AppleCount();
            if(appleNum>=0){
                flag=true;
            }
        }
        flag=false;
        int strawberryNum=0;
        while (!flag){
            strawberryNum= Count.StrawberryCount();
            if(strawberryNum>=0){
                flag=true;
            }
        }
        apple.setNum(appleNum);
        strawberry.setNum(strawberryNum);
        int applePrice=apple.getNum()*apple.getPrice();
        int strawberryPrice=strawberry.getNum()*strawberry.getPrice();
        int total=applePrice+strawberryPrice;
        System.out.println("总价为："+total+"元");
    }
}
