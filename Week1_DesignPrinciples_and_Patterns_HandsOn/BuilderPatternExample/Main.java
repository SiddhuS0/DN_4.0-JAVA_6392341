package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        //gaming pc config
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setMSoffice(false)
                .setGraphicsCard(true)
                .build();
        gamingPC.displayConfiguration();

        //normal pc config
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("512GB HDD")
                .setMSoffice(true)
                .setGraphicsCard(false)
                .build();
        officePC.displayConfiguration();

        //budget pc config
        Computer barebonePC = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM("4GB")
                .setStorage("256GB SSD")
                .build();
        barebonePC.displayConfiguration();
        //
    }
}
