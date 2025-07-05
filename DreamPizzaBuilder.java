
 import java.util.Scanner;
public class DreamPizzaBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🍕 Welcome to the Dream Pizza Builder! 🍕");
        System.out.println("Let's craft your custom pizza!");

        // Crust selection
        System.out.println("\nChoose your crust:");
        System.out.println("1. Thin Crust\n2. Thick Crust\n3. Cheese Burst\n4. Stuffed Crust");
        int crust = sc.nextInt();

        // Sauce selection
        System.out.println("\nChoose your sauce:");
        System.out.println("1. Tomato Basil\n2. BBQ\n3. Pesto\n4. Alfredo");
        int sauce = sc.nextInt();

        // Cheese selection
        System.out.println("\nChoose your cheese:");
        System.out.println("1. Mozzarella\n2. Cheddar\n3. Parmesan\n4. Vegan Cheese");
        int cheese = sc.nextInt();

        // Topping selection
        System.out.println("\nChoose a topping:");
        System.out.println("1. Pepperoni\n2. Mushrooms\n3. Pineapple\n4. Paneer");
        int topping = sc.nextInt();

        // Drink pairing
        System.out.println("\nPick a drink to pair:");
        System.out.println("1. Cola\n2. Lemonade\n3. Iced Tea\n4. Sparkling Water");
        int drink = sc.nextInt();

        // Generate fun pizza name
        String crustName = switch (crust) {
            case 1 -> "Thin Whirl";
            case 2 -> "Thick Dome";
            case 3 -> "Cheesy Core";
            case 4 -> "Stuffa-Ring";
            default -> "Mystery Base";
        };

        String sauceName = switch (sauce) {
            case 1 -> "Tomato Blaze";
            case 2 -> "BBQ Burn";
            case 3 -> "Pesto Pop";
            case 4 -> "Creamy Swirl";
            default -> "Secret Sauce";
        };

        String cheeseName = switch (cheese) {
            case 1 -> "Mozza Rain";
            case 2 -> "Golden Melt";
            case 3 -> "Grated Gold";
            case 4 -> "Plant Magic";
            default -> "Cheese of Destiny";
        };

        String toppingName = switch (topping) {
            case 1 -> "Spicy Fury";
            case 2 -> "Shroom Mist";
            case 3 -> "Sweet Zing";
            case 4 -> "Paneer Storm";
            default -> "Topper X";
        };

        String drinkName = switch (drink) {
            case 1 -> "Cola Splash";
            case 2 -> "Zesty Lemon";
            case 3 -> "Chill Tea";
            case 4 -> "Bubbly Burst";
            default -> "Potion X";
        };

        String pizzaName = crustName + " " + sauceName + " with " + cheeseName + " & " + toppingName;

        System.out.println("\n✨ Your Dream Pizza is called: " + pizzaName + " ✨");
        System.out.println("🍹 Best enjoyed with: " + drinkName);
        System.out.println("\nThanks for building your pizza with us!");

        sc.close();
    }
  }
