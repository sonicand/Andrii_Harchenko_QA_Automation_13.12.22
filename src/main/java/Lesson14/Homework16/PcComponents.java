package Lesson14.Homework16;

public abstract class PcComponents {

    private int frequency;
    private String cpuName;
    private String cpuManufacturer;
    private String cpuType;

    public PcComponents(int frequency, String cpuName, String cpuManufacturer, String cpuType) {
        this.frequency = frequency;
        this.cpuName = cpuName;
        this.cpuManufacturer = cpuManufacturer;
        this.cpuType = cpuType;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public String getCpuManufacturer() {
        return cpuManufacturer;
    }

    public void setCpuManufacturer(String cpuManufacturer) {
        this.cpuManufacturer = cpuManufacturer;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public abstract String getDescription();

}