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
                "Saluki", "Schipperke", "Dachshund", "Yorkshire Terrier", "Mexican Hairless Dog",
                "Wirehead Vizsla", "Wirehead Pointing Griffon", "Whippet", "Weimaraner",
                "Vizsla", "Treeing Walker Coonhound", "Toy Fox Terrier", "Tibetan Mastiff",
                "Swedish Vallhund", "Soft-coated Wheaten Terrier", "Shih Tzu",
                "Clifford the Big Red Dog"};

        Arrays.sort(breed);

        int arrayNum = 1 +  (int)(Math.random()*(50));
        int real = arrayNum + 1;
        System.out.println("BorkNumber: " + (real + 1)+ ", " + (breed[real]));

        System.out.println("Welcome to Guess the Bork! Here is the list of good boiz we could be thinking of:");
        System.out.println("");

        for (int i = 0; i < breed.length; i++){
            System.out.println((i+1) + ". " + breed[i]);
        }

        System.out.println("");
        System.out.println("Take a guess which good bork it is! Please input the number of the breed.");

        Scanner dogInput = new Scanner(System.in);
        String dogGuess = dogInput.nextLine();
        int guessNum = (Arrays.binarySearch(breed, dogGuess));

        String dogName;

        if(guessNum==real){
            System.out.println("WOWZA! You did it! The best doge was: " + real + ". " + (breed[real]));
        } else {
            while(guessNum!=real){
                if(guessNum<real){
                    System.out.println("That's too low! Try again!");
                    Scanner bork2 = new Scanner(System.in);
                    dogName = bork2.nextLine();
                    guessNum = (Arrays.binarySearch(breed, dogName));
                } else if(guessNum>real){
                    System.out.println("That's too high! Try again!");
                    Scanner bork2 = new Scanner(System.in);
                    dogName = bork2.nextLine();
                    guessNum = (Arrays.binarySearch(breed, dogName));
                }
            }
            System.out.println("WOWZA! You did it! The best doge was: " + (breed[real]));
        }
    }
}
