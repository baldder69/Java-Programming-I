    
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        
        if (this.meals.contains(meal)){
                
        } else {
            this.meals.add(meal);
        }
    }
    
    public void removeMeal(String meal){
        this.meals.remove(meal);
    }
    
    public void printMeals(){
        for (String meal : meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
    
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Menu)){
            return false;
        }
        
        Menu comparedMenu = (Menu) compared;
        
        if (this.meals.equals(comparedMenu.meals)){
            return true;
        } else {
            return false;
        }
        
    }
    
}
