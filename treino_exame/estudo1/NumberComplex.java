public class NumberComplex {
    int real;
    int imaginary;

    public NumberComplex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public NumberComplex(int real) {
        this.real = real;
        this.imaginary = 0;
    }

    public NumberComplex(String complex) {
        String[] parts;

        if (complex.contains("+")) {
            parts = complex.split("\\+");
            this.real = Integer.parseInt(parts[0]);
            this.imaginary = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
        }
        else if (complex.contains("-")) {
            parts = complex.split("-");
            this.real = Integer.parseInt(parts[0]);
            if (parts[1].length() == 1) { 
                this.imaginary = -1;
            } else {
                this.imaginary = -Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
            }
        }
        else {
            if (complex.contains("i")) {
                this.real = 0;

                if (complex.length() > 1) {
                    this.imaginary = (Integer.parseInt(complex.substring(0, complex.length() -1 )));
                }
                else {
                    this.imaginary = 1;
                }
            }
        }
        }

        public NumberComplex add(NumberComplex other) {
            return new NumberComplex(this.real + other.real, this.imaginary + other.imaginary);
        }

        public NumberComplex subtract(NumberComplex other) {
            if (this.imaginary == 0) {
                return new NumberComplex(this.real - other.real, other.imaginary);
            } else {
                return new NumberComplex(this.real - other.real, this.imaginary - other.imaginary);
            }
        }
    
        public NumberComplex multiply(NumberComplex other) {
            return new NumberComplex(this.real * other.real - this.imaginary * other.imaginary,
                    this.real * other.imaginary + this.imaginary * other.real);
        }
    
        public NumberComplex divide(NumberComplex other) {
            return new NumberComplex((this.real * other.real + this.imaginary * other.imaginary) /
                    (other.real * other.real + other.imaginary * other.imaginary),
                    (this.imaginary * other.real - this.real * other.imaginary) /
                            (other.real * other.real + other.imaginary * other.imaginary));
        }

        public int getReal() {
            return this.real;
        }

        public int getImaginary() {
            return this.imaginary;
        }


    }
    
