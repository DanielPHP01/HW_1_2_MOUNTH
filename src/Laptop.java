import java.util.Arrays;

public class Laptop extends createComputer {
    private String[] laptopSkill;
    private Color laptopColor;
    private String material, cameraModel;

    public Laptop(Company companyName, CPUsType CPU, String nameVideoCard, String motherboard, Integer RAM, String[] laptopSkill, Color laptopColor, String material, String cameraModel) {
        super(companyName, CPU, nameVideoCard, motherboard, RAM);
        this.laptopSkill = laptopSkill;
        this.laptopColor = laptopColor;
        this.material = material;
        this.cameraModel = cameraModel;
    }

    public String[] getLaptopSkill() {
        return laptopSkill;
    }

    public Color getLaptopColor() {
        return laptopColor;
    }

    public String getMaterial() {
        return material;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    final public String getInfo(String MacBook, Integer year) {
        return
                "Company Name " + getCompanyName().getName() +
                        "\nCompany Address " + getCompanyName().getAddress() +
                        "\nCompany Phone Number " + getCompanyName().getPhoneNumber() +
                        "\nCPU " + getCPU() +
                        "\n Video Card" + getNameVideoCard() +
                        "\n Mother Board " + getMotherboard() +
                        "\n RAM " + getSsd() +
                        "\n Laptop function " + Arrays.toString(laptopSkill) +
                        "\n Color " + laptopColor +
                        "\n Material " + material +
                        "\n Camera Model " + cameraModel +
                        "\n MacBook " + MacBook +
                        "\n Year " + year;
    }


    public String getInfo() {
        return "Company Name " + getCompanyName().getName() +
                "\nCompany Address " + getCompanyName().getAddress() +
                "\nCompany Phone Number " + getCompanyName().getPhoneNumber() +
                "\n CPU " + getCPU() +
                "\n Video Card " + getNameVideoCard() +
                "\n Mother Board " + getMotherboard() +
                "\n RAM " + getSsd() +
                "\n Laptop function " + Arrays.toString(laptopSkill) +
                "\n Color " + laptopColor +
                "\n Material " + material +
                "\n Camera Model " + cameraModel;
    }
}
