package lab3;

public class Computer {

    private HardDiskDrive hardDiskDrive;
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;
    private Processor processor;
    private Ram ram;
    private VideoCard videoCard;

    public Computer(){
        hardDiskDrive = new HardDiskDrive();
        motherBoard = new MotherBoard();
        powerSupply = new PowerSupply();
        processor = new Processor();
        ram = new Ram();
        videoCard = new VideoCard();
    }

    public Computer(HardDiskDrive hardDiskDrive, PowerSupply powerSupply, Processor processor, Ram ram, VideoCard videoCard){
        this.hardDiskDrive = hardDiskDrive;
        this.powerSupply = powerSupply;
        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    void on(){
        System.out.println("Компьютер включен");
        System.out.println("Информация о составляющих: \n1)Жесткий диск: " + hardDiskDrive.giveInfo() + "\n2)Материнская плата: " + motherBoard.NAME + " " + motherBoard.socket +
                "\n3)Блок питания: "+ powerSupply.giveInfo() + "\n4)Процессор: " + processor.giveInfo() + "\n5)Оперативная память: " + ram.giveInfo()
                + "\n6)Видеокарта: " + videoCard.giveInfo());
    }
    void on(int time){
        if (time > 6000) {                                  //time = длительность нажатия кнопки
            System.out.println("Выключение...");
        }
    }

    public static void author(){
        System.out.println("Made in CHINA");
    }

}
