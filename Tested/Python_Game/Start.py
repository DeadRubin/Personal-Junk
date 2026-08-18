from greeter import start_up

def game_start():
    while True:
        print("                  ===Main Menu===")
        game_question = input("Would You Like To Play A Text Based Adventure Game? Y/N: ")
        print()
    
        if game_question == "Y":
            start_up()

        elif game_question == "N":
            print("Thank You For Your Time!")
            break

        else:
            print("Please Input A Valid Option")
            game_start()
            
game_start()