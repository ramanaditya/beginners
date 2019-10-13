
#include<stdio.h>
void Heapify(int arr[],int n,int i)
{
    int largest=i;
    int l=(2*i)+1;
    int r=(2*i)+2;
    int temp;
    if(l<n && arr[l]>arr[largest])
        largest=l;
    if(r<n && arr[r]>arr[largest])
        largest=r;
    if(largest!=i)
    {
        temp=arr[i];
        arr[i]=arr[largest];
        arr[largest]=temp;
        Heapify(arr,n,largest);
    }
}
void HeapSort(int arr[],int n)
{
    int i;
    for(i=(n/2)-1;i>=0;i--)
        Heapify(arr,n,i);
    for(i=n-1;i>=0;i--)
    {
        temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        Heapify(arr,i,0);
    }
}

void main()
{
    int n,i;
    printf("Enter size: ");
    scanf("%d",&n);
    int arr[n];
    printf("\nEnter array elements: ");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    HeapSort(arr,n);
    printf("\nSorted Array is: ");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
}
