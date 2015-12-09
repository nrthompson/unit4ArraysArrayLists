import java.util.ArrayList;

/**
 * Write a description of class Operations2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(7));
        System.out.println(names.size());
        names.set(0,"Alice B. Toklas");
        System.out.println(names.get(0));
        System.out.println(names.get(names.size()-1));
        names.add(4,"Doug");
        for(int i = 0; i<=names.size()-1; i++)
        {
            System.out.println(names.get(i));

        }
        ArrayList<String> names2 = new ArrayList<String>();
        for(int i = 0; i<=names.size()-1; i++)
        {
            names2.add(names.get(i));

        }
        System.out.println(names2);
        
        names.remove(0);
        System.out.println("Names:");
        System.out.println(names);
        System.out.println("names2:");
        System.out.println(names2);
        
    }
}