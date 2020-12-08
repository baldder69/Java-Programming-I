import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        if (jokes.size() > 0){
            Random random = new Random();
            return jokes.get(random.nextInt(jokes.size())); //return jokes at random, int cast on random
        } else {
            return "Jokes are in short supply.";
        }
    }
    
    public void printJokes(){
        System.out.println(jokes);
    }
    
    
    
}
