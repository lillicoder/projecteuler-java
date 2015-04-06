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
 * Project Euler - Problem #9
 *
 * Special Pythagorean triplet
 *
 * Problem 9
 * Published on Friday, 25th January 2002, 06:00 pm [Server Time]
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {

    public static void main(String[] args) {
        final int desiredSum = 1000;
        Triplet triplet = computeTripletForSum(desiredSum);

        if (triplet == null) {
            System.out.println(String.format("Failed to find a Pythagorean triplet whose terms sum to %d. :-(",
                                             desiredSum));
        } else {
            System.out.println(String.format("The Pythagorean triplet whose sum is %d is %s, it's product is %d",
                                             desiredSum,
                                             triplet.toString(),
                                             triplet.product()));
        }
    }

    /**
     * Computes the {@link Triplet} whose terms sum to the given value.
     * @param sum Sum to compute a triplet for.
     * @return Triplet that sums to the given sum or {@code null} if no such triplet could be found.
     */
    private static Triplet computeTripletForSum(final int sum) {
        assert sum > 0;

        // Maximum value a term we check can take should be the square root of the given sum
        final int maxValue = (int) Math.sqrt(sum);

        // Walk over the space of m and n values until the proper triple is found
        Triplet triplet;
        for (int n = 1; n < maxValue; n++) {
            for (int m = n + 1; m < maxValue; m++) {
                triplet = new Triplet(m, n);
                if (triplet.sum() == sum) {
                    return triplet;
                }
            }
        }

        return null;
    }

    /**
     * Represents a Pythagorean triplet.
     */
    private static class Triplet {

        public final int a;
        public final int b;
        public final int c;

        /**
         * Instantiates a new triplet with given values. This constructor will generate the values for
         * a, b, and c using the Euclid formula's for generating Pythagorean triples, where m and n are both
         * positive integers and m > n:
         *
         * a = m^2 - n^2
         * b = 2mn
         * c = m^2 + n^2
         * @param m Some positive integer larger than n.
         * @param n Some positive integer less than m.
         */
        public Triplet(int m, int n) {
            assert m > 0;
            assert n > 0;
            assert m > n;

            this.a = (m * m) + (n * n);
            this.b = 2 * m * n;
            this.c = (m * m) - (n * n);
        }

        /**
         * Multiples each value in this triplet.
         * @return Product of values.
         */
        public long product() {
            return ((long) a) * b * c;
        }

        /**
         * Sums each value in this triplet.
         * @return Sum of values.
         */
        public int sum() {
            return a + b + c;
        }

        @Override
        public String toString() {
            return String.format("Triple [a=%d, b=%d, c=%d]", a, b, c);
        }

    }

}
