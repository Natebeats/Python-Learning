def wordcount(filename):
    """Count the number of words in a file."""
    with open(filename) as f:
        return len(f.read().split())

print(wordcount("wordcount.txt")) 