package com.hanthienduc.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        this method called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //String priceMessage = "Amount due $" + (quantity * 5);
        //String priceMessage = "That would be $" + (quantity * 5);
        //String priceMessage = "You owe " + (quantity * 5) + " bucks, dude!";
        //String priceMessage = (quantity * 5) + " dollars for 2 cups of coffee. Pay up.";
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);
    }

    /*
         This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /*
         This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /*
        this method display the given quantity value on the screen
     */
    private void displayQuantity(int number) {
        TextView quantityView = (TextView) findViewById(R.id.quantity_text_view);
        quantityView.setText("" + number);
    }


    /*
        this method displays the given test on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /*
        @param quantity is the number of cups of coffee ordered
        @param pricePerCup is the price of cup of coffee
     */
    public int calculatePrice() {
        int price = quantity * 5;
        return price;
    }
    /*
        Create summary of the order.

        @param price of the order
        @return text summary

     */
    public String createOrderSummary(int price) {
        String priceMessage = "Name: William Han";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

}
