package Lesson14.Homework16.Shop;

import Lesson14.Homework16.CpuTypeEnum;
import Lesson14.Homework16.Overheating;
import Lesson14.Homework16.PcComponents;

public class AmdRyzen extends PcComponents implements Overheating {
    private int tdp;
    private CpuTypeEnum type;

    public AmdRyzen(int frequency, String cpuName, String cpuManufacturer, String cpuType, int tdp, CpuTypeEnum type) {
        super(frequency, cpuName, cpuManufacturer, cpuType);
        this.tdp = tdp;
        this.type = type;
    }

    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    public CpuTypeEnum getType() {
        return type;
    }

    public void setType(CpuTypeEnum type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "CPU: " + getCpuName() + ", Power package: " + getTdp() + ", CPU Type: " + getCpuManufacturer() + " " + type.getType();
    }
    
    @Override
    public String toString() {
        return "PcComponents{" +
                " CPU frequency=" + getFrequency() +
                ", CPU Name='" + getCpuName() +
                ", CPU Manufacturer='" + getCpuManufacturer() +
                ", CPU Power package='" + getTdp() +
                ", CPU Type='" + type.toString() +
                '}';
    }

    @Override
    public void overheating() {
        System.out.println("CPU can be overheated");
    }
}
