import java.util.Scanner;
public class array_list
{
    private int size;
    private int length;
    private int list[];

    public array_list(int s)
    {   
        if(s<10)
            size=100;
        else
            size=s;
        
        length=0;
        list=new int[size];
        for(int i=0; i<size; i++)
            {
                list[i]=-1;
            }
    }

    public void display()
    {
        for(int i=0; i<length; i++)
            {
                System.out.print(list[i]);
                System.out.print(" ");
            }
    }

    public Boolean isEmpty()
    {
        return(length==0);
    }
    public Boolean isFull()
    {
        return (size==length);
    }
    public void insertInOrder(int val)
    {
        int index=-1;
        if(size==length)
            System.out.println("List is full");
        else if(isEmpty())
            {
                list[length]=val;
                length++;
            }
        else
            {
                for(int i=0; i<length; i++)
                    {
                        if(list[i]>val)
                            {
                                index=i;
                                break;
                            }

                    }
                if(index==-1)
                    {
                        list[length]=val;
                        length++;
                    }
                else if(index!=-1)
                    {
                        int temp, temp2;
                        temp2=val;
                        length++;
                        for(int i=index; i<length; i++)
                            {
                                temp=list[i];
                                list[i]=temp2;
                                temp2=temp;
                            }
                    }
            }
    }
    public void removeAt( int index)
    {
        if(!isEmpty() && index>=0 && index<length)
            {
                if(index==length-1)
                    {
                        length--;
                    }
                else
                    {
                        for(int i=index; i<length;i++)
                            {
                                list[i]=list[i+1];
                            }
                        length--;
                    }
            }
        else
            System.out.println("Nothing to remove");
    }

    public int search(int val)
    {
        int result=-1;
        if(isEmpty())
            result=-1;
        for(int i=0; i<length; i++)
            {
                if(list[i]==val)
                    result=i;
            }
        return result;
    }

    public void remove(int val)
        {
            if(search(val)!=-1)
                {
                    removeAt(search(val));
                }
            else if(search(val)==-1)
                System.out.println("Can't remove nonexistant value");
        }

}

