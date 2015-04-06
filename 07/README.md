# Project Euler - Problem #7

## 10001st prime

### Problem 7
Published on Friday, 28th December 2001, 06:00 pm [Server Time]

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

---------

The solution is to fill a sieve up to that many prime numbers and then get the result. As used in previous
problems, this is super duper easy with the Java standard library since BigInteger has the BitSieve implementation.
This is as simple as doing a for loop using BigInteger.nextProbablePrime().

Answer: 104743

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
