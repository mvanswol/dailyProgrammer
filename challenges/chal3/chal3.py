

# Challenge 3 Role Reversed Guessing Game
# Created By Mitch Van Swol

import math

highest = 100
lowest = 1
num_guesses = 0
uInput = ""

while uInput != "y" or uInput != "Y":
	guess = math.ceil((highest + lowest)/2)
	print("Was your guess " + str(guess) + " : (Y)es, (H)igher, (L)ower")
	uInput = input()
	num_guesses += 1

	if uInput == "Y" or uInput =="y":
		print("Total number of guesses : " + str(num_guesses))
		exit()
	elif uInput == "H" or uInput == "h":
		lowest = guess
	else:
		highest = guess



