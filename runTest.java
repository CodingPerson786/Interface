import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class runTest implements CollectionTest
{ 
    private Person a;
    private int size;
    private LinkedList<Person> ll;
    private ArrayList<Person> al;
    private HashMap<Person, Person> hm;

    
    public void runTest(CollectionType type, TestType test, int iterations)
    {
        Person p;
        switch(type)
        {
            case LINKED_LIST:
            switch(test)
            {
                case ADD:
                ll=new LinkedList<Person>();
                for(int i=0;i<size;i++)
                {
                    
                    p=new Person("Person"+i,20+i);
                    ll.add(p);
                }
                break;

               
                case INDEX:
                int pos=size/2;
                p=ll.get(pos);//return arraylist at index size/2

                
                case SEARCH:
                int pos2=size/2;
                String name="Person"+(pos2);
  
                for(Person a: ll)
                 {
                    if(a.getName().equals(name))
                    {
                        p=a;
                        break;
                    }
                 }
                
            }
            break;

            case ARRAY_LIST:
            switch(test)
            {
                case ADD:
                al=new ArrayList<Person>();
                for(int i=0;i<size;i++)
                {
                    
                    p=new Person("Person"+i,20+i);
                    ll.add(p);
                }
                break;

                case INDEX:
                int pos=size/2;
                p=ll.get(pos);

                case SEARCH:
                int pos2=size/2;
                String name="Person"+(pos2);
                for(Person a: ll)
                 {
                    if(a.getName().equals(name))
                    {
                        p=a;
                        break;
                    }
                 }
            }
            break;

            case HASH_MAP:
            switch(test)
            {
                case ADD:
                Person p2;
                hm=new HashMap<Person, Person>();
                int num;
                for(int i=0;i<size;i++)
                {
                    p=new Person("Person"+i,20+i);
                    for(int j=0;j<size;j++)
                    {
                        num=i+j;
                        p2=new Person("Person"+j+i,20+j+i);
                        hm.put(p,p2);
                        num=0;
                    }
                }
                    break;

                case INDEX:
                    break;

                case SEARCH:
                    break;
            }
            break;

        }
    }

    public void setSize(int size)
    {
        this.size=size;
    }

   

    // public void add()
    // {

    // }

    // public void index()
    // {

    // }
    // public void search()
    // {

    // }
   
    

    
}