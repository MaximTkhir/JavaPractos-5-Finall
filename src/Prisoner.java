public class Prisoner {
    private int numberOfPrisoners;

    public Prisoner(int numberOfPrisoners) {
        this.numberOfPrisoners = numberOfPrisoners;
    }

    public void admitPrisoners(int count) {
        numberOfPrisoners += count;
        if (count > 0) {
            System.out.println(count + " новых заключенных были приняты. Всего в тюрьме: " + numberOfPrisoners);
        } else {
            System.out.println(-count + " заключенных были освобождены. Осталось в тюрьме: " + numberOfPrisoners);
        }
    }

    public int getNumberOfPrisoners() {
        return numberOfPrisoners;
    }

    public void checkPrisonersDangerLevel() {
        if (numberOfPrisoners <= 10) {
            System.out.println("Количество заключенных: " + numberOfPrisoners + ". Это безопасный уровень.");
        } else if (numberOfPrisoners <= 25) {
            System.out.println("Количество заключенных: " + numberOfPrisoners + ". Это средний уровень опасности.");
        } else {
            System.out.println("Количество заключенных: " + numberOfPrisoners + ". Уровень опасности высокий!");
        }
    }
}