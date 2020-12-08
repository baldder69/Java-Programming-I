
public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity ){
        this.productName = initialName;
        this.productPrice = initialPrice;
        this.productQuantity = initialQuantity;
    }
    public void printProduct(){
        System.out.println(this.productName + ", " + "price " + this.productPrice + ", " + this.productQuantity + " pcs");
    }
}
