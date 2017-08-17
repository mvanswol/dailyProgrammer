
# Basic Physics Calculator
# Created By Mitchell Van Swol

answer = input("Do you want to solve for (M)ass, (A)cceleration, (F)orce : ")

if answer == "F":
	mass = float(input("The Mass in Kg : "))
	acceleration = float(input("The Acceleration in m/s^2 : "))
	print("The Mass is " + str(mass * acceleration) + "N")
elif answer == "A":
	mass = float(input("The Mass in Kg : "))
	force = float(input("The Force in N : "))
	print("The Acceleration is  " + str(force/mass) + "m/s^2")
elif answer == "M":
	acceleration = float(input("The Acceleration in m/s^2 : "))
	force = float(input("The Force in N : "))
	mass = force/acceleration
	print("The Mass is " + str(mass) + "Kg")
else:
	print("Invalid Input")


