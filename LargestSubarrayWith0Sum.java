import java.util.*;

public class LargestSubarryWith0Sum {
    
    public static void main(String args[]){

        // int arr[]={15,-2,2,-8,1,7,10,23};
        int arr[]={3,4,5};

        HashMap<Integer,Integer> map=new HashMap();

        int sum=0;

        int len=0; //count length of subarray

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            //agar any sum repeat krega map to i-us sum kaindex or prev len me se max ko curr len krdenge
            if(map.containsKey(sum)){
                len=Math.max(len,i - map.get(sum));
            }

            else{
                map.put(sum,i);
            }

        }

        System.out.print("largest aubarray with 0 sum :"+len);
    }
}
