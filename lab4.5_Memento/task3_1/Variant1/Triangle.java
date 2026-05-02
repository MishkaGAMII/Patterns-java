public class Triangle {
    private float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a; this.b = b; this.c = c;
    }

    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public void setA(float a) { if (checkExistence(a, b, c)) this.a = a; }
    public void setB(float b) { if (checkExistence(a, b, c)) this.b = b; }
    public void setC(float c) { if (checkExistence(a, b, c)) this.c = c; }

    public float square() {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Внутрішній клас-знімок
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
}