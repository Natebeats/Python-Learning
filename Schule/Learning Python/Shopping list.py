#Shopping List: Build a simple shopping list application where you can add and remove items.
# Your program should have a menu function and a shopping list that is a dictionary.
# The dictionary should have items and their corresponding prices.
# The menu should have options to add items, remove items, and view the shopping list.
# The program should also calculate the total price of the items in the shopping list.

def menu():
    print("1. Add item")
    print("2. Remove item")
    print("3. View shopping list")
    print("4. Exit with total price")
    return int(input("Enter your choice: "))

def add_item(shopping_list):
    item = input("Enter item: ")
    price = float(input("Enter price: "))
    shopping_list[item] = price
    return shopping_list

def remove_item(shopping_list):
    item = input("Enter item to remove: ")
    del shopping_list[item]
    return shopping_list

def view_list(shopping_list):
    for item, price in shopping_list.items():
        print(f"{item}: {price}")
    return shopping_list

def total_price(shopping_list):
    total = sum(shopping_list.values())
    print(f"Total price: {total}")
    return shopping_list

def main():
    shopping_list = {}
    while True:
        choice = menu()
        if choice == 1:
            shopping_list = add_item(shopping_list)
        elif choice == 2:
            shopping_list = remove_item(shopping_list)
        elif choice == 3:
            shopping_list = view_list(shopping_list)
        elif choice == 4:
            shopping_list = total_price(shopping_list)
            break
        else:
            print("Invalid choice")

if __name__ == "__main__":
    main()
# Output:  1. Add item
# 2. Remove item
# 3. View shopping list
# 4. Exit