package Lesson14.Homework16.Shop;

import Lesson14.Homework16.CpuTypeEnum;
import Lesson14.Homework16.Overheating;
import Lesson14.Homework16.PcComponents;

public class IntelCore extends PcComponents implements Overheating {

    private CpuTypeEnum type;

    public IntelCore(int frequency, String cpuName, String cpuManufacturer, String cpuType, CpuTypeEnum type) {
        super(frequency, cpuName, cpuManufacturer, cpuType);
        this.type = type;
    }

    public CpuTypeEnum getType() {
        return type;
    }

    public void setType(CpuTypeEnum type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "CPU: " + getCpuName() + "CPU Type: " + type.getType();
    }

    @Override
    public String toString() {
        return "PcComponents{" +
                " CPU frequency=" + getFrequency() +
                ", CPU Name='" + getCpuName() +
                ", CPU Manufacturer='" + getCpuManufacturer() +
                ", CPU Type='" + type.getType() +
                '}';
    }

    @Override
    public void overheating() {
        System.out.println("CPU can be overheated");
    }
}
