def primecheck (n):
    if n <= 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

print(primecheck(6))
print(primecheck(7))
print(primecheck(8))
print(primecheck(9))
print(primecheck(10))