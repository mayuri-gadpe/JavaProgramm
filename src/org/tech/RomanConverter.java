package org.tech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Roman {
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int getValue(char romanChar) {
        return romanMap.getOrDefault(romanChar, 0);
    }
}

class RomanToInt {
    public int convert(String roman) {
        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = Roman.getValue(roman.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;  
            } else {
                total += currentValue;  
            }
            prevValue = currentValue;
        }
        return total;
    }
}

public class RomanConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.next().toUpperCase();
        scanner.close();

        RomanToInt converter = new RomanToInt();
        int result = converter.convert(roman);

        System.out.println("Integer value: " + result);
    }
}

