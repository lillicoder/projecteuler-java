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
 * Project Euler - Problem #1
 *
 * Multiples of 3 and 5
 *
 * Problem 1
 * Published on 05 October 2001 at 06:00 pm [Server Time]
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    public static void main(String[] args) {
        // We can do this as a single step, just run from 3 to 1000 and keep adding
        // (3 is the first multiple of 3 or 5)
        int sum = 0;

        int limit = 1000;
        for (int index = 3; index < limit; index++) {
            if (index % 3 == 0 || index % 5 == 0) {
                sum += index;
            }
        }

        System.out.println("The sum of all multiples of 3 or 5 under 1000 is: " + sum);
    }

}
