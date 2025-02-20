def mid(string):
    if len(string) % 2:
        return string[len(string) // 2]
    else:
        return ""
    
print(mid("oooo"))