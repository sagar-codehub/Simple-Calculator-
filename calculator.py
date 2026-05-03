import os

def clear():
    os.system('cls' if os.name == 'nt' else 'clear')

def add(a, b): return a + b
def subtract(a, b): return a - b
def multiply(a, b): return a * b
def divide(a, b):
    if b == 0:
        return "❌ Cannot divide by zero!"
    return a / b

while True:
    clear()
    print("="*40)
    print("        🧮 SIMPLE CALCULATOR")
    print("="*40)
    print("1. ➕ Add")
    print("2. ➖ Subtract")
    print("3. ✖ Multiply")
    print("4. ➗ Divide")
    print("5. ❌ Exit")
    print("="*40)

    choice = input("👉 Enter your choice (1-5): ")

    if choice == '5':
        print("\n👋 Thank you for using the calculator!")
        break

    if choice not in ['1','2','3','4']:
        input("\n⚠️ Invalid choice! Press Enter to continue...")
        continue

    try:
        num1 = float(input("\nEnter first number: "))
        num2 = float(input("Enter second number: "))
    except ValueError:
        input("\n⚠️ Invalid input! Press Enter to continue...")
        continue

    if choice == '1':
        result = add(num1, num2)
        operation = "+"
    elif choice == '2':
        result = subtract(num1, num2)
        operation = "-"
    elif choice == '3':
        result = multiply(num1, num2)
        operation = "*"
    elif choice == '4':
        result = divide(num1, num2)
        operation = "/"

    print(f"\n✅ Result: {num1} {operation} {num2} = {result}")
    input("\nPress Enter to continue...")