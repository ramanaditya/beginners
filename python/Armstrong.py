# In number theory, a narcissistic number in a given number base 
# is a number that is the sum of its own digits each raised to the power of the number of digits.

# Armstrong number is any 3 digit narcissitstic number

def get_digits(num):
    list_of_digits = []
    while num > 0:
        digit = num % 10
        list_of_digits.append(digit)
        num //= 10
    return list_of_digits

num = int(input("Enter a number: "))  

list_of_digits = get_digits(num)

list_of_cubes = [i**3 for i in list_of_digits]

if num == sum(list_of_cubes):  
   print(num,"is an Armstrong number")  
else:  
   print(num,"is not an Armstrong number")  
