import org.junit.jupiter.api.Test;
import ru.netology.services.BonusService;

public class BonusServiceTest {
    @Test
    public void test() {
        BonusService service = new BonusService();
        int x = 1;
        while (x < 13) {
            System.out.println("Месяц" + x);
            x = x + 1;
        }
        for (int i = 1; i < 13; i++) {
            System.out.println(i);
        }

    }
}

