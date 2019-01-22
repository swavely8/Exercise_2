package com.swavely.Week1;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your birth month(First letter must be capitalized): ");

        String birthStone = userInput.nextLine();

        switch (birthStone) {
            case "January":
                System.out.println(" Your birth stone is Garnet ");
                break;
            case "February":
                System.out.println(" Your birth stone is Amethyst ");
                break;
            case "March":
                System.out.println(" Your birth stone is  Aquamarine ");
                break;
            case "April":
                System.out.println(" Your birth stone is Diamond ");
                break;
            case "May":
                System.out.println(" Your birth stone is Emerald ");
                break;
            case "June":
                System.out.println(" Your birth stone is Pearl ");
                break;
            case "July":
                System.out.println(" Your birth stone is Ruby ");
                break;
            case "August":
                System.out.println(" Your birth stone is Peridot ");
                break;
            case "September":
                System.out.println(" Your birth stone is Sapphire ");
                break;
            case "October":
                System.out.println(" Your birth stone is Opal ");
                break;
            case "November":
                System.out.println(" Your birth stone is Topaz  ");
                break;
            case "December":
                System.out.println(" Your birth stone is Tanzanite ");
                break;
            default:
                System.out.println("I don't know your birth stone");
        }

        }

        }



