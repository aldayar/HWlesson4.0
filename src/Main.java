import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 5 names to list [A] ");
        User user = new User();
        user.scanner.nextLine();

        String names1 =user.scanner.nextLine();
        String names2 =user.scanner.nextLine();
        String names3 =user.scanner.nextLine();
        String names4 =user.scanner.nextLine();
        String names5 =user.scanner.nextLine();

        String[] namesA=new String[]{names1,names2,names3,names4,names5};

        ArrayList<String> listA=new ArrayList<>(List.of(namesA));
        System.out.println("List A: "+listA);

        System.out.println("Enter 5 names for list [B]");
        String name6= user.scanner.nextLine();
        String name7= user.scanner.nextLine();
        String name8= user.scanner.nextLine();
        String name9= user.scanner.nextLine();
        String name10= user.scanner.nextLine();

        String[] namesB= new String[]{name6,name7,name8,name9,name10};

        ArrayList <String> listB=new ArrayList<>(List.of(namesB));
        System.out.println("List B: "+listB);


       ArrayList<String>listC= new ArrayList<>(listA);
       listC.addAll(listB);
        System.out.println(listC);
        System.out.println("-------------");
        for (int i = 0; i < args.length; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
            System.out.println(listC);

        }
        ArrayList<String>sort= new ArrayList<>(listC);
        List<String> sortedList= sort.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
