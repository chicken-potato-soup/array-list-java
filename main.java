public class main
{
    public static void main(String[] args)
    {
        array_list arr= new array_list(15);
        arr.insertInOrder(9);
        arr.insertInOrder(3);
        arr.insertInOrder(11);
        arr.insertInOrder(69);
        arr.insertInOrder(1);
        arr.remove(1);
        arr.display();
    }
}