public class SQRService {
    public int NumberOfSquares(int firstBorder, int secondBorder) {
        int numberOfRoots = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstBorder && i * i <= secondBorder) {
                numberOfRoots++;
            }
        }
        return numberOfRoots;
    }
}
