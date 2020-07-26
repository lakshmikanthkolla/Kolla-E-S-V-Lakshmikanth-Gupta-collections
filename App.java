package task_collections.task_collections;

/**
 * Hello
 *
 */
import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "custom list operations!" );
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        CustomList<Integer> list=new CustomList<Integer>();
   	 list.add(11);
   	 list.add(12);
   	 list.add(13);
   	list.add(14);
  	 list.add(15);
  	 list.add(16);
  	list.add(17);
  	 list.add(18);
  	 list.add(19);
  	 list.add(20);
  	    	System.out.println("initial custom list");
  	        System.out.println(list);
  	        int flag=1;
  	        while(flag == 1) {
  	        	System.out.println("\nlist operations");
  	            System.out.println("\n1.Add\n2.Remove\n3.fetch\n4.Print List");
  	            System.out.println("Enter your choice");
  	        	int choice = s.nextInt();
  		        switch(choice) {
  		        case 1:
  		        	System.out.println("Enter a number to add");
  		        	int val=s.nextInt();
  		        	list.add(val);
  		        	
  		        	System.out.println(list);
  		        	break;
  		        case 2:
  		        	System.out.println("Enter a index to remove");
  		        	int index=s.nextInt();
  		        	System.out.println("The removed element is "+list.remove(index));
  		        	System.out.println("the list after removing element"+list);
  		        	break;
  		        case 3:
  		        	System.out.println("Enter a index to get a value");
  		        	int in=s.nextInt();
  		        	System.out.println("The element is "+list.get(in));
  		        	break;
  		        case 4:
  		        	System.out.println(list);
  		        	break;
  		        default:
  		        	System.out.println("Select a valid operation...!\n");
  		        	break;
  		        }
  		        System.out.println("\nDo you want to continue(1/2):");
  		        System.out.println("1.Yes\n2.No");
  		        int cn1 = s.nextInt();
  		        flag =cn1;
  	        }
  	    }
  	}