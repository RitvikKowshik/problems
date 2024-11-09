public class Maxnumber{  
    public static void main(String[] args) {   
        int [] arr = new int [] {25, 11, 7, 69, 56};   
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {    
           if(arr[i]>max){
               max = arr[i]; 
           } 
        }  
        System.out.println("Largest number in the array is: " + max);  
    }  
}