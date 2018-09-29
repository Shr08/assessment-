public class ex9 {
    public static void main(String[] args) {
        int chairFire = chair.getFireSafety();
        int chairStress=chair.getStressValue();
        int tableFire=table.getFireSafety();
        int tableStress=table.getStressValue();
        if(chairFire>5&&tableFire>10)
        {
            System.out.println("Fire test pass");
        }
        else
            {
                System.out.println("Fail");
            }
            if(chairStress>5&&tableStress>10)
            {
                System.out.println("Stress test pass");
            }
            else
            {
                System.out.println("Fail");
            }


        }
    }

    interface metal
    {

    }

    interface wooden{

    }
    class furniture implements metal,wooden
    {

    }

    class chair extends furniture{
        static int stressValue=10;
        static int fireSafety=20;

        public static int getFireSafety() {
            return fireSafety;
        }

        public static int getStressValue() {
            return stressValue;
        }
    }

    class table extends furniture{
        static int stressValue=30;
        static int fireSafety=60;

        public static int getFireSafety() {
            return fireSafety;
        }

        public static int getStressValue() {
            return stressValue;
        }
}
