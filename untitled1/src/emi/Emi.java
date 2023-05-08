package emi;

import java.util.Scanner;

public class Emi {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        double principal, rate, time, emi,dp;
        System.out.print("Enter Down Payment: ");
        dp = a.nextFloat();

        System.out.print("Enter Amount: ");
        principal = a.nextFloat();
        if (dp>principal){
            System.out.println("Incorrect Amount Please Enter Valid Amount");
        }
        else {
            principal = principal-dp;

            System.out.print("Enter Interest: ");
            rate = a.nextFloat();
            rate=rate/(12*100);

            System.out.print("Enter time in year: ");
            time = a.nextFloat();
            time=time*12;

            emi= emiCalculation(principal,rate,time);
            System.out.print("Monthly EMI is= "+emi+"\n");
        }
    }
    static double emiCalculation(double p,double r,double t)
    {
        double e= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
        return e;
    }


}
