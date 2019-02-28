### Constructors
----------------------
- It would be simpler and more concise to initialise an object when it is created first.
- Java supports a special type of method , called CONSTRUCTOR, that enables an object to initialise itself when it is created.
- Constructors have same name as the Class itself. They don't specify a return value type(not even *void*).They return an instance of class itself.
- **Syntax**:
  >```
  >   class Class_name{
  >     //Data members and methods
  >     Class_name([parameter_list]){
  >      // initialisation statements
  >   }
  >  //Data members and methods
  >  }
  >```

- *Example*:
  
>```
> class Room{
>    int length,width,height;
>    
>    Room(int x, int y, int z){
>        length = x;
>        width = y;
>        height = z;
>    }
>    int room_volume(){
>        return(length * width * height);
>    }
> }
>
> class Volume{
>    public static void main(String args[]){
>       
>        Room r3 = new Room(15,20,5);
>        int vol3 =  r3.room_volume();
>   
>        System.out.print("volume 3 = " + vol3);
>    }
> }
>```
 - If we want constructor to initialse the object variables with some default values at the time of object decleration we use *default Constructor*.
 - It is declared in same manner as parameterised constructor except that it doesn't take any arguments.
 - Like other functions it can be overloaded.
 - The choice of Constructor to be used is done by compiler.
 - Example:
 
>```
> class Room{
>    int length,width,height;
>    Room(){
>        length = 0;
>        width = 0;
>        height = 0;
>    }
>    Room(int x,int y){
>        height = 4;
>        length = x;
>        width = y;
>    }
>    Room(int x, int y, int z){
>        length = x;
>        width = y;
>        height = z;
>    }
>    int room_volume(){
>        return(length * width * height);
>    }
> }
>
> class Volume{
>    public static void main(String args[]){
>        Room r1 = new Room(15,20);
>        int vol1 =  r1.room_volume();
>        Room r2 = new Room();
>        int vol2 =  r2.room_volume();
>        Room r3 = new Room(15,20,5);
>        int vol3 =  r3.room_volume();
>        System.out.print("volume 1 = " + vol1);
>        System.out.print("volume 2 = " + vol2);
>        System.out.print("volume 3 = " + vol3);
>    }
> }
>```
  
