import java.util.*;

public class Mp2 {
    public static void main(String[] args) {
        Map<Integer, String> mp = new LinkedHashMap<Integer, String>();

        mp.put(33, "Viper");
        mp.put(29, "INferno");
        if (!mp.containsKey(17))
            mp.put(17, "Lava Hound");
        if (mp.containsKey(29))
            mp.replace(29, "Barbarians");
        if (!mp.isEmpty())
            mp.put(10, "Lumberjack");

        System.out.println("Using KeySet.... The following are being printed...");
        Set<Integer> s = mp.keySet(); //returns set of keys

        for (int val : s)
            System.out.print(mp.get(val) + " ");   // order is maintained if its Linked hashset

        System.out.println();

        System.out.println("Using EntrySet.... The following are being printed...");

        for (Map.Entry<Integer, String> o : mp.entrySet())
            System.out.println(o.getKey() + " " + o.getValue());

        // System.out.println("Using Iterator.... The following are being printed...");
        // Iterator it = s.iterator();   // s is set of keys obtained from mp.keySet();

        // while (it.hasNext()){
        //     System.out.println(it.next()+" "+mp.get(it.next()));
        // }
   System.out.println();
   System.out.println();
       
System.out.println("Using entryset");
        Set<Map.Entry<Integer, String>> eo = mp.entrySet();
        System.out.println(eo);
        System.out.println();
        System.out.println("         ======>>>> USING FOR EACH TO ENTRY SET <<<<<=====");

        for (Map.Entry<Integer, String> obj : eo)
            System.out.println(obj.getKey() + " " + obj.getValue());
            System.out.println();
        System.out.println("      Using Iteratorrrrr ==>>");
        Iterator itt = eo.iterator();

        while (itt.hasNext())
            System.out.println(itt.next() + " ");


    }
}
