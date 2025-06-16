public class Arrays
{
    static void change(int []arr)
    {
        arr[0]=98;
    }
    public static void main(String[]args)
    {
    int []marks={52,98,99,67,88,89};
    change(marks);
    System.out.println(marks[0]);
   }
}