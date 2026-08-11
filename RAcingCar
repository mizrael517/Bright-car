import java.util.Random;

public class RacingCar {
    public static void main(String[] args) {
        Random random = new Random();

        int car1 = 0;
        int car2 = 0;
        int finishLine = 20;

        System.out.println("🏁 RACING CAR GAME  🏁");

        while (car1 < finishLine && car2 < finishLine) {
            car1 += random.nextInt(4) + 1;
            car2 += random.nextInt(4) + 1;

            System.out.print("Car 1: ");
            for (int i = 0; i < car1; i++) {
                System.out.print("-");
            }
            System.out.println("🚗");

            System.out.print("Car 2: ");
            for (int i = 0; i < car2; i++) {
                System.out.print("-");
            }
            System.out.println("  🏎️");

            System.out.println("-------------------------");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (car1 >= finishLine && car2 >= finishLine) {
            System.out.println("It's a TIE! 🏆  ");
        } else if (car1 >= finishLine) {
            System.out.println("Car 1 WINS! 🏆  🚗");
        } else {
            System.out.println("Car 2 WINS! 🏆  🏎️");
        }
    }
}
