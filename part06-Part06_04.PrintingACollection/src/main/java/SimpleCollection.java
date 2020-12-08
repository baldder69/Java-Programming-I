
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    String elementsContent = "";
    
    public String toString(){
        elementsContent = "";
        
        if (this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
            
        if (this.elements.size() == 1){
            for (String element : elements){
                elementsContent = element;
            }
            return "The collection " + this.name + " has " + elements.size() + " element:\n"  + elementsContent;
        }
        
       // Expected output:\nThe collection test has 1 element:\nfirst\n\nCurrently output is:\n" + c.toString() + "", "The collection 
        
        
        for (String element : elements){
            elementsContent = elementsContent + element + "\n";
        }
        
        return "The collection " + this.name + " has " + elements.size() + " elements:" + "\n" 
                + elementsContent;
    }
    
}
