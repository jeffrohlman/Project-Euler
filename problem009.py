# We know:
# 0 < a < 333
# 1 < b < 500
# 334 < c < 997
# a + b + c = 1000
# a^2 + b^2 = c^2

# b can be at minimum a + 1
# b can be at maximum ceiling((1000 - a)/2) - 1
# c is 1000 - (a + b)
# Easy loop:
# a -> (1, 332)
# b -> (a + 1, ceiling((1000 - a)/2) - 1)
# c -> 1000 - (a + b)
# check if pythagoram triple
# not optimal?

import math

c = 0
for a in range(1, 333):
    for b in range(a + 1, math.ceil((1000 - a)/2.0)):
        c = 1000 - (a + b)
        if a ** 2 + b ** 2 == c ** 2:
            print("A: " + str(a) + ", B: " + str(b) + ", C: " + str(c))
            print("Product of abc: " + str(a*b*c))
            a = 333
            b = 334
