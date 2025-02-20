#Leapyear formular is a year that is divisible by 4 and not divisible by 100 or divisible by 400

def leapyear(year):
    if year % 4 == 0 and year % 100 != 0 or year % 400 == 0: # Leap year calculation
        return f"Year {year} is a leap year"
    else:
        return f"Year {year} is not a leap year"

print(leapyear (2000))
print(leapyear (1996))
print(leapyear (2028))
print(leapyear (2025))