package lab3;

public class PowerSupply {
    private String name;
    int voltage;
    {voltage = 480;}

    public PowerSupply() {
        name = "Default PowerSupply";
    }

    public PowerSupply (String name, int voltage) {
        this.name = name;
        this.voltage = voltage;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    String giveInfo(){
        return "Название блока питания: " + name + " Напряжение: " + voltage;
    }
}
