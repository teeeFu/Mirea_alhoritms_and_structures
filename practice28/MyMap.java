package practice28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyMap  {
    public Map<String,String> map;
    public MyMap(){
        this.map=new HashMap<>();
        for(int i=0;i<10;i++){
            map.put("SecondName"+(i+1),"FirstName"+(i+1));
        }
        map.put("SecondName11","FirstName1");
    }
    public Map<String,String> createMap(){
        return this.map;
    }

    public int getSameFirstCount(){

        Map<String,Integer>newMap=new HashMap<>();
        for (String name:map.values()){
            newMap.put(name, newMap.getOrDefault(name,0)+1);
        }
        return this.map.size()-newMap.size();

    }

}