import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DreamPizzaMakerGUI {

    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("DreamPizzaMaker 🍕");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1));

        // Create dropdowns for user selections
        String[] crusts = {"Thin", "Cheese Burst", "Classic Pan"};
        String[] sauces = {"Tomato Basil", "Spicy BBQ", "Alfredo"};
        String[] cheeses = {"Mozzarella", "Cheddar", "Goat Cheese"};
        String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Jalapeños"};
        String[] drinks = {"Cola", "Lemonade", "Iced Tea"};

        JComboBox<String> crustBox = new JComboBox<>(crusts);
        JComboBox<String> sauceBox = new JComboBox<>(sauces);
        JComboBox<String> cheeseBox = new JComboBox<>(cheeses);
        JComboBox<String> toppingBox = new JComboBox<>(toppings);
        JComboBox<String> drinkBox = new JComboBox<>(drinks);

        JButton buildButton = new JButton("Build My Dream Pizza!");

        JTextArea resultArea = new JTextArea(4, 30);
        resultArea.setWrapStyleWord(true);
        resultArea.setLineWrap(true);
        resultArea.setEditable(false);

        // Add all components to the frame
        frame.add(new JLabel("Choose your crust:"));
        frame.add(crustBox);
        frame.add(new JLabel("Choose your sauce:"));
        frame.add(sauceBox);
        frame.add(new JLabel("Choose your cheese:"));
        frame.add(cheeseBox);
        frame.add(new JLabel("Choose your topping:"));
        frame.add(toppingBox);
        frame.add(new JLabel("Choose your drink:"));
        frame.add(drinkBox);
        frame.add(buildButton);
        frame.add(resultArea);

        // Add button action
        buildButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String crust = (String) crustBox.getSelectedItem();
                String sauce = (String) sauceBox.getSelectedItem();
                String cheese = (String) cheeseBox.getSelectedItem();
                String topping = (String) toppingBox.getSelectedItem();
                String drink = (String) drinkBox.getSelectedItem();

                String pizzaName = cheese + " " + topping + " Deluxe on " + crust;
                resultArea.setText("🍕 Your Dream Pizza:\n" +
                        pizzaName + " with " + sauce + " sauce\n" +
                        "🥤 Served best with: " + drink);
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
