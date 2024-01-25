# Logan Santamarina
# Date: 1/25/24
# Program Description: Robot cafe discounter

# Input Statements
age = int(input("Enter your age: "))
isMagnetic = input("Are you Magnetic? (yes/no): ").lower()
gearNumbers = int(input("How many Gears do you have?: "))

# Decision Statements
if age < 18 and isMagnetic == "yes":
    discount = 15
elif gearNumbers >=10:
    discount = 10
else:
    discount = 0

def main():
    # Output Statements
    print("Welcome to the Robot food club where we make food for robots!")
    print("We offer a discount for robots!")
    print(f"Age: {age} | Magnetic: {isMagnetic} | Number of Gears: {gearNumbers}")
    print(f"Do to your status you qualify for a {discount}% discount.")
main()