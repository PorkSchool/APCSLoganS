import turtle

def move_turtle(choice):
    if choice == '1':
        turtle.forward(50)
    elif choice == '2':
        turtle.backward(50)
    elif choice == '3':
        turtle.left(90)
    elif choice == '4':
        turtle.right(90)
    elif choice == '5':
        turtle.circle(50)
    elif choice.lower() == 'exit':
        print("Exiting program. Goodbye!")
        return False
    else:
        print("Invalid choice. Please enter a valid option.")

    return True

def main():
    turtle.speed(2)
    turtle.pencolor("blue")  # Set the pen color to blue

    print("Welcome to Turtle Move Program!")
    print("Options:")
    print("1. Move Forward")
    print("2. Move Backward")
    print("3. Turn Left")
    print("4. Turn Right")
    print("5. Draw a Circle")
    print("Type 'exit' to end the program.")

    while True:
        user_choice = input("Enter your choice: ")
        continue_program = move_turtle(user_choice)
        
        if not continue_program:
            break

    turtle.done()

if __name__ == "__main__":
    main()