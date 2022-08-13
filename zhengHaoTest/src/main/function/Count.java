package main.function;

import java.util.Scanner;

public class Count {
    public static int AppleCount(){
        int appleNum;
        System.out.println("请输入购买苹果数量(大于等于 0 的整数)：");
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            appleNum=scanner.nextInt();
            if(appleNum<0){
                System.out.println("请重新输入大于等于 0 的整数！");
                return -1;
            }else {
                return appleNum;
            }
        }else {
            System.out.println("请重新输入大于等于 0 的整数！");
            return -1;
        }
    }
    public static int StrawberryCount(){
        int strawberryNum;
        System.out.println("请输入购买草莓数量(大于等于 0 的整数)：");
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            strawberryNum=scanner.nextInt();
            if(strawberryNum<0){
                System.out.println("请重新输入大于等于 0 的整数！");
                return -1;
            }else {
                return strawberryNum;
            }
        }else {
            System.out.println("请重新输入大于等于 0 的整数！");
            return -1;
        }
    }
    public static int MongoCount(){
        int mongoNum;
        System.out.println("请输入购买芒果数量(大于等于 0 的整数)：");
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            mongoNum=scanner.nextInt();
            if(mongoNum<0){
                System.out.println("请重新输入大于等于 0 的整数！");
                return -1;
            }else {
                return mongoNum;
            }
        }else {
            System.out.println("请重新输入大于等于 0 的整数！");
            return -1;
        }
    }
}
