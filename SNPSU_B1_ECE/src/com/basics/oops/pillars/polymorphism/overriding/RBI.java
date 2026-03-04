package com.basics.oops.pillars.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 6.8;
    }
}
class Canara extends RBI{
    @Override
    double rateOfInterest(){
        return 7.5;
    }

    public static void main(String[] args) {
        // Upcasting -> Parent obj = new child
        RBI rbi = new RBI();
        RBI hdfc = new HDFC();
        RBI icici = new ICICI();
        RBI canara = new Canara();
        System.out.println("The ROI of: " + rbi.rateOfInterest()+ " is " + "%");
        System.out.println("The ROI of: " + hdfc.rateOfInterest()+ " is " + "%");
        System.out.println("The ROI of: " + icici.rateOfInterest()+ " is " + "%");
        System.out.println("The ROI of: " + canara.rateOfInterest()+ " is " + "%");
    }
}