package lab3;

public class Main {
    public static void main(String[] args) {
        HardDiskDrive hardDiskDrive = new HardDiskDrive("SeaGate",500000);
        PowerSupply powerSupply = new PowerSupply();
        Processor processor = new Processor("Intel Core i7",4);
        Ram ram = new Ram ("KINGSTONE",4096);
        VideoCard videoCard = new VideoCard("NVIDIA GTX 1080Ti", 2.5);
        Computer computer = new Computer(hardDiskDrive, powerSupply, processor, ram, videoCard);
        computer.on();
        computer.on(6001);
        Computer.author();
    }
}
