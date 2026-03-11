
package excephandling;  
public class main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] nums = new int[4];
        nums[0] = 21;
        nums[1] = 33;
        nums[2] = 45;
        try {
            System.out.println(nums[6]);
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Executed");
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Executed");
        }
         catch (Exception e) {
            System.out.println("Exception Parent Executed");
        }

    }
}
