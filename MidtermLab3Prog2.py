first_name = input("Enter Your First name: ")
last_name = input("Enter Your Last name: ")
fullname = first_name +" "+ last_name
print("Full name is: "+ first_name +" "+ last_name)
print("First character: " + first_name[0:1])
print("Last character: " + last_name[-1])

try:
    first_name[0] = "D"
except TypeError:
    print("Strings are immutable; individual characters")
    print("cannot be changed directly.")

try:
    first_name[0] = "D"
except TypeError:
    
    new_name = "D" + first_name[1:]
    print(f"New name: {new_name}")
    print(f"Original name: {first_name}")
i = -1
j = 0
k = 0
for char in fullname:
        i +=1
        print(fullname[i])
for char in first_name:
    j +=1
print(f"Sliced first name: {first_name[:j]}")
for char in last_name:
    k +=1
print(f"Sliced last name: {last_name[:k]}")

while True:
    search_char = input("Enter a character to find: ")
    
    sfull = fullname.lower()
    if search_char in sfull:

        all_indices = []
        for index, char in enumerate(sfull):
            if char.casefold() == search_char.casefold():
                all_indices.append(index)
     
        print(f"Character '{search_char}' found at indices: {all_indices}")
        break
    else:
        print(f"Character '{search_char}' was not found in the full name. Try again.")