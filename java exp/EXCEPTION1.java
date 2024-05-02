class EXCEPTION1
{
    public static void main(String args[])
    {
        try
        {
            String s=null;
            System.out.println(s.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println("hey");
            }
        }
    }
}
