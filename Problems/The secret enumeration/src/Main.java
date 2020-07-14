public class Main {

//    enum Secret {
//        STAR, CRASH, START, // ...
//    }

    public static void main(String[] args) {

        int starCount = 0;

        for (Secret s : Secret.values()) {
            if (s.toString().startsWith("STAR")) {
                starCount++;
            }
        }
        System.out.println(starCount);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/