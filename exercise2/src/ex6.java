public class ex6 {
        public static void main(String args[]){
            try{
                int a[]=new int[7];

                a[4]=30/0;

                System.out.println("First print statement in try block");
            }

            catch(ArithmeticException e){
                System.out.println("Warning: ArithmeticException");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Warning: ArrayIndexOutOfBoundsException");
            }
            catch(Exception e){
                System.out.println("Warning: Some Other exception");
            }
            finally {
                System.out.println("Finally entered");
            }
            System.out.println("Out of try-catch block...");
        }
    }


