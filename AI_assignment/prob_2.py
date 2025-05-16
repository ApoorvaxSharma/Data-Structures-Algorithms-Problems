even_numbers = []
odd_numbers = []

for num in range(10, 101):
    if num % 2 == 0:
        even_numbers.append(num)
    else:
        odd_numbers.append(num)

print("Even Numbers:", even_numbers)
print("Odd Numbers:", odd_numbers)

def find_even_odd(start, end):
    even_numbers = [num for num in range(start, end + 1) if num % 2 == 0]
    odd_numbers = [num for num in range(start, end + 1) if num % 2 != 0]
    return even_numbers, odd_numbers

# Example usage
even, odd = find_even_odd(10, 100)
print("Even Numbers:", even)
print("Odd Numbers:", odd)
