public class createComputer {
    private CPUsType CPU;
    private String nameVideoCard, motherboard;
    private Integer RAM;



    public Company getCompanyName() {
        return companyName;
    }

    private Company companyName;

    public createComputer(Company companyName, CPUsType CPU, String nameVideoCard, String motherboard, Integer RAM) {
        this.companyName = companyName;
        this.CPU = CPU;
        this.nameVideoCard = nameVideoCard;
        this.motherboard = motherboard;
        this.RAM = RAM;
    }

    public CPUsType getCPU() {
        return CPU;
    }

    public String getNameVideoCard() {
        return nameVideoCard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public Integer getSsd() {
        return RAM;
    }
}
