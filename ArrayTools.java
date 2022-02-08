//This program is created by Moxit Shah(A00253719) from Cambrian College for his Java Assignment.  This contains Caeser Cipher , Average array, Search and Revere array function.
//Date Created: 31-JAN-2022.


import java.util.Scanner;

public class ArrayTools{



/*********----------------------------Caesar Cipher---------------------***************/

    public static void crypt(String text, int shift ){

        
        String cipher ="";
        char alphabet;

        for(int i=0; i<text.length(); i++){

            alphabet = text.charAt(i);

            if(alphabet>='a' && alphabet<='z'){

                alphabet = (char)(alphabet+shift);

                if(alphabet > 'z') {
                    
                    alphabet = (char) (alphabet+'a'-'z'-1);

                }
                cipher += alphabet;

            }// lowercase if ended.


            else if(alphabet>='A' && alphabet<='Z'){

                alphabet = (char)(alphabet+shift);

                if(alphabet > 'Z') {
                    
                    alphabet = (char) (alphabet+'A'-'Z'-1);

                }
                cipher += alphabet;
            }
            else {
             cipher += alphabet;   
            }


        }//_______ENCRYPTION DONE______

        System.out.println(" Ciphertext : " + cipher + "\n");


        // Decryption Starts here.
        String decrypt="";

        for(int i=0; i<cipher.length(); i++){

            alphabet = cipher.charAt(i);

            if(alphabet>='a' && alphabet<='z'){

                alphabet = (char)(alphabet-shift);

                if(alphabet > 'z') {
                    
                    alphabet = (char) (alphabet+'a'+'z'+1);

                }
                decrypt += alphabet;

            }// lowercase if ended.


            else if(alphabet>='A' && alphabet<='Z'){

                alphabet = (char)(alphabet-shift);

                if(alphabet > 'Z') {
                    
                    alphabet = (char) (alphabet+'A'+'Z'+1);

                }
                decrypt += alphabet;
            }
            else {
                decrypt += alphabet;   
            }


        }//_______DECRYPTION DONE______

        System.out.println(" Decrypttext with -" + shift+ " : " + decrypt + "\n");
        





    }

    /*********----------------------------Average---------------------***************/

    public static void average(int n, int arr[]){

        double total= 0;

        System.out.println(" \n The array you entered is: ");
        for(int i=0; i<n; i++){
            
            System.out.println("   " + arr[i]);
            total += arr[i];

        }
        
        double avg = total / n;
        System.out.println(" \n Average of the array is " + avg + "\n");

    }


    /*********----------------------------Search---------------------***************/

        public static void binarySearch(int arr[], int first, int last, int key)
        {  
            int mid = (first + last)/2; 
    
            while( first <= last )
            {  
               if ( arr[mid] < key )
               {  
                 first = mid + 1;     
               }
               else if ( arr[mid] == key )
               {  
                 System.out.println("Element: "+key+" is found at index: " + mid);  
                 break;  
               }
               else{  
                  last = mid - 1;  
               }  
               mid = (first + last)/2;  
            }  
            if ( first > last ){  
               System.out.println("Element: "+key+" is not found!");  
            } 

        } 




    /*********----------------------------Reverse---------------------***************/

    public static void reverse(int arr[], int n) 
    {
  
            int b[]  = new int[n];

            int j = n;

            for (int i = 0; i < n; i++) 
            {
                b[j - 1] = arr[i];
                j = j - 1;
            }
      
            
            System.out.println(" \n Reversed array is: \n");

            for (int k = 0; k < n; k++) 
            {
                System.out.println( b[k] );
            }
        }




/*********************************************--------------------------------MAIN------------------------------------*****************************************/





    public static void main(String[] args){

        try{
        /*********----------------------------Caesar Cipher---------------------***************/
        
        //Scanner function for the input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = in.next();

        //scanner for the shift value
        System.out.println("Enter the value by which text should be shifted");
        int shift = in.nextInt();

        crypt(text, shift);
       

        /*********----------------------------Average---------------------***************/

        //Enter the number of elements to enter
        System.out.println("Enter the number of elements to enter");
        int n = in.nextInt();

        //Array elements stored
        int arr[] = new int[10];
        for(int i=0; i<n; i++){
            
            arr[i] = in.nextInt();

        }   

        average(n, arr);


        /*********----------------------------Search---------------------***************/
        System.out.println("Enter the key to be found: ");
        int key = in.nextInt();  
        int last= n-1;  
        binarySearch(arr, 0, last, key);


        /*********----------------------------Reverse---------------------***************/

        reverse(arr, n);


    }
    catch(Exception e){
        System.out.println("please enter the input correctly!!");
    }




    }  //main method



}