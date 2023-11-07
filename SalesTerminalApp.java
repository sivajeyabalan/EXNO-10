import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesTerminalApp extends JFrame {
    private JButton itemButton1, itemButton2, itemButton3;
    private JLabel quantityLabel1, quantityLabel2, quantityLabel3;
    private JLabel priceLabel1, priceLabel2, priceLabel3;
    private JLabel subtotalLabel1, subtotalLabel2, subtotalLabel3;
    private JLabel totalCostLabel;

    private int quantity1, quantity2, quantity3;
    private double totalCost;

    public SalesTerminalApp() {
        // Initialize the JFrame and set its layout manager.
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Create item buttons.
        itemButton1 = new JButton("Item 1");
        itemButton2 = new JButton("Item 2");
        itemButton3 = new JButton("Item 3");

        // Create labels for quantity, price, and subtotal.
        quantityLabel1 = new JLabel("Quantity: 0");
        quantityLabel2 = new JLabel("Quantity: 0");
        quantityLabel3 = new JLabel("Quantity: 0");
        
        priceLabel1 = new JLabel("Price: $10.00");
        priceLabel2 = new JLabel("Price: $15.00");
        priceLabel3 = new JLabel("Price: $20.00");

        subtotalLabel1 = new JLabel("Subtotal: $0.00");
        subtotalLabel2 = new JLabel("Subtotal: $0.00");
        subtotalLabel3 = new JLabel("Subtotal: $0.00");

        // Add item buttons, quantity, price, and subtotal labels to the JFrame with GridBagLayout constraints.
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        add(itemButton1, c);
        c.gridx = 1;
        add(quantityLabel1, c);
        c.gridx = 2;
        add(priceLabel1, c);
        c.gridx = 3;
        add(subtotalLabel1, c);

        c.gridx = 0;
        c.gridy = 1;
        add(itemButton2, c);
        c.gridx = 1;
        add(quantityLabel2, c);
        c.gridx = 2;
        add(priceLabel2, c);
        c.gridx = 3;
        add(subtotalLabel2, c);

        c.gridx = 0;
        c.gridy = 2;
        add(itemButton3, c);
        c.gridx = 1;
        add(quantityLabel3, c);
        c.gridx = 2;
        add(priceLabel3, c);
        c.gridx = 3;
        add(subtotalLabel3, c);

        // Add action listeners to the item buttons.
        itemButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity1++;
                updateTotals();
            }
        });

        itemButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity2++;
                updateTotals();
            }
        });

        itemButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity3++;
                updateTotals();
            }
        });

        // Initialize and add the label for the total cost.
        totalCostLabel = new JLabel("Total Cost: $0.00");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 4;
        add(totalCostLabel, c);

        // Set the JFrame properties.
        setTitle("Sales Terminal");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateTotals() {
        // Update the quantity and subtotal labels for items.
        double price1 = 10.00;  // Set the price for Item 1.
        double price2 = 15.00;  // Set the price for Item 2.
        double price3 = 20.00;  // Set the price for Item 3.

        // Calculate the subtotal for each item.
        double subtotal1 = quantity1 * price1;
        double subtotal2 = quantity2 * price2;
        double subtotal3 = quantity3 * price3;

        // Update the quantity labels.
        quantityLabel1.setText("Quantity: " + quantity1);
        quantityLabel2.setText("Quantity: " + quantity2);
        quantityLabel3.setText("Quantity: " + quantity3);

        // Update the subtotal labels.
        subtotalLabel1.setText("Subtotal: $" + String.format("%.2f", subtotal1));
        subtotalLabel2.setText("Subtotal: $" + String.format("%.2f", subtotal2));
        subtotalLabel3.setText("Subtotal: $" + String.format("%.2f", subtotal3));

        // Calculate the total cost.
        totalCost = subtotal1 + subtotal2 + subtotal3;

        // Update the total cost label.
        totalCostLabel.setText("Total Cost: $" + String.format("%.2f", totalCost));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SalesTerminalApp();
            }
        });
    }
}

