
public class Gift {
    private String gift;
    private int weight;
    
    public Gift(String gift, int weight){
        this.gift = gift;
        this.weight = weight;
    }
    
    public String getName(){
        return this.gift;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return this.gift + " (" + this.weight + " kg)";
    }
    
}
