package A011;

public class Main {
    static int g[];
    static int s[];
    public static void main(String[] args) {
        Method method = new Method();

        g = method.Input(g);
        s = method.Input(s);
        method.print(g, s);
    }
}