package lab3;

public class Ram {
    private String name;
    int totalMemory;

    public Ram() {
        name = "Default Ram";
        totalMemory = 4096;
    }

    public Ram (String name, int totalMemory) {
        this.name = name;
        this.totalMemory = totalMemory;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    String giveInfo(){
        return "Название оперативной памяти: " + name + " Общая память: " + totalMemory;
    }
}
