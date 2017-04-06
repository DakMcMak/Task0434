public class Main {
    public static void main(String[] args) throws Exception {
        int i=1;
        int j=1;
        int a=0;
        while (i<=10)
        {
            while (j<=10)
            {
                a=a+i;
                System.out.print(a+" ");
                j++;
            }
            System.out.println();
            j=1;
            a=0;
            i++;
        }
    }
}
