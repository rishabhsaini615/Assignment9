package com.assignment9;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class calculatePay {
    public static String formatOfCurrency(double amount){
        Locale cad = new Locale("EN","CA");
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(cad);
        return defaultFormat.format(amount);
    }
    public static void main(String[] args) {

        double sales, rate=0, commission, advance, pay;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the monthly sales of the person:");
        sales = scan.nextDouble();
        System.out.println("Enter the advance pay:");
        advance= scan.nextDouble();
        if (sales<10000){
            rate = 0.05;
        }
        else if (sales>=10000 &&  sales<14999 ){
            rate = 0.10;
        }
        else if (sales>=15000 &&  sales<17999 ){
            rate = 0.12;
        }
        else if (sales>=18000 &&  sales<21999 ){
            rate = 0.15;
        }
        else if (sales>=22000){
            rate = 0.16;
        }
        commission =  rate * sales;
        System.out.println("Commission: "+formatOfCurrency(commission));
        commission = commission - advance;
        System.out.println("After deducting advance pay Final Commission : "+formatOfCurrency(commission));
        if (commission<0){
            commission=-(commission);
            System.out.println("The sales person must reimburse "+formatOfCurrency(commission)+" back ");
        }
    }
}