public class Triangle {
    private float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a; this.b = b; this.c = c;
    }

    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Сетери з перевіркою
    public void setA(float a) { if (checkExistence(a, b, c)) this.a = a; }
    public void setB(float b) { if (checkExistence(a, b, c)) this.b = b; }
    public void setC(float c) { if (checkExistence(a, b, c)) this.c = c; }

    // Операції зміни вдвічі
    public void duplicateA() { if (checkExistence(a * 2, b, c)) a *= 2; }
    public void halfA()      { if (checkExistence(a / 2, b, c)) a /= 2; }
    public void duplicateB() { if (checkExistence(a, b * 2, c)) b *= 2; }
    public void halfB()      { if (checkExistence(a, b / 2, c)) b /= 2; }
    public void duplicateC() { if (checkExistence(a, b, c * 2)) c *= 2; }
    public void halfC()      { if (checkExistence(a, b, c / 2)) c /= 2; }

    public float square() {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Реалізація Memento
    public static class Memento {
        private final float a, b, c;
        private Memento(float a, float b, float c) {
            this.a = a; this.b = b; this.c = c;
        }
    }

    public Memento save() {
        return new Memento(a, b, c);
    }

    public void restore(Memento memento) {
        this.a = memento.a;
        this.b = memento.b;
        this.c = memento.c;
    }

    @Override
    public String toString() {
        return String.format("Triangle[a=%.1f, b=%.1f, c=%.1f], Area=%.2f", a, b, c, square());
    }
}