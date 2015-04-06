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
 * Project Euler - Problem #7
 *
 * 10001st prime
 *
 * Problem 7
 * Published on Friday, 28th December 2001, 06:00 pm [Server Time]
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Problem7 {

    public static void main(String[] args) {
        BigInteger prime = BigInteger.valueOf(2);

        final int primeNumber = 10001;
        for (int count = 1; count < primeNumber; count++) {
            prime = prime.nextProbablePrime();
        }

        System.out.println("The 10,001st prime number is " + prime.toString() + ".");
    }

}
