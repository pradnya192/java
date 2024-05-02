class EXCEPTION2
{
    public static void main(String args[])
    {
        try
        {
            try
            {
               int arr[]={2,4,67};
               System.out.println(+arr[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
