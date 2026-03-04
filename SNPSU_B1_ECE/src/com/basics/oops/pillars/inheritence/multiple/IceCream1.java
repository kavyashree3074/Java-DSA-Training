package com.basics.oops.pillars.inheritence.multiple;

public interface IceCream1 {
    String icecream1();
}
interface IceCream2{
    String icecream2();
}
interface IceCream3{
    String icecream3();
}
class IceCreams implements IceCream1,IceCream2,IceCream3{

    @Override
    public String icecream1() {
        return "choco";
    }

    @Override
    public String icecream2() {
        return "vanilla";
    }

    @Override
    public String icecream3() {
        return "berry";
    }

    public static void main(String[] args) {
        IceCreams iceCreams = new IceCreams();
        System.out.println(iceCreams.icecream1());
        System.out.println(iceCreams.icecream2());
        System.out.println(iceCreams.icecream3());
    }
}