package com.HelloWorld;
import java.util.Scanner;

public class Profit {
    double money;
    int month;
    double rate;
    public double cal(){
        for(int i = 0; i < month; i++){
            money += money * rate / 100;
        }
        return money;
    }
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        money = sc.nextDouble();
        System.out.println("Enter month");
        month = sc.nextInt();
        System.out.println("Enter rate");
        rate = sc.nextDouble();
    }
    public void display(){
        System.out.println("Amount gonna get after " + month + " is " + money);
    }
    public static void main(String[] args) {
	// write your code here
        Profit p = new Profit();
        p.getInfo();
        p.cal();
        p.display();
    }
}
