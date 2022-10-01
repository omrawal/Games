# Hangman Game
# Created By Om Rawal
# started on 01/01/2020 10:47
# completed on 01/01/2020 12:13

# hangman Game where the user enteres word should be guessed 

# importing os module needed to refresh the screen
import os



correct=input("Enter the word to guess ").strip().lower()
cli=[]
for i in correct:
    cli.append(i)
lives=7
os.system('cls')
print("Word successfully saved")
print("                             Game starts !!!!!             ")
attempt=[]
incorrect=[]
for i in range (0,len(correct)):
    attempt.append("_")
def prt():
    print("                         You have "+str(lives)+" remaining     ")
    print("                         ",end="") 
    print(attempt,end="") 
    print("          ")
    print("                         Incorrect inputs",end="")
    print(incorrect)
prt()
while(lives!=0 and attempt!=cli):
    a=input("                               Enter the guess:- ")
    os.system('cls')
    count=0
    for i in range(0,len(attempt)):
        if(correct[i]==a):
            attempt[i]=correct[i]
            count+=1
    if(count==0):
        print("                         INCORRECT INPUT!!!!!")
        lives-=1
        incorrect.append(a)
    prt()
if(lives==0):
    print("                          GAME OVER OUT OF LIVES TO PLAY ")
if(attempt==cli):
    print("                          YOU WIN !!!! GAME OVER")
