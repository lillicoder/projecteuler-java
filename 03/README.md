# Project Euler - Problem #3

## Largest prime factor

### Problem 3
Published on 02 November 2001 at 06:00 pm [Server Time]

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

---------

To find the prime factors, we want to get the next smallest prime number (starting with 2), divide the term evenly by
that prime as many times as possible, then repeat the process with the next prime number. We do this until the final
division term is 1, which means we've isolated the last prime factor.

The challenge here is to get the prime numbers without resorting to a handmade primes table. There are two options:
1) generate a prime sieve or 2) check each consecutive odd integer for primeness. Fortunately for Java,
the BigInteger class actually has a sieve implementation built in and you can use this to go from one number to
the next probably prime, so we'll use that here rather than write a Sieve of Eratosthenes.

Answer: 6857

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
