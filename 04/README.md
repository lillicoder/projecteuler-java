# Project Euler - Problem #4

## Largest palindrome product

### Problem 4
Published on 16 November 2001 at 06:00 pm [Server Time]

A palindromic number reads the same both ways. The largest palindrome made 
from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

---------

The difficulty in this question comes from choosing a strategy for selecting which 3-digit numbers
to multiply when looking for a palindromic number. The easiest possible solution is to calculate all of the
products of all 3-digit numbers (100 to 999, inclusive). This means there are 808,201 products to calculate while
holding a couple of variables to track the largest palindrome found and the terms that generated it.

The way to improve this is to either a) reduce the number of products calculated and/or b) find a better strategy
for choosing terms to multiply, which will make it possible to find the product earlier. For me, I choose the greedy
strategy as these products will compute really fast on most kinds of hardware available today.

Answer: 906609 (913 * 993)

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
