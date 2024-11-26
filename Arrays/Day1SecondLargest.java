package Arrays;

import java.util.Scanner;

class Day1SecondLargest{
    public int secondLargest(int arr[], int n){
        int largest = arr[0];
        int slargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest){
                if(arr[i]>slargest){
                    slargest = arr[i];
                }
            }
        }

        return slargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Declare an array of size 'n'
        int arr[] = new int[n]; 

        //Take input the loop
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Day1SecondLargest obj = new Day1SecondLargest();

        //Call the secondLargest method
        int sL = obj.secondLargest(arr,n);
        System.out.println("Second Largest Element of the array is: "+sL);

        sc.close();
    }
}