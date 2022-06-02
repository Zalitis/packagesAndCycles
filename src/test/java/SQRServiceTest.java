import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    void optionOne() {
        SQRService service = new SQRService();
        // заводим входные данные
//        int firstBorder = 200;
//        int secondBorder = 300;
        int expected = 3;
        // я думаю можно обойтись без переменных, да?
        int check = service.NumberOfSquares(200, 300);

        Assertions.assertEquals(expected, check);
    }

    @Test
    void optionTwo() {
        SQRService service = new SQRService();
        int expected = 6;
        int check = service.NumberOfSquares(200, 400);
        Assertions.assertEquals(expected, check);
    }
}
