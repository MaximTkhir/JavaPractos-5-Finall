import java.util.Random;

public class Security {
    private boolean isPrisonBreak;

    public Security() {
        this.isPrisonBreak = false;
    }

    public void detectPrisonBreak() {
        Random random = new Random();
        int probability = random.nextInt(100);

        if (probability < 70) {
            isPrisonBreak = true;
            System.out.println("Побег из тюрьмы обнаружен!");
        } else {
            System.out.println("Побега из тюрьмы не обнаружено.");
        }
    }

    public void reinforceSecurity(Guard guard) {
        Random random = new Random();
        int reinforcements = random.nextInt(10) + 1;
        guard.dismissGuards(reinforcements);
        System.out.println("Охрана усилена. Пришло " + reinforcements + " новых охранников.");
    }

    public void checkPrisonersPresence(Prisoner prisoner) {
        if (prisoner.getNumberOfPrisoners() > 0) {
            System.out.println("В тюрьме находятся заключенные.");
        } else {
            System.out.println("Тюрьма пуста.");
        }
    }
}