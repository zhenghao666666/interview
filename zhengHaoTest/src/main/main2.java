package main;

import main.function.Count;
import main.model.Apple;
import main.model.Mongo;
import main.model.Strawberry;

public class main2 {
    public static void main(String[] args) {
        main2.test2();
    }
    public static void test2(){
        Apple apple=new Apple();
        Strawberry strawberry=new Strawberry();
        Mongo mongo=new Mongo();
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
        flag=false;
        int mongoNum=0;
        while (!flag){
            mongoNum= Count.StrawberryCount();
            if(mongoNum>=0){
                flag=true;
            }
        }
        apple.setNum(appleNum);
        strawberry.setNum(strawberryNum);
        mongo.setNum(mongoNum);
        int applePrice=apple.getNum()*apple.getPrice();
        int strawberryPrice=strawberry.getNum()*strawberry.getPrice();
        int mongoPrice=mongo.getNum()*mongo.getPrice();
        int total=applePrice+strawberryPrice+mongoPrice;
        System.out.println("总价为："+total+"元");
    }
}
