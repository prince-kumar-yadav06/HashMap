import java.util.*;

public class MapIterationBYForLoop {
    public static void main(String args[]){

    Map<Integer,Integer> map=new TreeMap();
        map.put(2,50);
        map.put(3,20);
        map.put(0,10);
        map.put(4,5);
        map.put(1,40);

        //convert into map to array
        Map.Entry<Integer,Integer> EnteriesArr[]=map.entrySet().toArray(new Map.Entry[0]);

        //iteratio usins for loop
        for(int i=0;i<EnteriesArr.length;i++){
            Map.Entry<Integer,Integer> entry=EnteriesArr[i];
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }



    }
}
