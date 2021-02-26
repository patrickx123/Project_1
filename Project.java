import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PATRICK
 */
public class Project {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Welcome to ML");
System.out.println("Choose na");
System.out.println("1 - Fries = 50pesos");
int fries = 50;
System.out.println("2 - Burger steak = 45pesos");
int burger = 45;
System.out.println("3 - Grilled fish = 70pesos");
int fish = 70;
System.out.println("4 - Pineapple juice = 20pesos");
int juice = 20;
System.out.println("5 - Cocacola = 15pesos");
int coke = 15;
int a = input.nextInt();
        if (a <= 1){
            System.out.println("(PROMO! If you order 2 Fries, you get a 20pesos off)");
            System.out.println("How much?");
            int quantity = input.nextInt();
                if ((quantity%2) == 0){
                    int total = quantity*fries;
                    int promo = quantity / 2;
                    int discount = 20;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Fries");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else if ((quantity-1) == (quantity%2)) {
                    int quantity1 = quantity - 1;
                    int total = quantity*fries;
                    int promo = quantity1 / 2;
                    int discount = 20;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Fries");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else if ((quantity-2) == (quantity%3)) {
                    int quantity1 = quantity - 2;
                    int total = quantity*fries;
                    int promo = quantity1 / 3;
                    int discount = 20;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Fries");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
            }
        else if (a == 2){           
            System.out.println("(PROMO! If you order 2 Burger steak, you get a 15pesos off)");
            System.out.println("How much?");
            int quantity = input.nextInt();
                if ((quantity%2) == 0){
                    int total = quantity*burger;
                    int promo = quantity / 2;
                    int discount = 15;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Burger steak");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else {
                    int quantity1 = quantity - 1;
                    int total = quantity*burger;
                    int promo = quantity1 / 2;
                    int discount = 15;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Burger steak");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
        }
        else if (a == 3){
            System.out.println("(PROMO! If you order 3 Grilled fish, you get a 24pesos off)");
            System.out.println("How much?");
            int quantity = input.nextInt();
                if ((quantity%3) == 0){
                    int total = quantity*fish;
                    int promo = quantity / 3;
                    int discount = 24;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Grilled fish");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else if ((quantity-1) == (quantity%3)) {
                    int quantity1 = quantity - 1;
                    int total = quantity*fish;
                    int promo = quantity1 / 3;
                    int discount = 24;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Grilled fish");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else if ((quantity-2) == (quantity%3)) {
                    int quantity1 = quantity - 2;
                    int total = quantity*fish;
                    int promo = quantity1 / 3;
                    int discount = 24;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Grilled fish");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
        }
        else if (a == 4){
            System.out.println("(PROMO! If you order 2 Pineapple juice, you get a 5pesos off)");
            System.out.println("How much?");
            int quantity = input.nextInt();
                if ((quantity%2) == 0){
                    int total = quantity*juice;
                    int promo = quantity / 2;
                    int discount = 5;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Pineapple juice");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else {
                    int quantity1 = quantity - 1;
                    int total = quantity*juice;
                    int promo = quantity1 / 2;
                    int discount = 5;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Pineapple juice");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
        }
        else if (a == 5){
            System.out.println("(PROMO! If you order 2 Cocacola, you get a 6pesos off)");
            System.out.println("How much?");
            int quantity = input.nextInt();
                if ((quantity%2) == 0){
                    int total = quantity*coke;
                    int promo = quantity / 2;
                    int discount = 6;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Cocacola");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
                else {
                    int quantity1 = quantity - 1;
                    int total = quantity*coke;
                    int promo = quantity1 / 2;
                    int discount = 6;
                    int deduct = promo * discount;
                    int total1 = total - deduct;
                    System.out.println(total + " Sana all");
                    System.out.println("Discount amount is " + deduct);
                    System.out.println(total1 + " Sana ol");
                    System.out.println("How much is your money?");
                    int cash = input.nextInt();
                    if (total1 > cash){
                        int dept = cash-total;
                        System.out.println("Kulang og " + dept);
                        System.exit(1);
                    }
                    else {
                        int sukli = cash - total1;
                        System.out.println("");
                        System.out.println("Receipt");
                        System.out.println("Order: Cocacola");
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total payment: " + total1);
                        System.out.println("Cash: " + cash);
                        System.out.println("Change: " + sukli);
                        System.out.println("Thank you for ordering at ML!!");
                    }
                }
        }
        else {
            System.out.println("wala na sa option");
            System.exit(0);
        }
    }

}