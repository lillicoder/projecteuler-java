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
 * Project Euler - Problem #10
 *
 * Summation of primes
 *
 * Problem 10
 * Published on Friday, 8th February 2002, 06:00 pm [Server Time]
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Problem10 {

    public static void main(String[] args) {
        BigInteger prime = BigInteger.valueOf(2L);
        BigInteger stop = BigInteger.valueOf(2000000L);

        BigInteger sum = BigInteger.ZERO;
        while (prime.compareTo(stop) <= 0) {
            sum = sum.add(prime);
            prime = prime.nextProbablePrime();
        }

        System.out.println("The sum of all primes below " + stop.toString() + " is " + sum.toString());
    }

}
