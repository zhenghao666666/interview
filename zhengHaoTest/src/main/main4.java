package main;

import main.function.Count;
import main.model.Apple;
import main.model.Mongo;
import main.model.Strawberry;

public class main4 {
    public static void main(String[] args) {
        main4.test2();
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
            mongoNum= Count.MongoCount();
            if(mongoNum>=0){
                flag=true;
            }
        }
        apple.setNum(appleNum);
        strawberry.setNum(strawberryNum);
        mongo.setNum(mongoNum);
        int applePrice=apple.getNum()*apple.getPrice();
        int strawberryPrice=strawberry.getNum()*strawberry.getPrice();
        Double strawberryNewPrice=strawberryPrice*0.8;
        int mongoPrice=mongo.getNum()*mongo.getPrice();
        Double total=applePrice+strawberryNewPrice+mongoPrice;
        int discount=0;
        if(total>=100){
            int discountNum=(int)(total/100)%10;
            discount=discountNum*10;
        }
        Double finalPrice=total-discount;
        System.out.println("总价为："+finalPrice+"元");
    }
}
