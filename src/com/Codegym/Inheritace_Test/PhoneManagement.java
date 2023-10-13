package com.Codegym.Inheritace_Test;

public class PhoneManagement {
    public static void main(String[] args) {
        IPhone iphone = new IPhone(1, "iphone 15", "black", 1000, 2);
        iphone.setHasButtonVirtual(true);
        Samsung samsung = new Samsung(1, "galaxy note 22", "black", 1000, 3);
        samsung.setHasPen(true);

        Phone otherPhone = new IPhone();
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(otherPhone);
        System.out.println(iphone.getModel());
    }
}
