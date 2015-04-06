# Project Euler - Problem #6

## Sum square difference

### Problem 6
Published on Friday, 14th December 2001, 06:00 pm [Server Time]

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural 
numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred 
natural numbers and the square of the sum.

---------

The simple solution to this is to iterate over the first one hundred natural numbers
and keep running sums of the squares of those numbers and those numbers. You would then just square
the running sum of those numbers and do the subtraction. You could optimize this by finding the common
parts between the two calculations and computing on those values once, since when you expand these
summations out you are essentially doing a large number of additions on these natural numbers and their
multiples. However, hardware is fast, the brute force method is easiest.

Answer: 25164150

---------

--License--

Copyright 2014 Scott Weeden-Moody

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this project except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
