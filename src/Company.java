import java.util.Random;

public class Company {


    private Integer phoneNumber = new Random().nextInt(999999999) + 111111111;
    private String name;
    private String address;

    public Company(String name , String address) {
        this.name = name;
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

