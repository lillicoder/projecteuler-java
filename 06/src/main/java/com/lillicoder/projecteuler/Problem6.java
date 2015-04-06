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
 * Project Euler - Problem #6
 *
 * Sum square difference
 *
 * Problem 6
 * Published on Friday, 14th December 2001, 06:00 pm [Server Time]
 *
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
public class Problem6 {

    public static void main(String[] args) {
        double sumOfSquares = 0;
        double sumOfNumbers = 0;

        final int lastNaturalNumber = 100;
        for (int natural = 1; natural <= lastNaturalNumber; natural++) {
            // Increase sum of numbers
            sumOfNumbers += natural;

            // Increase sum of squares with the square of this number
            sumOfSquares += Math.pow(natural, 2);
        }

        // Square the sum of numbers
        sumOfNumbers = Math.pow(sumOfNumbers, 2);

        // Subtract
        double difference = sumOfNumbers - sumOfSquares;
        System.out.println(String.format("The difference of the sum of squares and the square of the sum " +
                                         "of the first %d natural numbers is %f [%f - %f]",
                                         lastNaturalNumber,
                                         difference,
                                         sumOfSquares,
                                         sumOfNumbers));
    }

}
