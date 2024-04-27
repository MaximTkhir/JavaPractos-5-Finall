public class Guard {
    private int numberOfGuards;

    public Guard(int numberOfGuards) {
        this.numberOfGuards = numberOfGuards;
    }

    public int getNumberOfGuards() {
        return numberOfGuards;
    }

    public void dismissGuards(int count) {
        numberOfGuards += count;
        if (count > 0) {
            System.out.println(count + " охранников были добавлены. Теперь в тюрьме работает: " + numberOfGuards + " охранников.");
        } else {
            System.out.println(-count + " охранников были уволены. Осталось охранников: " + numberOfGuards);
        }
    }
}