public class After {
    public static void main(String[] args) {
        for (String t :
                args) {
            System.out.println(t);
        }
        System.out.println(args);
        int mi, ma;
        if (args.length == 0) {
            System.out.println("No numbers");
        } else {
            mi = ma = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) {
                int obs = Integer.parseInt(args[i]);
                if (obs > ma) ma = obs;
                else if (mi < obs) mi = obs;
            }
            System.out.println("Minimum = " + mi + "; maximum = " + ma);
        }
    }
}
