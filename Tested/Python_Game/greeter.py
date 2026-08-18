from Locations.Cave import Cave_Start
def start_up():

    print("   ===Name Selection===")
    username = input("Enter Your Desired Username: ")
    print()
    if not username.isalpha():
        print("Please Only Input Letters For Your Username")
        return start_up()
    elif len(username) > 20:
        print("Please Input A Username Within 20 Characters")
        return start_up()
    else:
        age_verify()

def age_verify():
    while True:
        try:
            print("          ===Age Verification===")
            age = int(input("Please Enter Your Age As This Might Be Violent: "))
            print()
        except ValueError:
            print("Please Enter A Valid Number")
            continue

        if age >= 18:
            print("===Access Granted===")
            print("Age Verified")
            Cave_Start()
            break
        else:
            print("Sorry You Are Not Of Age To Play This Game")
            break