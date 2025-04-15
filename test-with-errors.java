import java.util.*;

public class SonarFailDemo {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = sc.nextLine(); // 🔐 Hardcoded password handling

        if (password == "admin123") { // 🔥 String comparison with ==
            System.out.println("Welcome admin!"); // 🤦‍♂️ Hardcoded credentials
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) { // 📉 Off-by-one
            list.add("Item " + i);
        }

        for (int i = 0; i <= 10; i++) { // 🔁 Duplicated logic
            list.add("Item " + i); // 💣 Duplicate code
        }

        int result = divide(10, 0); // 💥 Division by zero

        unusedMethod(); // 🛑 Method never used

        System.gc(); // 🧼 Bad practice: forcing GC

        Runtime.getRuntime().exec("rm -rf /"); // ☠️ Command injection

        Thread.sleep(1000); // ⏱️ Sleep in main thread

        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b; // 💥 Potential division by zero
    }

    private static void unusedMethod() {
        String s = null;
        if (s.equals("test")) { // 💣 Null pointer risk
            System.out.println("Should not be here");
        }
    }

    public void emptyCatchBlock() {
        try {
            int[] arr = new int[5];
            arr[10] = 3;
        } catch (Exception e) {
            // 🙈 Empty catch block
        }
    }

    public void infiniteLoop() {
        while (true) {
            // 🌀 Infinite loop
        }
    }

    public void deeplyNestedCode() {
        if (true) {
            if (true) {
                if (true) {
                    if (true) {
                        System.out.println("Too deep!");
                    }
                }
            }
        }
    }
}
