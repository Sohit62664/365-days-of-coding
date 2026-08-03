public class microsoft {

    public static void Solver(String s) {
        int z = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                z++;
            } else {
                o++;
            }
        }

        StringBuilder b = new StringBuilder();

        if (o == z) {
            while (o > 0) {
                b.append("01");
                o--;
            }
        } else if (o > z) {
            StringBuilder sb = new StringBuilder();
            while (z > 0) {
                sb.append("01");
                z--;
                o--;
            }

            while (o > 0) {
                b.append("1");
                o--;
            }

            b.append(sb);
        } else {
            StringBuilder sb = new StringBuilder();
            while (o > 0) {
                sb.append("01");
                z--;
                o--;
            }

            while (z > 0) {
                b.append("0");
                z--;
            }

            b.append(sb);
        }

        System.out.println(b);
    }

    public static void main(String[] args) {
        Solver("11011011");
    }
}
