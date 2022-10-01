import random
import math

name = input("Enter your Name : ")

def level1():
    print("Hello", name)
    print("In this level 1 game you have to choose a number between your chosen lower & upper bound.")
    print("\n")

    lower = int(input("Enter Lower bound:- "))
    upper = int(input("Enter Upper bound:- "))
    x = random.randint(lower, upper)
    max = math.log(upper - lower + 1, 2)
    print("\n\tYou've only ", round(max),
          " chances to guess the integer!\n")

    count = 0
    while count < max:
        count += 1
        guess = int(input("Guess a number:- "))
        if x == guess:
            print("Congratulations you did it in ", count, " try")
            break
        elif x > guess:
            print("You guessed too small!")
        elif x < guess:
            print("You Guessed too high!")

    if count >= max:
        print("\nThe number is %d" % x)
        print("\tBetter Luck Next time!")

def level2():
    print("This is the movie guessing game .. We will let you dive to the world of bollywood..||Damsaraj||")
    print("            [You will only be provided with 5 chances to guess the movie]       ")
    print("\n")

    print("GET SET GO!!!!!")
    words = ['brahmastra', 'welcome', 'padmavaat', 'sholay','Black','Lagaan','3 Idiots','Taare Zameen Par','Rang De Basanti',
            'Chakde! India','Border','Sholay','Dil Chahta Hai','Haider','Bhaag Milkha Bhaag','Guru','Sarkar','Lage Raho Munna Bhai',
            'Omkara','Dev D','Ek Hasina Thi','Andaz Apna Apna','Zakhm','DDLJ','Vicky Donor','Gangs of Wasseypur','Guzaarish','Barfi',
            'Masoom','A Wednesday','Udaan','Dor','Queen','The Dirty Picture','Astitva','OMG: Oh My God','Page 3','Paan Singh Tomar',
            'Paa','Shaurya','Viruddh','The Lunchbox','Kahaani','Iqbal','Khakee','Kaminey','Monsoon Wedding','Madras Cafe',
            'No One Killed Jessica','Lakshay','The Legend of Bhagat Singh','Yuva','English Vinglish','Dushman',]

    word = random.choice(words).lower()
    print("The word is of ", len(word), " letters")

    print("Guess the characters")

    guesses = ''
    for i in range(len(word)):
        if(word[i]==' '):
            guesses = guesses[:i] + ' ' + guesses[i + 1:]
        else:
            guesses = guesses[:i] + '-' + guesses[i + 1:]
    turns = 5

    while turns > 0:
        if word == guesses:
            print("You Win")
            print("The word is: ", word)
            break

        print()
        print(guesses)
        guess = input("Guess a character:").lower()
        flag = -1
        for l in range(len(word)):
            if guess == word[l]:
                flag = l
                for m in guesses:
                    if guess == m:
                        flag = -1
        if(flag == -1):
            turns -= 1
            print("Wrong")
            print("You have", +turns, "more guesses")
            if turns == 0:
                print("You Lose")
                print("The word is: ", word)
                break
        else:
            for l in range(len(word)):
                if guess == word[l]:
                    guesses = guesses[:l] + guess + guesses[l + 1:]

def level3():
    print("Now its the riddle time !!!! LETS CHECK YOUR IQ")

    print("\n")
    score = 0
    # questions
    def question(string, answer, score):
        ans = input(string).lower()
        if ans == answer:
            print("Correct!")
            return score + 1
        else:
            print("The answer is",answer,"not",ans)
        return score

    score = question("1. What has a neck but no head??","shirt",score)
    score = question("2. What has a thumb and four fingers, but isn't alive??","glove",score)
    score = question("3. A father's child, a mother's child, yet no one's son. Who am I?","daughter",score)
    score = question("4. What gets shorter as it grows older?","candle",score)
    score = question("5. What runs around a whole yard without moving?","fence",score)
    score = question('6. What begins with an "e" and only contains one letter?',"envelope",score)
    score = question("7. What five-letter word becomes shorter when you add two letters to it?","short",score)
    score = question("8. What has many keys but cannot open a single lock?","keyboard",score)
    score = question("9. What has a head and a tail but no body?","coin",score)
    score = question("10. What is full of holes but still holds water?","sponge",score)

    print("Score = ", score, "/10")


print("-----------------------------------------------WELCOME TO THIS LEVEL GAME--------------------------------------------------")
print("GET SET GO!!!!!")
print("\n")
print("**** LEVEL 1****")
level1()

print("\n")
print("**** LEVEL 2****")
print("It is nice seeing you in Level 2")
level2()

print("\n")

print("**** LEVEL 3****")
print("Finally ", name, "you reached the Level 3")
level3()

while 1:
    print("1: Number guessing game")
    print("2: Movie guessing game")
    print("3: Riddle quiz game")
    choice = input("Choose which level number to play (random key to exit): ")
    if choice == '1':
        level1()
    elif choice == '2':
        level2()
    elif choice == '3':
        level3()
    else:
        print("--------------------------------------------------------------------------------------------")
        print("THANK YOU VERY MUCH FOR PLAYING WITH US", name)
        exit()



