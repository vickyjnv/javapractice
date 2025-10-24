package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>placesToVisit=new LinkedList<String>();
        placesToVisit.add("sydney");
        placesToVisit.add("London");
        placesToVisit.add("india");
        placesToVisit.add("Florida");

        printList(placesToVisit);

        placesToVisit.add(1,"jakarta");
        printList(placesToVisit);

        placesToVisit.remove(1);
        printList(placesToVisit);
    }



    private static void printList(LinkedList<String > linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("now visiting "+i.next());
        }
        System.out.println("=============");
    }
}


