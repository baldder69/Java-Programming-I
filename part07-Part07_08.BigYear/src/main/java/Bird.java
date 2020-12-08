
import java.util.ArrayList;

public class Bird {
    private ArrayList<String> birds;
    private ArrayList<String> birdsLatin;
    private String bird;
    private String birdLatin;
    private int observations;
    
    public Bird(){
        
        this.birds = new ArrayList<>();
        this.birdsLatin = new ArrayList<>();
    }
    
    public Bird(String bird, String birdLatin){
        this.birds = new ArrayList<>();
        this.birdsLatin = new ArrayList<>();
        this.bird = bird;
        this.observations = 0;
        this.birdLatin = birdLatin;
    }
    
    public void observationsBird(String birdName){
        observations++;
    }
    
    public String getBirdName(){
        return this.bird;
    }
    
    public String getBirdLatin(){
        return this.birdLatin;
    }
    
    public int getObservations(){
        return this.observations;
    }
    
    
    public String toString(){
        return this.bird + " (" + this.birdLatin + "): " + this.getObservations() + " observations";
    }
    

}
