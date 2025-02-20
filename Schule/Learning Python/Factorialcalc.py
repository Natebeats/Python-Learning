def faccalc(n):
    if n == 0:
        return 1
    else:
        return n * faccalc(n-1)
    
print(faccalc(5))
print(faccalc(10))
print(faccalc(15))

#Formula for factorial calculation is n! = n * (n-1) * (n-2) * (n-3) * ... * 1
#Example: 5! = 5 * 4 * 3 * 2 * 1 = 120

