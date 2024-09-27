package builderpattern;
// Driver Class
public class Main {
    public static void main(String[] args) {
        // Create a director
        Chef chef = new Chef();

        // Create a specific builder (e.g., Hawaiian Pizza)
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        // Set the builder for the director
        chef.setPizzaBuilder(hawaiianPizzaBuilder);

        // Construct the pizza
        chef.constructPizza();

        // Get the constructed pizza
        Pizza hawaiianPizza = chef.getPizza();

        // Output details of the pizza
        System.out.println("Hawaiian Pizza Details:");
        System.out.println("Dough: " + hawaiianPizza.getDough()); // Dough: Pan crust
        System.out.println("Sauce: " + hawaiianPizza.getSauce()); // Sauce: Tomato sauce
        System.out.println("Toppings: " + hawaiianPizza.getToppings()); // Toppings: [Ham, Pineapple]
    }
}