#Find summation of all primes less than 2million
#Steps:
#Generate list of all primes less than 2 million by creating a Sieve of Eratosthenes
#Then sum them

primes = [True] * 2000001
total = 0
for x in range(2, 2000000):
    if primes[x] == True:
        total += x
        for y in range(x*x, 2000000, x):
            primes[y] = False

print(total)

#correct answer kinda slow (~1s answer)
