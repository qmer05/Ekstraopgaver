package _9sten_saks_papir;

public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Player name: " + name;
    }

}
