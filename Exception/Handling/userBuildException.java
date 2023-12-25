package Exception.Handling;

public class userBuildException extends Exception {

    private static int acc[] = {123, 456, 789, 012};
    private static String name[] = {"Shiva", "Sham", "Kunal", "Sanjay", "Shima"};

    private static double bal[] = {4000, 5000, 6000, 8000, 7000};

    userBuildException() {
    }

    userBuildException(String str) {
        super(str);
    }

    public static void main(String args[]) {
        try {
            System.out.println("Account" + "\t" + "Customer" + "\t" + "Balance");

            for (int i = 0; i < 4; i++) {
                System.out.println(acc[i] + "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 4000) {
                    userBuildException me = new userBuildException("Balance is less than 50000");
                    throw me;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}