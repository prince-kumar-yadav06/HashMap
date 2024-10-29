import java.util.*;

public class KLargestElement{

    static void FindKElement(int arr[],int k){

        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        int count=0;
        for(Map.Entry m:map.entrySet())  
        {  
            count++;
            System.out.println(m.getKey()+":"+m.getValue());      
            if(count == k){
                break;
            }
        }  
    }

    public static void  main(String args[]){

        int arr[]={ 1, 23, 12, 9, 30, 2, 50 };
        int k=3;

        FindKElement(arr, k);
    }
}
