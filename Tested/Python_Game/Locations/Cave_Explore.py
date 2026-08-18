def Explore_Cave():
    print("You Decidede To Get Up And Explore The Cave")
    print("1. You Walk Towards An Area Of The Cave That Seems To Have Light")
    print("2. You Get Up And Walk Deeper Into The Cave")
    print("3. You Decided To Stay Sit Back Down And Stay In the Cave")
    print("Exit Game")

    Ecave_option =  input("> ")

    if Ecave_option == "1":
        print("pass")
    elif Ecave_option == "2":
        print("You Decided To Venture Deeper Into The Game And Ending Up Dying\n")
        from Cave import Cave_Start
        Cave_Start
    elif Ecave_option == "3":
        print("pass")
    elif Ecave_option == "Exit Game":
        print("pass")
    else:
        print("Please Enter A Valid Option To Continue")
        Explore_Cave()

