def emailver(email):
    if email.count('@') == 1 and email.count('.') == 1:
        at_index = email.index('@')
        dot_index = email.index('.')
        
        if at_index > 0 and dot_index > at_index + 1 and dot_index < len(email) - 1:
            return (f"Email {email} is valid")
    return (f"Email {email} is invalid")

# Test cases
print(emailver("beathanh@gmail.com"))  # True
print(emailver("beathanh@gmail"))      # False
print(emailver("beathanh@gmail..com")) # False
print(emailver("@gmail.com"))          # False
print(emailver("beathanh@.com"))       # False
