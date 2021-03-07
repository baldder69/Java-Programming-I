
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            money += 2.50;
            payment -= 2.50;
            affordableMeals++;
            return payment;
        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            money += 4.3;
            payment -= 4.3;
            heartyMeals++;
            return payment;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        } else {
            card.takeMoney(0);
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        } else {
            card.takeMoney(0);
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0){
            card.addMoney(sum);
            this.money+=sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
