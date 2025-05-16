print("----------Using normal script-------------")
num = int(input("Enter a number: "))
sum_digits = 0

while num > 0:
    sum_digits += num % 10
    num //= 10

print("Sum of digits:", sum_digits)


def sum_of_digits(num):
    sum_digits = 0
    while num > 0:
        sum_digits += num % 10
        num //= 10
    return sum_digits

# Example usage
print("------------Using a function--------------")
number = int(input("Enter a number: "))
print("Sum of digits:", sum_of_digits(number))
