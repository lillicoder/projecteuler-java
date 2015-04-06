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
 * Project Euler - Problem #3
 *
 * Largest prime factor
 *
 * Problem 3
 * Published on 02 November 2001 at 06:00 pm [Server Time]
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    public static void main(String[] args) {
        final long value = 600851475143L;
        BigInteger largestPrimeFactor = getLargestPrimeFactor(value);

        System.out.println("The largest prime factor of " + Long.toString(value) +
                           " is " + largestPrimeFactor.toString());
    }

    /**
     * Gets the largest prime factor for the given value. The given value must be larger than one.
     * @param value Value to get the largest prime factor of.
     * @return Largest prime factor for the given value.
     */
    private static BigInteger getLargestPrimeFactor(long value) {
        if (value < 1) {
            throw new IllegalArgumentException("The given value must be greater than 1.");
        }

        return getLargestPrimeFactor(BigInteger.valueOf(2L), BigInteger.valueOf(value));
    }

    /**
     * Gets the largest prime factor for the given value. Factorization will start
     * with the given prime value.
     * @param prime Prime value to start factorization with.
     * @param value Value to get the largest prime factor of.
     * @return Largest prime factor for the given value.
     */
    private static BigInteger getLargestPrimeFactor(BigInteger prime, BigInteger value) {
        // Reduce the value evenly by the current prime as much as possible
        BigInteger mod = value.mod(prime);
        while (mod.equals(BigInteger.ZERO)) {
            value = value.divide(prime);
            mod = value.mod(prime);
        }

        // If we ended up with the value at 1, we've found the largest prime factor, otherwise
        // there is some other larger prime that can continue to divide the value
        if (value.equals(BigInteger.ONE)) {
            return prime;
        } else {
            return getLargestPrimeFactor(prime.nextProbablePrime(), value);
        }
    }


}
