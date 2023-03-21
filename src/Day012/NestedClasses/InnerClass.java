package NestedClasses;

public class InnerClass {
    /**
     * Каждый обьект inner class всегда ассоциируется с обьектом внешнего класса.
     * <p>
     * Создавая обьект inner class нужно перед этим создать обьект  его внешнего класса.
     * <p>
     * Іnner класс может содеражать только non-static элементы
     * <p>
     * Inner класс может обращаться даже к private элемантам внешнего класса
     * <p>
     * Внешний класс моежет обращаться даже к private элементам inner класса, прежде создав его обьект.
     */
    public static void main(String[] args) {
        Computer computer = new Computer("Asus", "ROG Stix G15", 2022, "Ryzen 7 6800H",
                16, 512, "RTX 3060;");
        Computer.LocalParameters localParameters = computer.new LocalParameters("Windows 11", "Andit Sinko",
                2007, "sinkoandriy7@gmail.com", "kaspersky", "google", "russian",
                "slovakia", "qwerty");
        computer.setLocalParameters(localParameters);
        System.out.println(computer);
    }
}

class Computer {
    ComputerParameters computerParameters;
    LocalParameters localParameters;

    public Computer(String name, String model, int ageString, String processor,
                    int ram, int ssd, String videoCard) {
        this.computerParameters = this.new ComputerParameters(name, model, ageString, processor, ram, ssd, videoCard);
    }

    public void setLocalParameters(LocalParameters localParameters) {
        this.localParameters = localParameters;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerParameters=" + computerParameters +
                ", localParameters=" + localParameters +
                '}';
    }

    class ComputerParameters {
        String name;
        String model;
        int age;
        String processor;
        int ram;
        int ssd;
        String videoCard;

        public ComputerParameters(String name, String model, int age, String processor, int ram, int ssd, String videoCard) {
            this.name = name;
            this.model = model;
            this.age = age;
            this.processor = processor;
            this.ram = ram;
            this.ssd = ssd;
            this.videoCard = videoCard;
        }

        @Override
        public String toString() {
            return "ComputerParameters{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", age=" + age +
                    ", processor='" + processor + '\'' +
                    ", ram=" + ram +
                    ", ssd=" + ssd +
                    ", videoCard='" + videoCard + '\'' +
                    '}';
        }
    }

    class LocalParameters {
        String oc;
        String localHost;
        int password;
        String email;
        String security;
        String browser;
        String languages;
        String region;
        String keyBoardType;

        public LocalParameters(String oc, String localHost, int password, String email, String security, String browser,
                               String languages, String region, String keyBoardType) {
            this.oc = oc;
            this.localHost = localHost;
            this.password = password;
            this.email = email;
            this.security = security;
            this.browser = browser;
            this.languages = languages;
            this.region = region;
            this.keyBoardType = keyBoardType;
        }

        @Override
        public String toString() {
            return "LocalPrameters{" +
                    "oc='" + oc + '\'' +
                    ", localHost='" + localHost + '\'' +
                    ", password=" + password +
                    ", email='" + email + '\'' +
                    ", security='" + security + '\'' +
                    ", browser='" + browser + '\'' +
                    ", languages='" + languages + '\'' +
                    ", region='" + region + '\'' +
                    ", keyBoardType='" + keyBoardType + '\'' +
                    '}';
        }
    }
}
