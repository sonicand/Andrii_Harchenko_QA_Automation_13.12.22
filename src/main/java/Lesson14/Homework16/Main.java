package Lesson14.Homework16;

import Lesson14.Homework16.Shop.AmdRyzen;
import Lesson14.Homework16.Shop.AppleM1;
import Lesson14.Homework16.Shop.IntelCore;

public class Main {
    public static void main(String[] args) {
        AmdRyzen amdRyzen = new AmdRyzen(4000, "Ryzen 5 5800h", "AMD", "APU", 45, CpuTypeEnum.X86);
        System.out.println(amdRyzen.toString());
        AppleM1 appleM1 = new AppleM1(3500, "M1 Max", "Apple", "APU", "Integrated", CpuTypeEnum.ARM);
        System.out.println(appleM1.toString());
        IntelCore intelCore = new IntelCore(5000, "Core i5", "Intel", "Desktop", CpuTypeEnum.X64);
        System.out.println(intelCore.toString());

    }
}
