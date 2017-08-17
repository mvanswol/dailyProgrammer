

# Histogram Distribution Generator
# Created By Mitchell Van Swol

import random

def two_dice():
	return random.uniform(1,6) + random.uniform(1,6)

def print_vertical(num_trials,results):
	return 0

def print_horizontal(num_trials,results):
	# Normalize Results
	print("Result of : " + str(num_trials) + " pairs of dice")
	for index,item in enumerate(results,start=0):
		results[index] = int(float(results[index]/num_trials) * 100)
		print(str(index) + " : " + "#"*results[index])
	

num_trials = int(input("Enter the number of trials you wish to run : "))
orientation = input("Do You want the graph vertical : ")

result_list = [0] * 13

for i in range(0,num_trials):
	result_list[int(two_dice())] += 1

print(result_list)

if orientation == "yes" or orientation == "Yes" or orientation == "y" or orientation == "Y":
	print_vert(num_trials,result_list)
else:
	print_horizontal(num_trials,result_list)