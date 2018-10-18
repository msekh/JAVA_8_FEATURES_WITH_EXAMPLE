package methodReferenceExistingObject;

import java.util.function.Consumer;

public class Computer {

    private int serialNumber;
    private String brandName;

    public Computer(int serialNumber, String brandName) {
        this.serialNumber = serialNumber;
        this.brandName = brandName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void execute(Computer computer, Consumer<Computer> c) {
        c.accept(computer);
    }
}