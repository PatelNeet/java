package ExceptionEx;
class CatchExceptionEx1
{
    public static void main(String[] args) {
        int mat[]=new int[10];
        try
        {
        mat[10]=25;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds in mat array");
            mat[9]=25;
        }
        System.out.println("Beyond the exception point");
        System.out.println("last element of mat = "+mat[9]);
    }
}


