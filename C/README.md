# General way of writing and executing a C file
## For writing a piece of code in C
Open a text editor (preferably use [atom](https://atom.io) or [sublime Text](https://www.sublimetext.com) or [VS_Code](https://code.visualstudio.com/))

## Writing Code
You can use/copy [sample.c](https://github.com/ramanaditya/beginners/blob/master/C/sample.c) file and edit in that and save that with different names

> ```
> //header file
> #include <stdio.h>
>
> int main()
> {
>   //Your code goes here
>   return 0;
> }
> ```

## Saving your code
Use extension .c (eg: linear.c)

## Compiling the code
goto your terminal
move to the directory where you have saved your file using command cd
eg: 

>```
> ADITYAs-MacBook-Air:~ aditya$ cd Desktop/study   //if your file is saved in the folder study inside Desktop
>```
 then press 
>```
> ADITYAs-MacBook-Air:study aditya$ ls  //to confirm your file say linear.c is present or not   // this step is not required
>```

then type 

>```
>ADITYAs-MacBook-Air:study aditya$ cc filename.c   //eg: cc linear.c
>```

#### You can also use [Online Compiler](https://www.tutorialspoint.com/compile_c_online.php) for compiling any C program but it is not much efficient

## Executing the file
type in the terminal just after compiling the code

>```
>ADITYAs-MacBook-Air:study aditya$ ./a.out 
>```

# Verifying the result 
> If you are getting output as expected :
>>    then congratulations you are doing a great job

> else:
>>    Check the code once again and repeat the procedure

# Books for studying C
<li><a href="https://drive.google.com/file/d/1cF8dv_11ebyTQHVtOo6pmr15uYQdRaKI/view"> Programmming in ANSI C <sup>[pdf]</sup>  </a> by E.Balagurusamy </li>
<li><a href="http://www.dipmat.univpm.it/~demeio/public/the_c_programming_language_2.pdf"> The C Programming Language<sup>[pdf]</sup> </a> Book by Brian Kernighan and Dennis Ritchie </li> 
<li><a href="https://www.cluster2.hostgator.co.in/files/writeable/uploads/hostgator99706/file/letusc-yashwantkanetkar.pdf"> Let Us C<sup>[pdf]</sup> </a> Book by Yashavant P. Kanetkar </li>
<hr>

> Feel free to contribute
