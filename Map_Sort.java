package Collection_Generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mp_Practise {

    public static void main (String args[])
    {
        Map<String,String> map=new HashMap<>();
        map.put("Mahmudul","01713914899");
        map.put("Farhad","01738570697");
        map.put("Emon","01759825119");
        map.put("Sam","01758660309");
        map.put("Nitto","01713703122");
        map.put("Bashar","01735980300");

        Map<String ,String> sorted=new TreeMap<>(map);
        for (Map.Entry<String,String> entry:sorted.entrySet())
        {
                System.out.println(entry.getKey()+"     "+entry.getValue());
        }
    }
}
