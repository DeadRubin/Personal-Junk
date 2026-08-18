from Start import game_start
def Cave_Start():
    while True:
        print("===Game Start===")
        print()
        print("You Wake Up In A Cave Alone, You Feel The Cold Surface Of The Cave Even Through Your Clothes")
        print("1. Do You Get Up And Explore The Cave")
        print("2. Do You Lay Down On The Cave Floor And Asleep")
        print("3. You Decide To Grab A Nearby Rock And Kill Yourself")
        print("Exit Game")

        Cave_Option= input("> ")

        if Cave_Option == "1":
            print("You Have Decided To Explore The Cave")
            from Locations.Cave_Explore import Explore_Cave
            Explore_Cave()            
        elif Cave_Option == "2":
            print("test")
        elif Cave_Option == "3":
            print("test")
        elif Cave_Option == "Exit Game":
            break
        from Start import game_start
        game_start