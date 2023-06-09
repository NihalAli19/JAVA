abstract class Marks {
    abstract float getPercentage();
}

class A extends Marks {
    float m1, m2, m3, percentage;

    public A(float m1, float m2, float m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    float getPercentage() {
        percentage = ((m1 + m2 + m3) / 300) * 100;
        return percentage;
    }
}

class B extends Marks {
    float m1, m2, m3, m4, percentage;

    public B(float m1, float m2, float m3, float m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    @Override
    public float getPercentage() {
        percentage = ((m1 + m2 + m3 + m4) / 400) * 100;
        return percentage;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Marks A = new A(90.5F,95.6F,98.3F);
        Marks B = new B(90.5F,95.6F,98.3F,99.5F);

        System.out.println("Percentage of Student A: "+A.getPercentage());
        System.out.println("Percentage of Student B: "+B.getPercentage());
    }
}
