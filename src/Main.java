import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "a A a B b c d D D d";
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
        Map<String, Integer> hashMap = new HashMap<>();
        convert(hashMap, arrayList);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
    }

    public static void convert(Map<String, Integer> hashMap, ArrayList<String> arrayList){
        int count  = 1;
        for(int i = 0; i < arrayList.size(); i++){
            if(hashMap.containsKey(arrayList.get(i).toUpperCase())){
                int countTemp = hashMap.get(arrayList.get(i).toUpperCase())+1;
                hashMap.remove(arrayList.get(i).toUpperCase());
                hashMap.put(arrayList.get(i).toUpperCase(), countTemp);
            }else{
                hashMap.put(arrayList.get(i).toUpperCase(),count);
            }
        }
    }
}
