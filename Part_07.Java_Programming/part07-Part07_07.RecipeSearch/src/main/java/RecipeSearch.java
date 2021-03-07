import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); // ALL recipes in recipe.txt
        ArrayList<Recipe> recipes = new ArrayList<>(); // recipes splitted & grouped in objects
        ArrayList<Integer> cookingTimes = new ArrayList<>(); // cooking times in all recipes list 
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        
        // create recipes - all lines together
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                list.add(row);
            }
        }
        catch (Exception e) {
            System.out.println("An error occured..");
        }
        
        //getting index of cooking times
        for (String cookingTime : list) {
            if (isInteger(cookingTime)) {
                cookingTimes.add(list.indexOf(cookingTime));
            }
        }
        
        // recipes before last
        for (int i = 0; i < cookingTimes.size() - 1; i++) {
            
            int time = Integer.valueOf(list.get(cookingTimes.get(i)));
            String name = list.get(cookingTimes.get(i) - 1);
            
            //sublist is get index of first ingredient and then index of last ingredient by going to
            //index 2 of cookingTimes and then subtracting one to get the last ingredient
        
            recipes.add(new Recipe(name, time, list.subList(cookingTimes.get(i) + 1, cookingTimes.get(i + 1) - 1)));
        }
        
        
        //last recipe
        int j = cookingTimes.size() - 1;
        int time = Integer.valueOf(list.get(cookingTimes.get(j)));
        String name = list.get(cookingTimes.get(j) - 1);
        System.out.println(cookingTimes);
        
        recipes.add(new Recipe(name, time, list.subList(cookingTimes.get(j) + 1, list.size())));
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        // accept command from user and execute command
    
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            
            // command "list" implementation
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            // command "find name" implementation
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    if (r.getName().contains(search)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            // command "find cooking time" implementation
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
            
            // command "find ingredient" implementation
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipes) {
                    if (r.getIngr().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        
    }
        
        public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
