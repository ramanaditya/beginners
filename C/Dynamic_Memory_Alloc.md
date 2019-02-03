## Dynamic Memory Allocation
-----------------------
![Chart](http://www.trytoprogram.com/images/dynamic-memory-allocation.jpg)
>Image source:www.trytoprogram.com

In most of our C programs when we create an array, we specify its size(allocate memory) at compile time.This is called Static Memory Allocation.
However, there are certain situations where we do not know the actual size of array beforehand; if we statically allocate memory it may cause
wastage of memory(if size is to large) or overfloe(if size is small). To overcome this we use **Dynamic memory allocation concepts**.

>Note: prior kn
It is facilitated by four functions in <stdlib.h>. These are :
> 1. malloc()
> 2. calloc()
> 3. realloc()
> 4. free()

#### 1. malloc()
**Synatx**:    ptr = (data_type *)malloc(size);      
>              where,
>                  - ptr is a pointer variable of type d*ata_type*
>                  - data_type can be any of the basic data type or user defined data type
>                  - *size* is the number of bytes in each block

#### 2. calloc()
**Synatx**:    ptr = (data_type *)calloc(n,size);      
>               where,
>                   - ptr is a pointer variable of type d*ata_type*
>                   - data_type can be any of the basic data type or user defined data type
>                   - n is the number of blocks to be allocated
>                   - size is the number of bytes in each block

#### 3. realloc()
**Synatx**:    ptr = (data_type *)calloc(ptr,size);      
>              where,
>                  - ptr is a pointer to a block of previously allocated memory either using malloc() or calloc()
>                  - data_type can be any of the basic data type or user defined data type
>                  - *size* is the new size the block

#### 4. free()
**Synatx**:    free(ptr);      
>              where,
>                  - ptr is a pointer to a block of previously allocated memory either using malloc() or calloc()




