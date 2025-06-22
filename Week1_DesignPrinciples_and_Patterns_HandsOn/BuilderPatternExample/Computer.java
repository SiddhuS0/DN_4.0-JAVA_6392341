package BuilderPatternExample;

public class Computer {
    //attributes
    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasMSoffice;
    private boolean hasGraphicsCard;
    



    //privateconstructor accessed through builder
    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasMSoffice = builder.hasMSoffice;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }


    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean hasMSoffice;
        private boolean hasGraphicsCard;
        
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        } 
        public Builder setMSoffice(boolean hasMSoffice) {
            this.hasMSoffice = hasMSoffice;
            return this;
        }
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

    //display method to show computer details
    public void displayConfiguration() {
        System.out.println("Computer Configuration:  ");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("WiFi: " + (hasMSoffice ? "Yes" : "No"));
        System.out.println("Graphics Card: " + (hasGraphicsCard ? "Yes" : "No"));

    }
}
