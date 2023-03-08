package Lesson14.Homework16.Shop;

import Lesson14.Homework16.CpuTypeEnum;
import Lesson14.Homework16.Overheating;
import Lesson14.Homework16.PcComponents;

public class AppleM1 extends PcComponents implements Overheating {

    private String mountType;
    private CpuTypeEnum type;

    public AppleM1(int frequency, String cpuName, String cpuManufacturer, String cpuType, String mountType, CpuTypeEnum type) {
        super(frequency, cpuName, cpuManufacturer, cpuType);
        this.mountType = mountType;
        this.type = type;
    }

    public String getMountType() {
        return mountType;
    }

    public void setMountType(String mountType) {
        this.mountType = mountType;
    }

    public CpuTypeEnum getType() {
        return type;
    }

    public void setType(CpuTypeEnum type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "CPU: " + getCpuName() + "Type: " + getMountType() + "CPU Type: " + getCpuManufacturer() + " " + type.getType();
    }

    @Override
    public String toString() {
        return "PcComponents{" +
                " CPU frequency=" + getFrequency() +
                ", CPU Name='" + getCpuName() +
                ", CPU Manufacturer='" + getCpuManufacturer() +
                ", CPU Mount Type='" + getMountType() +
                ", CPU Type='" + type.getType() +
                '}';
    }

    @Override
    public void overheating() {
        System.out.println("CPU can be overheated");
    }
}
