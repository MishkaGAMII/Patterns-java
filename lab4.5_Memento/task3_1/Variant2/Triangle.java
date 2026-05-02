public class Triangle {
    private float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a; this.b = b; this.c = c;
    }

    // Приватна реалізація інтерфейсу
    private static class TriangleMemento implements Memento {
        private final float a, b, c;
        private TriangleMemento(float a, float b, float c) {
            this.a = a; this.b = b; this.c = c;
        }
    }

    public void setA(float a) { if (a + b > c && a + c > b && b + c > a) this.a = a; }
    public void setB(float b) { if (a + b > c && a + c > b && b + c > a) this.b = b; }
    public void setC(float c) { if (a + b > c && a + c > b && b + c > a) this.c = c; }

    public float square() {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Memento save() {
        return new TriangleMemento(a, b, c);
    }

    public void restore(Memento m) {
        TriangleMemento tm = (TriangleMemento) m;
        this.a = tm.a; this.b = tm.b; this.c = tm.c;
    }
}