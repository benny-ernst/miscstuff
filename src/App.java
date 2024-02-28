public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayTest = {1,2,3,4};
        int i;

        for (i = 0; i < arrayTest.length; i++)
        {
            if (i == arrayTest.length - 1)
            {
                System.out.println(arrayTest[i]);
            }
            else
            {
                System.out.print(arrayTest[i] + ", ");
            }
        }
    }
}
