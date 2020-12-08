import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;
    
    public Stack(){
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.values.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value){
        this.values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    
    public String take(){
        int size = this.values.size();
        String value = this.values.get(size - 1);
        
        this.values.remove(value);
        return value;
    }
    
}
