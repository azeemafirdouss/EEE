def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5)+1):
        if n % i == 0:
            return False
    return True

def main():
    print("Welcome to the Factorial and Prime Checker")
    
    try:
        num = int(input("Enter a positive integer: "))
    except ValueError:
        print("Invalid input. Please enter an integer.")
        return

    if num < 0:
        print("Negative numbers are not allowed.")
        return

    fact = factorial(num)
    print(f"Factorial of {num} is {fact}")

    if is_prime(num):
        print(f"{num} is a prime number.")
    else:
        print(f"{num} is not a prime number.")

main()
