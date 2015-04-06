# Project Euler - Problem #9

## Special Pythagorean triplet

### Problem 9
Published on Friday, 25th January 2002, 06:00 pm [Server Time]

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

---------

We can generate Pythagorean triplet's with Euclid's forumla:

    For some positive integers m and n, where m > n:
    
    a = m^2 - n^2
    b = 2mn
    c = m^2 + n^2
    
The sum of m and n should never exceed the integer square root of 1000, which is 31. So, we can simply
iterate over the range of values m and n can take. Since we know there is only one triplet that sums to 1000,
we can stop when we find that answer.

Answer: 31875000

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
