interface Function {
    double calculate(double x);
    void printResult(double x);
}

class Ellipse implements Function {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return Math.sqrt((1 - (x * x) / (a * a)) * (b * b));
    }

    @Override
    public void printResult(double x) {
        System.out.println("Еліпс: обчислення для x = " + x + " дає y = " + calculate(x));
    }

    @Override
    public String toString() {
        return "Еліпс з параметрами a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ellipse ellipse = (Ellipse) obj;
        return Double.compare(ellipse.a, a) == 0 && Double.compare(ellipse.b, b) == 0;
    }
}

class Hyperbola implements Function {
    private double a;

    public Hyperbola(double a) {
        this.a = a;
    }

    @Override
    public double calculate(double x) {
        return Math.sqrt((x * x) / (a * a) - 1);
    }

    @Override
    public void printResult(double x) {
        System.out.println("Гіпербола: обчислення для x = " + x + " дає y = " + calculate(x));
    }

    @Override
    public String toString() {
        return "Гіпербола з параметром a = " + a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hyperbola hyperbola = (Hyperbola) obj;
        return Double.compare(hyperbola.a, a) == 0;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Function[] functions = new Function[2];

        functions[0] = new Ellipse(5, 3);
        functions[1] = new Hyperbola(4);

        for (Function f : functions) {
            System.out.println(f.toString());
            f.printResult(2);
            System.out.println();
        }

        Ellipse ellipse1 = new Ellipse(5, 3);
        Ellipse ellipse2 = new Ellipse(5, 3);
        Hyperbola hyperbola1 = new Hyperbola(4);
        Hyperbola hyperbola2 = new Hyperbola(5);

        System.out.println("ellipse1 equals ellipse2: " + ellipse1.equals(ellipse2));
        System.out.println("hyperbola1 equals hyperbola2: " + hyperbola1.equals(hyperbola2));
    }
}
