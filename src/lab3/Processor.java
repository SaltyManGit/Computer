package lab3;

public class Processor {
    private String name;
    int cores;

    public Processor() {
        name = "Default Processor";
        cores = 2;
    }

    public Processor (String name, int cores) {
        this.name = name;
        this.cores = cores;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    String giveInfo(){
        return "Название процессора: " + name + " Количество ядер: " + cores;
    }
}
