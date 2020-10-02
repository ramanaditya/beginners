
def binaryToDecimal(binary):
#This function converts the given binary input to it's decimal equivalent


    if(binary<0):
        #To keep a check if the input is positive
        return "Invalid Binary Number"
        
    sum = 0
    power = 0
    flag = 0 #To check if the given input is binary or not
    
    while(binary>0):
        digit = binary%10 #getting the last digit
        
        if(digit > 1):
            #check to make sure that the digit is either 0 or 1
            flag = 1
            break
        
        sum+= digit*(2**power) #adding to the sum 
        power = power + 1
        binary = int(binary/10) #removing the last digit
        
    if(flag==1):
        return "Invalid Binary Number"
    return sum

if __name__ == '__main__':
    binaryNum = int(input('Enter binary number : '))
    print(binaryToDecimal(binaryNum))
    
