public class Main {
    public static void main(String[] args) {
        Company macBook = new Company("Apple", "TSUM");
        Company lenovo = new Company("Lenovo", "TSUM");
        Laptop laptop = new Laptop(macBook, CPUsType.INTEL, "GTX 1050 Ti", "2019 A1932", 16, new String[]{"fingerprint ", " touchscreen ", " Web camera ", " keyboard backlight "}, Color.WHITE, "Aluminum", "Face Time");
        System.out.println(laptop.getInfo("PRO", 2021));
        ThinkBook thinkBookPro = new ThinkBook(lenovo, CPUsType.AMD, "RTX 3090", "Thinkbook 15 G2",32, new String[]{"fingerprint ", " touchscreen ", " Web camera ", " keyboard backlight "},Color.BLACK,"Aluminum","Sony",2022,"Lenovo ThinkBook Pro");
        System.out.println(thinkBookPro.getInfo());
        ThinkBook thinkBook = new ThinkBook(lenovo, CPUsType.AMD, "AMD Radeon", "Thinkbook 15 G2",
                8, new String[]{"fingerprint ", " touchscreen ", " Web camera ", " keyboard backlight "},Color.RED,"Aluminum","Sony",2022,"Lenovo ThinkBook");
        System.out.println(thinkBook.getInfo());
    }
}