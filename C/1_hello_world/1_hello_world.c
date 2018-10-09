//----------------------------------------------------------
// sample.c
// Uses C
// Created by: Aditya Raman
//
// A simple program that prints 'Hello World!'
//----------------------------------------------------------
/*
We have already written hello world program for you need to run
this in your terminal. Try to run it and then create a new file 
with filename as your name or USN and in that file in place of 
'Hello' write your first_name and in place of 'world' write
your last_name, run the program then make a pull request in our
repository. You can delete all the comments.
*/
//----------------------------------------------------------

#include<stdio.h>

int main()
{
  char first_name[20] = "Hello" ,last_name[20] = "World!";
  printf("%s %s",first_name,last_name);
  
  return 0;
}
