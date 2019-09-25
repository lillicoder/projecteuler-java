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

import java.math.BigInteger;

/**
 * Project Euler - Problem #5
 *
 * Smallest multiple
 *
 * Problem 5
 * Published on 30 November 2001 at 06:00 pm [Server Time]
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 
 * 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the 
 * numbers from 1 to 20?
 */
public class Problem5 {

    public static void main(String[] args) {
        int[] terms = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        BigInteger lcm = getLeastCommonMultiple(terms);

        System.out.println("The least common multiple (LCM) for 1 through 20 is " + lcm + ".");
    }

    private static BigInteger getLeastCommonMultiple(int[] terms) {
        return getLeastCommonMultiple(terms, 0);
    }

    private static BigInteger getLeastCommonMultiple(int[] terms, int offset) {
        int last = terms.length - 1;
        int distance = last - offset;

        if (distance == 0) {
            return BigInteger.valueOf(terms[last]);
        }

        if (distance == 1) {
            return getLeastCommonMultiple(BigInteger.valueOf(terms[offset]),
                                          BigInteger.valueOf(terms[last]));
        }

        // Recursively get the least common multiple for the current offset term and all
        // the remaining terms thereafter
        BigInteger term = BigInteger.valueOf(terms[offset]);
        offset += 1;
        return getLeastCommonMultiple(term, getLeastCommonMultiple(terms, offset));
    }

    private static BigInteger getLeastCommonMultiple(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(getGreatestCommonDivisor(a, b));
    }

    private static BigInteger getGreatestCommonDivisor(BigInteger a, BigInteger b) {
        // Use Euclidean algorithm
        if (b.equals(BigInteger.ZERO)) {
            return a;
        }

        return getGreatestCommonDivisor(b, a.mod(b));
    }

}
