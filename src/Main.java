import ua.lviv.iot.RabinKarp;

public class Main {
    public static void main(String[] args) {
        RabinKarp algo = new RabinKarp();
        String text = "ABCDRGFTH";
        String pattern = "CD";
        System.out.println(algo.matchWithPattern(text, pattern));
    }
}