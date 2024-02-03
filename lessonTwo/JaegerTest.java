public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");

        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-5", "Australia");

        jaeger1.displayInfo();
        System.out.println("----------");
        jaeger2.displayInfo();
    }
}

