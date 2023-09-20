package org.example;

public class Calculator {
    private double amount;
    private double discount;
    public Calculator(double amount, double discount) {
        this.amount = amount;
        this.discount = discount;
    }

   public double calculateDiscount () {
        if (this.amount > 1000 || this.amount < 1 ||
        this.discount < 0 || this.discount > 0.99)
            throw new ArithmeticException("Неправильные данные");
       return this.amount * (1-this.discount);
   }

}
