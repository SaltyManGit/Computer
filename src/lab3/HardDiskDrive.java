package lab3;

public class HardDiskDrive {
    private String name;
    int storage;

    public HardDiskDrive() {
        name = "Default HardDiskDrive";
        storage = 1000000;
    }

    public HardDiskDrive (String name, int storage) {
        this.name = name;
        this.storage = storage;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    String giveInfo(){
        return "Название жесткого диска: " + name + " Объём жесткого диска: " + storage;
    }

}
