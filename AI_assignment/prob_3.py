def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

prime_numbers = [num for num in range(10, 101) if is_prime(num)]
print("Prime Numbers:", prime_numbers)

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

prime_numbers = [num for num in range(10, 101) if is_prime(num)]
print("Prime Numbers:", prime_numbers)






def find_primes(start, end):
    def is_prime(n):
        if n < 2:
            return False
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                return False
        return True

    return [num for num in range(start, end + 1) if is_prime(num)]

# Example usage
primes = find_primes(10, 100)
print("Prime Numbers:", primes)

