# Project Euler - Problem #5

## Smallest multiple

### Problem 5
Published on 30 November 2001 at 06:00 pm [Server Time]

2520 is the smallest number that can be divided by each of the numbers 
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of 
the numbers from 1 to 20?

---------

This question is simply asking for the least common multiple (LCM) of the terms from 
1 to 20, inclusive. Calculating the LCM for more than 2 terms is a primitive recursive
operation:

LCM(n) = LCM(1, LCM(2, LCM(3, ..., LCM(n - 1, n))))

Doing this procedure for 1 through 10 gives the sample answer of 2520, so we'll simply
use this technique with the larger set of 1 through 20.

As an implementation note, the answer for this problem will exceed the maximum integer value you can use with
the int type. To get around this, Java provides the BigInteger class for arbitrary precision integers. Although
it looks a little unusual, this is the easiest way to translate the simple solution you would use ints to create.

Answer: 232792560

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
