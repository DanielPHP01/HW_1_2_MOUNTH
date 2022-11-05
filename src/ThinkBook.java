final public class ThinkBook extends Laptop {

    private Integer year;
    private String model;


    public ThinkBook(Company companyName, CPUsType CPU, String nameVideoCard, String motherboard, Integer RAM, String[] laptopSkill, Color laptopColor, String material, String cameraModel, Integer year, String model) {
        super(companyName, CPU, nameVideoCard, motherboard, RAM, laptopSkill, laptopColor, material, cameraModel);
        this.year = year;
        this.model = model;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                +"\nModel " + model + "\nYear " + year;
    }
}
