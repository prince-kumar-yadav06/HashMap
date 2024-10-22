import java.util.HashMap;

public class ValidAnagram{

    static boolean CheckAnagram(String S,String T){

        HashMap<Character,Integer> HM=new HashMap<>();


        //add all value im map
        for(int i=0;i<S.length();i++){

            char ch=S.charAt(i);
                HM.put(ch,HM.getOrDefault(HM,0)+1);
        }

        //Matching String T to String S
        for(int i=0;i<T.length();i++){

            char ch=T.charAt(i);
            if(HM.get(ch) != null){
                if(HM.get(ch) ==1){
                    HM.remove(ch);
                }
                else{
                    HM.put(ch,HM.get(ch)-1);
                }
            }
        }
        return HM.isEmpty();
    }

    public static void main(String args[]){

        String s="tupil";
        String t="lipid";

        System.out.println(CheckAnagram(s, t));
    }
}
