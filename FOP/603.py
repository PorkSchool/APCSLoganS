# Author: Logan Santamarina
# Date: 2/5/24
# Description: Rck Paper Scissors game portfolio
# Import necessary modules
import random


# Function to get user choice
def playerChoice():
    print("Choose Rock, Paper, or Scissors:")
    user_choice = input().lower()
    return user_choice


# Function to get computer choice
def computerChoice():
    choices = ["rock", "paper", "scissors"]
    computer_choice = random.choice(choices)
    return computer_choice


# Function to determine the winner
def whoWins(user_choice, computer_choice):
    if user_choice == computer_choice:
        return "It's a tie!"
    elif (
        (user_choice == "rock" and computer_choice == "scissors")
        or (user_choice == "paper" and computer_choice == "rock")
        or (user_choice == "scissors" and computer_choice == "paper")
    ):
        return "You win"
    else:
        return "Computer wins"


# Main program
def main():
    player_choice = playerChoice()
    computer_choice = computerChoice()

    print(f"Your choice is {player_choice.capitalize()}.")
    print(f"Computer's choice is {computer_choice.capitalize()}.")

    result = whoWins(player_choice, computer_choice)
    print(result)


# Execute the main program
main()
