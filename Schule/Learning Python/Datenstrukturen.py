#Listen, Dictionaries, Tupel, Sets, Strings, Range
#Listen sind veränderbar, Dictionaries sind veränderbar, Tupel sind unveränderbar, Sets sind veränderbar, Strings sind unveränderbar, Range ist unveränderbar 
def mylist():
    return [1, 2, 3, 4, 5]

def mydict():
    return {'a': 1, 'b': 2, 'c': 3}

def mytuple():
    return (1, 2, 3, 4, 5)

def myset():
    return {1, 2, 3, 4, 5}

def mystring():
    return 'Hello World'

def myrange():
    return range(5)

print(mylist())
print(mydict())
print(mytuple())
print(myset())
print(mystring())
print(myrange())