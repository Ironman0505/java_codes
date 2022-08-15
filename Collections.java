import java.util.*;
import java.util.LinkedList;

 // .contains()  .size()  .isEmpty() etc..... common methods

class Array_List{
 Array_List(){
        ArrayList<Integer> al=new ArrayList<Integer>();    // Using Object datatype helps you to add any typeof data(string,int,bool etc..)
       //insertion--- .add()   or .add(ind,val)
       al.add(20);
       al.add(4);
       al.add(33);
       al.add(56);
       al.add(null);
       al.add(29);
       al.add(17);
       al.add(3,88);

       //printing whole array
       System.out.println("The arraylist is "+al);

       // accessing -- .get(ind)
     

       if(al.contains(33)){
        System.out.println("33 is present");
    }
    else{
        System.out.println("33 is absent");
    }

       // accessing whole arraylist using for loop
       for(int i=0;i<al.size();i++){ // for its size -- a.size();
        System.out.print(al.get(i)+" ");
       }
       System.out.println();
       //updating value at an index.. -- .set(ind,val)

       al.set(2,56);

       // removal.. .remove(ind)
      int val= al.remove(4);
    
    //   Enumeration<Integer> e=Collections.Enumeration(al);
    //   while(e.hasMoreElements()){
    //     System.out.println(e.nextElement());
    //   }
       //.indexOf(val)  -- prints first occ of the val in list
       al.indexOf(29);

       //Iterators
       Iterator it=al.iterator();

       while(it.hasNext()){
        System.out.print(it.next()+" ");
       }
        System.out.println();
       // using forEach loop

       for(int ele:al){
        System.out.print(ele+" ");
       }
       
    }
}


class Queuee{
    Queuee(){
        Queue<Integer> q=new LinkedList<Integer>();
        q.offer(20);
        int x=q.peek();
        System.out.println(x);
        
    }
}

class LL{
    LL(){
        LinkedList<Integer> l=new LinkedList<>();
        l.addFirst(20);
       l.add(33);
       l.offerFirst(520);
        int x=l.peek();
        System.out.println("The peek element is "+x);
    }
}
// class Linked_List {
//     Linked_List(){
//         LinkedList<String> linkl= new LinkedList<String>();
  
//         // Adding elements to the linked list
//          // insertion  --.add()  .addFirst()   .addLast()
//          //deltn        -- .remove() .removeFirst()  .removeLast()
//         linkl.add("a");
//         linkl.add("B");
//         linkl.addLast("C");
//         linkl.addFirst("D");
//         linkl.add(2, "E");
  
//         System.out.println(linkl);
  
//         linkl.remove("B");
//         linkl.remove(3);
//         linkl.removeFirst();
//         linkl.removeLast();

//         // other operations same as arraylist...
  
//         System.out.println(linkl);
   
//     }
    
// }


class Vectorr{
    Vectorr(){
        Vector<Integer> vec=new Vector<Integer>();
        vec.add(39);
        vec.add(30);
        vec.add(748);
        vec.addElement(300);
        System.out.println(vec.capacity());
        System.out.println(vec.size());

        if(vec.isEmpty()){
            System.out.println("EMpty");
        }
        else{
            System.out.println("Not empty");
        }
       

        if(vec.contains(33)){
            System.out.println("33 is present");
        }
        else{
            System.out.println("33 is absent");
        }
       
        // access --.get()
        System.out.println(vec.get(1));

        // -- removal  --.remove()    .clear() --removes all

        //for traversal... u can use foreach loop / for loop / iterator

        for(int val:vec){
            System.out.print(val+" ");
        }
    }
}

class Stackk{
    Stackk(){
        Stack<Integer> s=new Stack<Integer>();
        // methods are push() pop() peek() isEmpty() search() ....
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(5522);
        s.push(77);
        
     System.out.println("the stack is "+s);
        System.out.println("the peak element is "+s.peek());  //-- 77
        s.pop() ;  //removes top element
        int ind=s.search(233);   //if prsnt , returns ind ; else returns -1
        System.out.println(ind);
        if(s.isEmpty()){
            System.out.println("empty");
        }
        while(!s.isEmpty()){    // printing from top to bottom...
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}

class Sett{
    Sett(){
        HashSet<Integer> hs=new HashSet<Integer>();
        //internally uses hashtables
        // stores them based on hashvalues.. doesnt fllow the input order
        // no duplicates are stored...
        //index specification is absent here..
        //get() is absent... we cant pass ind into it
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        hs.add(17);
        hs.add(17);
        hs.add(17);
        hs.add(17);
        System.out.println("The hashset is "+hs);   // o/p can be -- 17 30 20 40 10

        hs.remove(30);
    
// Enumeration<Integer> e=Collections.Enumeration(hs);
// while(e.hasMoreElements()){
//     System.out.println(e.nextElement());
// }
        //iteration through iterator....u cant use for loop as indexing is absent here
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // for each loop
        for(int val:hs){
            System.out.print(val+" ");
        }
    }
}

class Lsett{
    Lsett(){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        // order is maintained... internally uses double linkedlist
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(10);
        lhs.add(17);
        lhs.add(17);
        lhs.add(17);
        lhs.add(17);
       
        System.out.println("The hashset is "+lhs);   // o/p : 20 30 40 10 17
        lhs.remove(17);
        System.out.println("The hashset is "+lhs);  //op : 20 30 40 10
         
        //rest all methods are same as Hashset...
    }
}

class Tsett{
    Tsett(){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        //internally uses bst... stores values in sorted manner
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(10);
        ts.add(17);
        ts.ceiling(10);
        ts.add(17);
        ts.add(17);
        ts.add(17);
        System.out.println("The hashset is "+ts);  // op : 10 17 20 30 40

        //other methods are common...
        //iterators
        Iterator it=ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}

class Mapp{
    Mapp(){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        // LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();    // same as hashmap but stores the data in the input order...
        // for insertion --.put(key,val)
        hm.put(1,"Viper"); 
        hm.put(2,"Anaconda");
        hm.put(3,"Cobra");
        hm.put(4,"Cobra");   // makes an other key-value pair of(4,cobra)
        hm.put(2,"dog");    // replaces the val at ind 2 with dog
        hm.putIfAbsent(6, "My tp");

  System.out.println("the hashmap is "+hm);  //op :  {1=Viper, 2=dog, 3=Cobra, 4=Cobra}
hm.remove(2);
  // .containsKey(key)  .containsValue(val)  .get(key)
if(hm.containsKey(1)){
    System.out.println(hm.get(1));
}
Collection<String> cl=hm.values();
System.out.println(cl);
if(hm.containsValue("Cobra")){
    System.out.println("Cobra is present");
}


//iteration
// =>iterator
// =>entrySet
// =>Keyset


//KEYSET
System.out.println("Using KeySet.... The following are being printed...");
Set<Integer> s = hm.keySet(); //returns set of keys

for (int val : s)
    System.out.print(hm.get(val) + " ");   // order is maintained if its Linked hashset


    //ENTRYSET

    System.out.println("Using EntrySet.... The following are being printed...");

    for (Map.Entry<Integer, String> o : hm.entrySet())
        System.out.println(o.getKey() + " " + o.getValue());
      
    //ITERATORS OF KEYSET N ENTRYSET
        System.out.println("Using Iterator.... The following are being printed...");
        Iterator it = s.iterator();   // s is set of keys obtained from mp.keySet();

        while (it.hasNext()){
            System.out.println(it.next()+" "+hm.get(it.next()));
        }

        Set<Map.Entry<Integer, String>> eo = hm.entrySet();
        Iterator itt = eo.iterator();
        System.out.println(eo);   //prints whole hashmap..
        while (itt.hasNext())
            System.out.print(itt.next() + " ");
    }
}

class TMapp{
    TMapp(){
        // same as the previous maps .. just stores data in sorted order accoring to the key values...
        TreeMap<Integer, String> tree_map = new TreeMap<Integer,String>();

    }
}

public class Collections {
    public static void main(String[] args) {
        // new Array_List();
        // // new Linked_List();
        // new Vectorr();
        // new Stackk();
        // new Sett();
        // new Lsett();
        // new Tsett();
        new Mapp();
        // new TMapp();
        // new LL();
    }

}
