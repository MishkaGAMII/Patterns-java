public class Triangle {
    private float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a; this.b = b; this.c = c;
    }

    public float square() {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Методи для зміни сторін (setA, setB, setC) аналогічні варіанту 1
    public void setA(float a) { if (a + b > c && a + c > b && b + c > a) this.a = a; }
    public void setB(float b) { if (a + b > c && a + c > b && b + c > a) this.b = b; }
    public void setC(float c) { if (a + b > c && a + c > b && b + c > a) this.c = c; }

    public IMemento save() {
        return new TriangleMemento(a, b, c);
    }

    // Внутрішній клас реалізує логіку відновлення
    private class TriangleMemento implements IMemento {
        private final float ma, mb, mc;

        private TriangleMemento(float a, float b, float c) {
            this.ma = a; this.mb = b; this.mc = c;
        }

        @Override
        public void restore() {
            Triangle.this.a = ma;
            Triangle.this.b = mb;
            Triangle.this.c = mc;
        }
    }
}