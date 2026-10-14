def main():
    # 1. Get and validate Name
    name = input("Enter Your name : ")
    if not name.strip() or name.isdigit():
        print("Error input name please you dum dum")
        return

    # 2. Get and validate Total Pages
    try:
        total_pages = int(input("Enter the total pages of the book: "))
    except ValueError:
        print("Invalid number of pages")
        return
        
    if total_pages <= 0:
        print("Invalid number of pages")
        return

    # 3. Get and validate Pages Read
    try:
        pages_read = int(input("Enter the number of pages read so far: "))
    except ValueError:
        print("Error")
        return
        
    if pages_read > total_pages or pages_read < 0:
        print("Error")
        return

    # 4. Get and validate Days Reading
    try:
        days_reading = int(input("Enter the number of days you have been reading: "))
    except ValueError:
        print("Invalid number of days")
        return
        
    if days_reading <= 0:
        print("Invalid number of days")
        return

    # 5. Get and validate Allotted Days
    try:
        allotted_days = int(input("Enter the total days allotted for borrowing the book: "))
    except ValueError:
        print("Invalid number of days")
        return
        
    if allotted_days <= 0:
        print("Invalid number of days")
        return

    # --- Calculations ---
    percentage_read = (pages_read / total_pages) * 100
    remaining_days = allotted_days - days_reading
    remaining_pages = total_pages - pages_read
    
    pages_per_day_needed = 0
    if remaining_days > 0:
        pages_per_day_needed = remaining_pages // remaining_days

    # --- Output Report ---
    print("\n--- Library System Report ---")
    print(f"\n--- Welcome {name} !!!---")
    print(f"1. Percentage of the book read: {percentage_read:.2f}%")
    print(f"2. Days remaining to return the book: {remaining_days} day(s)")

    if remaining_pages <= 0:
        print("3. You have already finished the book! Great job!")
    elif remaining_days <= 0:
        print("3. Your borrowing period is up or overdue! You need to return the book.")
    else:
        print(f"3. Pages to read every day to finish on time: {pages_per_day_needed} pages/day")

# Run the program directly
main()
