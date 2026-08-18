import math
# radius = float(input("Enter The Radius That You Would Like To: "))
# circumference = 2 * math.pi * radius
# print(f"The Circumference Of The Circle Is {circumference:.2f}")
 
#Login 
# user = input("Enter Your Username:")
# password = input("Enter Your Password:")
# Age = int(input("Enter Your Age:"))
# if Age >= 18:
#     print(f"Welcome {user}, you are now logged in")
# else:
#     print(f"Sorry {user}, you have not met the age requirment to log in, try again when you are 18 years old or older")

# def village():
#     print("\nYou are standing in a small village.")
#     print("1. Go to the forest")
#     print("2. Go to the cave")
#     print("3. Quit")

#     choice = input("> ")

#     if choice == "1":
#         forest()
#     elif choice == "2":
#         cave()
#     elif choice == "3":
#         print("Thanks for playing!")
#     else:
#         print("Invalid choice.")
#         village()


# def forest():
#     print("\nYou enter the forest.")
#     print("1. Pick up a stick")
#     print("2. Return to the village")

#     choice = input("> ")

#     if choice == "1":
#         print("You picked up a sturdy stick.")
#         forest()
#     elif choice == "2":
#         village()
#     else:
#         print("Invalid choice.")
#         forest()


# def cave():
#     print("\nYou enter a dark cave.")
#     print("1. Explore deeper")
#     print("2. Return to the village")

#     choice = input("> ")

#     if choice == "1":
#         print("A giant spider jumps out!")
#         print("Game Over.")
#     elif choice == "2":
#         village()
#     else:
#         print("Invalid choice.")
#         cave()


# # Start the game
# village()

# #Weight Converter in Python

# def Weight_Converter():

#     weight = float(input("Enter your weight: "))
#     unit = input("Enter your unit of measurement (K or L): ")

#     if unit == "K":
#         weight = weight * 2.205
#         unit = "Lbs."
#         print(f"You weigh {weight} {unit}")
#     elif unit == "L":
#         weight = weight / 2.205
#         unit = "Kgs."
#         print(f"You weigh {weight} {unit}")
#     else:
#         print("Input a valid unit of measurement")

# Weight_Converter()

#Temp Converter

def temp_converter():

    unit = input("Input valid method of measurement (F/C): ")

    if unit not in ("F", "C"):
        print(f"{unit} is an invalid measurement, please input F or C.")
        temp_converter()

    try:
        temp = float(input("Enter the temperature that you want to convert to the other: "))
    except ValueError:
        print("Invalid temperature. Please enter a numeric value.")
        temp_converter()

    if unit == "C":
        temp = ((9 * temp) / 5 + 32)
        print(f"The measurement once converted equates to {temp} Fahrenheit")
    else:
        temp = ((temp - 32) * 5 / 9)
        print(f"The measurement once converted equates to {temp} Celsius")

temp_converter()
