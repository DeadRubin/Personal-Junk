username = input("Enter Your Desired Username: ")
game_option = input("would you like to play a game? (yes or no): ")

if game_option == 'yes':
        input(f'Welcome {username} to this text based adventure game, press enter to continue')
elif game_option == 'no':
    print('Thank you for your time, play next time')
    quit()
else: 
    print('Invalid Option')
    

def start():
    print("\nYou wake up in a dark cave and see light coming from the outside.")
    print("1. Follow the light to get out")
    print("2. Stay in the cave")
    print("3. Exit the game")

    choice = input("> ")

    if choice == "1":
        cave_exit()
    elif choice == "2":
        print("You decided to stay in the cave and starved to death after a few days.")
    elif choice == "3":
        print("Thank you for playing the game")
    else:
        print('Invalid Option')
        start()

def cave_exit():
    print("\nYou exit the cave and are greeted by the sunlight before spotting a sword nearby")
    print("1. Walk to the sword and pick it up")
    print("2. Walk towards the forest beyond the cave without picking up the sword")
    print("3. Exit the game")

    eo = input("> ")

    if eo == "1":
        sword_options()
    elif eo == "2":
        forest_nosword() 
    elif eo == "3":
        print("Thank you for playing the game")
    else:
        print("Invalid Option")
        cave_exit()

def sword_options():
    print("\nYou picked up the sword and proceeded to the forest")
    print("1. You enter the forest and head left")
    print("2. You enter the forest and head right")
    print("3. You grip the sword and go back into the cave")
    
    so = input("> ")

    if so == "1":
        forest_with_sword_left()
    elif so == "2":
        forest_with_sword_right()
    elif so == '3':
        print('You grab the sword and continue back into the cave')
    else:
        print('Invalid Option')
        sword_options()

def forest_nosword():
    print("You decided to not pick up the sword and proceeded to the forest withtout it")
    print("1. You enter the forest and head left")
    print("2. You enter the forest and head right")

    nswo = input("> ")
    
    if nswo == '1':
        forest_nosword_left()
    elif nswo == '2':
        print('You continue without your sword, heading right when you enter the forest, you encounter a orc')
    else:
        print('Invalid Option')
        forest_nosword()



def forest_with_sword_left():
    print("You decided to head to the left and encoutered a wild bear, you struggled to use the sword before getting killed")

def forest_with_sword_right():
    print("You deicded to head right and encountered a village with people")
    print("1. You conceal your sword as to not frighten the villagers before going into the village")
    print("2. You decided to not conceal and head to the village with your sword out in the open")
    print("3. You looked at the village before decided to head the other way and leave the village to go back to the village")

    svo = input("> ")

    if svo == '1':
        conceal_route()
    elif svo == '2':
        print('You enter the village and the villagers look at you, frightened before the head of the village suddenly comes at you and kills you, GAME OVER')
    elif svo =='3':
        village_leave()

def forest_nosword_left():
    input('You head left without the sword, you encounter a small monster, do you attack it? (yes or no)')
    
    sma = input('> ')
    if sma == 'yes':
        attack_monster()
    elif sma == 'no':
        coward()

def conceal_route():
    pass

def village_leave():
    pass

def attack_monster():
    pass

def coward():
    pass

start()

