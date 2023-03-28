package seminar6;

public class Laptop {
    private String brand;
    private String model;
    private double screenDiagonal;
    private String typeCPU;
    private int volumeRam;
    private String typeHardDrive;
    private int volumeHardDrive;
    private String color;

    public Laptop(String brand, String model, double screenDiagonal, String typeCPU, int volumeRam,
                  String typeHardDrive, int volumeHardDrive, String color) {
        this.brand = brand;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.typeCPU = typeCPU;
        this.volumeRam = volumeRam;
        this.typeHardDrive = typeHardDrive;
        this.volumeHardDrive = volumeHardDrive;
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getTypeCPU() {
        return typeCPU;
    }

    public void setTypeCPU(String typeCPU) {
        this.typeCPU = typeCPU;
    }

    public int getVolumeRam() {
        return volumeRam;
    }

    public void setVolumeRam(int volumeRam) {
        this.volumeRam = volumeRam;
    }

    public String getTypeHardDrive() {
        return typeHardDrive;
    }

    public void setTypeHardDrive(String typeHardDrive) {
        this.typeHardDrive = typeHardDrive;
    }

    public int getVolumeHardDrive() {
        return volumeHardDrive;
    }

    public void setVolumeHardDrive(int volumeHardDrive) {
        this.volumeHardDrive = volumeHardDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenDiagonal=" + screenDiagonal +
                ", typeCPU='" + typeCPU + '\'' +
                ", volumeRam=" + volumeRam +
                ", typeHardDrive='" + typeHardDrive + '\'' +
                ", volumeHardDrive=" + volumeHardDrive +
                ", color='" + color + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }
}
