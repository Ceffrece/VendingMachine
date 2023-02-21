public class Snack {
    private String name;
    private double cost;
    public Snack(int num){
        if(num == 1){
            name = "Lays Chips";
            cost = 2.00;
        }
        if(num == 2){
            name = "Cheetos";
            cost = 2.00;
        }
        if(num == 3){
            name = "Cliff Bar";
            cost = 1.00;
        }
        if(num == 4){
            name = "PopTart";
            cost = 2.50;
        }
        if(num == 5){
            name = "Trail Mix";
            cost = 3.50;
        }
    }
    public double getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }
}
