
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }

    }

    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
