public class Fraction {
    int num;
    int den;
    String fraction;
    boolean error = false;
    
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction(int num) {
        this.num = num;
        this.den = 1;
    }

    public Fraction(String fraction) {
        String[] parts = fraction.split("/");
        try {
            switch (parts.length) {
                case 1:
                    num = Integer.parseInt(parts[0]);
                    den = 1;
                case 2:
                    num = Integer.parseInt(parts[0]);
                    den = Integer.parseInt(parts[1]);
                default:
                    error = true;
            }
            }
             catch (Exception e) {
                error = true;
            }
        }

        public String toString() {
            return "" + num + (den == 1 ? "" : "/" + den);
        }

        public int num() {
            return num;
        }

        public int den() {
            return den;
        }

}