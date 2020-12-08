
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getTotalArea() {
        return this.rooms * this.squares;
    }
    
    public int getTotalPrice(){
        return this.squares * this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.getTotalArea() > compared.getTotalArea()) {
            return true;
        } else {
            return false;
        }

    }
    
    public int priceDifference(Apartment compared){
        if (this.getTotalPrice() > compared.getTotalPrice()){
            return this.getTotalPrice() - compared.getTotalPrice();
        } else {
            return compared.getTotalPrice() - this.getTotalPrice();
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
         if (this.getTotalPrice() > compared.getTotalPrice()){
            return true;
        } else {
            return false;
        }
    }
    
}
