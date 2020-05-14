import java.util.*;
class HashDemo{
public static void main(String args[]){
HashSet<String> hs=new HashSet<String>();
hs.add("A");
hs.add("B");
hs.add("C");
hs.add("D");
hs.add("E");
hs.add("A");
System.out.println(hs);
}
}
