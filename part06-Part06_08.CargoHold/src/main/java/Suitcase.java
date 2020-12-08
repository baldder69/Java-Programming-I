
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items){
            System.out.println(item);
        }
       
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        
        Item returnObject = items.get(0);
        
        for (Item item : items){
            if (returnObject.getWeight() < item.getWeight()){
                returnObject = item;
            }
        }
        
        return returnObject;
    }

    public String toString() {

        if (items.isEmpty()) {
            return "no items" + "(" + this.totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item" + "(" + this.totalWeight() + " kg)";
        } else {
            return items.size() + " items" + "(" + this.totalWeight() + " kg)";
        }

    }

}
