/*
assign your marks of different subjects to variables 
and print the total marks obtained and percentage as output
*/

#include<stdio.h>

int main()
{
// saving marks in physics ,chemistry and maths in variables phy,chem and math respectively
// marks are out of 100 in each subject
	float phy = 50;
	float chem = 35;
	float math= 99;
	float total;
	total = phy +chem +math;
	float perc;
	perc = total/300*100;
	printf("your total marks are %.1f and percentage is %.2f ",total,perc);

  
  return 0;
}
