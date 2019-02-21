/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findlow;

/**
 *
 * @author timberlinepluska
 */
public class FindLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Bubble sort
        int nums[] = {0,4,5,2,1};
        int low = nums[0];
        int temp = 0;
        boolean swap = true;
        
        do{
            swap = false;
            for(int i = 0; i < nums.length-1; i++){
            
             if(nums[i]>nums[i+1]){
                swap = true;
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
              } 
            }
        }while(swap==true);
        
        //System.out.println(nums[0]);
        //System.out.println(nums[1]);
        //System.out.println(nums[2]);
        //System.out.println(nums[3]);
        //System.out.println(nums[4]);
        
        //merge sort
        int[] nums2 = {14, 7, 3, 12, 9, 11, 6, 2};
        
        int[] a1 = new int[nums2.length/2];
        int[] a2 = new int[nums2.length - (nums2.length/2)];
        
        for(int i = 0; i < nums2.length/2; i++){
            a1[i] = nums2[i];
        }
        int k = 0;
        for(int i = nums2.length/2; i < nums2.length;i++){
            a2[k] = nums2[i];
            k++;
        }
        
        for(int i = 0; i < a1.length;i++){
            System.out.println(a1[i]);
        }
        
    }
    public static int k = 0;
    public static int[] divideArray(int[] a){
        
        int[] arrayFirstHalf = new int[a.length/2];
        int[] arrayLastHalf = new int[a.length-a.length/2];
        //System.out.println(a[k]);
        //k++;
        if(arrayFirstHalf.length<4){
            
            for(int i = 0; i < arrayFirstHalf.length; i++){
                arrayFirstHalf[i]=a[i];
                System.out.println(a[i]);
            }
            
            return arrayFirstHalf;
            
        }else{
            
            divideArray(arrayFirstHalf);
        }
        return arrayFirstHalf;
    }
    
}
