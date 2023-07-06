import java.sql.SQLOutput;

public class Main {
    public static void main(String[] agrs) {
        BonusService service = new BonusService();
        long bonus = service.calculate(5_000, true);
        System.out.println(bonus);
    }
}
