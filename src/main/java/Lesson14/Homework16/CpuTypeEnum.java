package Lesson14.Homework16;

public enum CpuTypeEnum {
    X64("x64"),
    X86("x86"),
    ARM("arm");

    private String type;

    CpuTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return "CpuTypeEnum{" +
                " CPUType='" + type + '\'' +
                '}';
    }
}
