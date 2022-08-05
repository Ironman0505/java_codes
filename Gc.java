import java.util.*;
import java.io.*;

public class Gc{
    protected void finalize() throws Exception{
        System.out.println("Garbage is collected");
    }
    public static void main(String[] args)  {
        Gc g1=new Gc();
        Gc g2=new Gc();
        g1=null;
        g2=null;
        System.gc();
    }
}
