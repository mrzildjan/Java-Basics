package food;

public class Food {
    
    String Vegetables;
    String Fruits;
    String Dessert;
    String Drinks;

    Food(String Vegetables, String Fruits, String Dessert, String Drinks) {
        this.Vegetables = Vegetables;
        this.Fruits = Fruits;
        this.Dessert = Dessert;
        this.Drinks = Drinks;
        
        System.out.println("Vegetables:" + " " + Vegetables + "\t\t" +
                           "Fruits:" + " " + Fruits + "\t\t" + 
                           "Dessert:" + " " + Dessert + "\t\t" +
                           "Drinks:" + " " + Drinks);
    }
}
