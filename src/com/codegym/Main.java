package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number - 100 * hundreds) / 10;
        int ones = number % 10;
        String toText = "";
        switch (hundreds) {
            case 0:
                break;
            case 1:
                toText += "one hundred ";
                break;
            case 2:
                toText += "two hundreds ";
                break;
            case 3:
                toText += "three hundreds ";
                break;
            case 4:
                toText += "four hundreds ";
                break;
            case 5:
                toText += "five hundreds ";
                break;
            case 6:
                toText += "six hundreds ";
                break;
            case 7:
                toText += "seven hundreds ";
                break;
            case 8:
                toText += "eight hundreds ";
                break;
            case 9:
                toText += "nine hundreds ";
                break;
        }

        switch (tens) {
            case 0:
                break;
            case 1:
                switch (ones) {
                    case 0:
                        toText += "ten ";
                        break;
                    case 1:
                        toText += "eleven ";
                        break;
                    case 2:
                        toText += "twelve ";
                        break;
                    case 3:
                        toText += "thirteen ";
                        break;
                    case 4:
                        toText += "fourteen ";
                        break;
                    case 5:
                        toText += "fifteen ";
                        break;
                    case 6:
                        toText += "sixteen ";
                        break;
                    case 7:
                        toText += "seventeen ";
                        break;
                    case 8:
                        toText += "eighteen ";
                        break;
                    case 9:
                        toText += "nineteen ";
                        break;
                }
                break;
            case 2:
                toText += "twenty ";
                break;
            case 3:
                toText += "thirty ";
                break;
            case 4:
                toText += "forty ";
                break;
            case 5:
                toText += "fifty ";
                break;
            case 6:
                toText += "sixty ";
                break;
            case 7:
                toText += "seventy ";
                break;
            case 8:
                toText += "eighty ";
                break;
            case 9:
                toText += "ninety ";
                break;
        }

        if (tens != 1) {
            switch (ones) {
                case 0:
                    break;
                case 1:
                    toText += "one ";
                    break;
                case 2:
                    toText += "two ";
                    break;
                case 3:
                    toText += "three ";
                    break;
                case 4:
                    toText += "four ";
                    break;
                case 5:
                    toText += "five ";
                    break;
                case 6:
                    toText += "six ";
                    break;
                case 7:
                    toText += "seven ";
                    break;
                case 8:
                    toText += "eight ";
                    break;
                case 9:
                    toText += "nine ";
                    break;
            }
        }

        System.out.printf("Số %d đọc là: %s.\n", number, toText);
    }
}

