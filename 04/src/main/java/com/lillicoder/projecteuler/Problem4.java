/*
 * Copyright 2014 Scott Weeden-Moody
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this project except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lillicoder.projecteuler;

/**
 * Project Euler - Problem #4
 *
 * Largest palindrome product
 *
 * Problem 4
 * Published on 16 November 2001 at 06:00 pm [Server Time]
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two
 * 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {
        // Greedy solution: calculate all 3-digit products and track the largest result that is a palindrome
        int bestPalindrome = 0;
        int bestMultiplier = 0;
        int bestMultiplicand = 0;

        int multiplicand = 999;
        boolean isPalindrome = false;
        do {
            for (int multiplier = multiplicand; multiplier > 99; multiplier--) {
                int product = multiplier * multiplicand;
                isPalindrome = isPalindrome(product);

                if (isPalindrome && product > bestPalindrome) {
                    // We have a better palindrome, update values
                    bestPalindrome = product;
                    bestMultiplier = multiplier;
                    bestMultiplicand = multiplicand;
                }
            }

            // All products for this multiplicand exhausted, decrease by 1 for next loop
            multiplicand -= 1;
        } while (multiplicand > 99); // Only interested in palindrome products of 3 digit terms

        if (bestPalindrome > 0) {
            System.out.println(String.format("Largest palindrome number that is a product of " +
                                             "two 3-digit terms is %d [%d * %d]",
                                             bestPalindrome,
                                             bestMultiplier,
                                             bestMultiplicand));
        } else {
            System.out.println("No palindrome number found in the products of 3-digit terms, " +
                               "something has gone horribly wrong. :-(");
        }
    }

    /**
     * Determines if the given number is a palindrome.
     * @param number Number to check.
     * @return {@code true} if the given number is a palindrome, {@code false} otherwise.
     */
    private static boolean isPalindrome(int number) {
        // Doesn't matter if negative, just check everything as positive
        if (number < 0) {
            number = -number;
        }

        // Compare as strings
        String numberText = Integer.toString(number);
        String reverseNumberText = new StringBuilder(numberText).reverse().toString();
        return numberText.equals(reverseNumberText);
    }

}
