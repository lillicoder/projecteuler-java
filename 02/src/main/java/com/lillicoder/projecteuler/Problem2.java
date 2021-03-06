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
 * Project Euler - Problem #2
 *
 * Even Fibonacci numbers
 *
 * Problem 2
 * Published on 19 October 2001 at 06:00 pm [Server Time]
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 */
public class Problem2 {

    public static void main(String[] args) {
        // The trick to this is that we can simply walk through the Fibonacci sequence
        // and sum only those values that are even up through 4000000
        int secondToLast = 0;
        int last = 1;

        int sum = 0;

        int limit = 4000000;
        while (last <= limit) {
            // Get next number and, if even, add it to the sum
            int next = secondToLast + last;
            if (next % 2 == 0) {
                sum += next;
            }

            // Update second to last and last values
            secondToLast = last;
            last = next;
        }

        System.out.println("The even Fibonacci terms up to 4000000 is: " + sum);
    }

}
