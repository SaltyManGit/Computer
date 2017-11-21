package lab3;

public class VideoCard {

    private String name;
    double charGPU;

    public VideoCard() {
        name = "Default VideoCard";
        charGPU = 1.3;
    }

    public VideoCard(String name, double charGPU) {
        this.name = name;
        this.charGPU = charGPU;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    String giveInfo(){
        return "Название видеокарты: " + name + " charGPU: " + charGPU;
    }


}
