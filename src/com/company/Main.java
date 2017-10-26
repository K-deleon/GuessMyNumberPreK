package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String breed[] = {"Shiba Inu", "Corgi", "Samoyed", "Golden Retriever", "Chow Chow",
                "Pug", "Bernese Mountain Dog", "Akita", "Jack Russel Terrier",
                "St. Bernard", "French Bulldog", "Terrier", "Pomeranian", "Chihuahua",
                "Beagle", "Husky", "German Shepard", "Sheep Dog", "Boxer", "Chinook",
                "Cocker Spaniel", "Gabe the Dog", "Golden Labrador", "American Eskimo",
                "Japanese Chin", "Maltese", "Norwegian Elkhound", "Papillon", "Poodle",
                "Pekingese", "Portuguese Water Dog", "Rottweiler", "Russell Terrier",
                "Saluki", "Schipperke", "Dachshunds", "Yorkshire Terrier", "Mexican Hairless Dog",
                "Wirehead Vizsla", "Wirehead Pointing Griffon", "Whippet", "Weimaraner",
                "Vizsla", "Treeing Walker Coonhound", "Toy Fox Terrier", "Tibetan Mastiff",
                "Swedish Vallhund", "Soft-coated Wheaten Terrier", "Shih Tzu",
                "Clifford the Big Red Dog"};

        Arrays.sort(breed);

        int BorkNumber = 1 +  (int)(Math.random()*(50));
        System.out.println("BorkNumber: " + BorkNumber + ", " + (breed[BorkNumber]));

        System.out.println("Welcome to Guess the Bork! Here is the list of good boiz we could be thinking of:");
        System.out.println("");

        for (int i = 0; i < breed.length; i++){
            System.out.println((i+1) + ". " + breed[i]);
        }

        System.out.println("");
        System.out.println("Take a guess which good bork it is! Please input the number of the breed.");
        Scanner borkInput1 = new Scanner(System.in);
        int bork1 = borkInput1.nextInt();


        int boof;

        if(bork1==BorkNumber){
            System.out.println("WOWZA! You did it! The best doge was: " + BorkNumber + ". " + (breed[BorkNumber]));
        } else {
            while(bork1!=BorkNumber){
                if(bork1<BorkNumber){
                    System.out.println("That's too low! Try again!");
                    Scanner bork2 = new Scanner(System.in);
                    boof = bork2.nextInt();
                    bork1 = boof;
                } else if(bork1>BorkNumber){
                    System.out.println("That's too high! Try again!");
                    Scanner bork2 = new Scanner(System.in);
                    boof = bork2.nextInt();
                    bork1 = boof;
                }
            }
            System.out.println("WOWZA! You did it! The best doge was: " + BorkNumber + ". " + (breed[BorkNumber]));
        }
    }
}
