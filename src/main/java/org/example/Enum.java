package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Enum {
    public enum FavFoods {
        PIZZA(70),
        BURGER(99),
        CHICKEN(80),
        FISH(75);
        int foodExcitement; //public

        //private final int foodExcitement;// private when we use final
        FavFoods(int foodExcitement) {
            this.foodExcitement = foodExcitement;
        }

        public int getFoodExcitement() {
            return foodExcitement;
        }

        public void setFoodExcitement(int foodExcitement) {
            this.foodExcitement = foodExcitement;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter your Favourite Food: ");
        Scanner scanner = new Scanner(System.in);

        // matching user favourite food input with a switch statement
        String InputFavFood  = scanner.nextLine().toUpperCase();

        try {
            FavFoods favFood = FavFoods.valueOf(InputFavFood);

            switch (favFood) {
                case PIZZA:
                    System.out.println("Your favourite food is Pizza");
                    System.out.println("My excitment level is " + favFood.getFoodExcitement() + "%");
                    break;

                case BURGER:
                    System.out.println("Your favourite food is Burger");
                    System.out.println("My excitment level is " + favFood.getFoodExcitement() + "%");
                    break;

                case CHICKEN:
                    System.out.println("Your favourite food is Chicken");
                    System.out.println("My excitment level is " + favFood.getFoodExcitement() + "%");
                    break;

                case FISH:
                    System.out.println("Your favourite food is Fish");
                    System.out.println("My excitment level is " + favFood.getFoodExcitement() + "%");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Sorry. Your favourite food is not on my list");
        }
    }
}