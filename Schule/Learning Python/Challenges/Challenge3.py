#Write a function that checks whether a given list of numbers is sorted in either ascending or descending order.
#mein code
def checksorted(lst):
    return lst == sorted(lst) or lst == sorted(lst, reverse=True)

print(checksorted([1, 2, 3, 4, 5]))  
print(checksorted([5, 4, 3, 2, 1]))
print(checksorted([1, 3, 2, 4, 5]))

#code von der Website

def is_sorted(lst):
    asc, desc = True, True
    for i in range(len(lst) - 1):
        if lst[i] > lst[i + 1]:
            asc = False
    for i in range(len(lst) - 1):
        if lst[i] < lst[i + 1]:
            desc = False
    return asc or desc

print(is_sorted([1, 2, 3, 4, 5]))
print(is_sorted([5, 4, 3, 2, 1]))
print(is_sorted([1, 3, 2, 4, 5]))

#mein code ist besser zu lesen und zu verstehen
#code von der Website ist effizienter