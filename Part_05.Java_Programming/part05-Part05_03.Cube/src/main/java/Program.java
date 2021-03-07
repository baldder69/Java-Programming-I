
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cube cube = new Cube(2);
        cube.volume();
        
        System.out.println(cube);
        
    }
}
