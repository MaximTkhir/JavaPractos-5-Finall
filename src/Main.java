import java.util.Scanner;

public class Main {
    public static final String RESET = "\033[0m";  // Сброс цвета
    public static final String BLACK = "\033[0;30m";   // Черный цвет
    public static final String RED = "\033[0;31m";     // Красный цвет
    public static final String GREEN = "\033[0;32m";   // Зеленый цвет
    public static final String YELLOW = "\033[0;33m";  // Желтый цвет
    public static final String BLUE = "\033[0;34m";    // Синий цвет
    public static final String PURPLE = "\033[0;35m";  // Пурпурный цвет
    public static final String CYAN = "\033[0;36m";    // Голубой цвет
    public static final String WHITE = "\033[0;37m";   // Белый цвет

    public static final String BLACK_BACKGROUND = "\033[40m";   // Черный фон
    public static final String RED_BACKGROUND = "\033[41m";     // Красный фон
    public static final String GREEN_BACKGROUND = "\033[42m";   // Зеленый фон
    public static final String YELLOW_BACKGROUND = "\033[43m";  // Желтый фон
    public static final String BLUE_BACKGROUND = "\033[44m";    // Синий фон
    public static final String PURPLE_BACKGROUND = "\033[45m";  // Пурпурный фон
    public static final String CYAN_BACKGROUND = "\033[46m";    // Голубой фон
    public static final String WHITE_BACKGROUND = "\033[47m";   // Белый фон

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guard guard = new Guard(10);
        Prisoner prisoner = new Prisoner(0);
        Security security = new Security();
        boolean exit = false;
        while (!exit) {
            System.out.println("                                                                                                            \n" +
                    "                                                                                                            \n" +
                    "█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗\n" +
                    "╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝\n" +
                    "                                                                                                            \n" +
                    "                                                                                                            \n" +
                    "                                                                                                            ");
            System.out.println("██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗     ████████╗██╗  ██╗███████╗    ██████╗ ██████╗ ██╗███████╗ ██████╗ ███╗   ██╗\n" +
                    "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ╚══██╔══╝██║  ██║██╔════╝    ██╔══██╗██╔══██╗██║██╔════╝██╔═══██╗████╗  ██║\n" +
                    "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║       ██║   ███████║█████╗      ██████╔╝██████╔╝██║███████╗██║   ██║██╔██╗ ██║\n" +
                    "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║       ██║   ██╔══██║██╔══╝      ██╔═══╝ ██╔══██╗██║╚════██║██║   ██║██║╚██╗██║\n" +
                    "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝       ██║   ██║  ██║███████╗    ██║     ██║  ██║██║███████║╚██████╔╝██║ ╚████║\n" +
                    " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝        ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝     ╚═╝  ╚═╝╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═══╝\n" +
                    "                                                                                                                                                                   ");
            System.out.println("                                                                                                            \n" +
                    "                                                                                                            \n" +
                    "█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗\n" +
                    "╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝\n" +
                    "                                                                                                            \n" +
                    "                                                                                                            \n" +
                    "                                                                                                            ");
            System.out.println("Выберите действие:");
            System.out.println(RED + "1. Посмотреть количество заключенных" + RESET);
            System.out.println(BLUE + "2. Посмотреть количество охранников" + RESET);
            System.out.println(RED + "3. Добавить заключенных" + RESET);
            System.out.println(RED + "4. Убавить заключенных" + RESET);
            System.out.println(BLUE + "5. Добавить охранников" + RESET);
            System.out.println(BLUE + "6. Убавить охранников" + RESET);
            System.out.println(RED + "7. Проверить наличие заключенных и уровень опасности" + RESET);
            System.out.println(WHITE + "8. Обнаружить побег" + RESET);
            System.out.println(CYAN + "9. Усилить охрану" + RESET);
            System.out.println(YELLOW + "10. Выйти из программы" + RESET);
            System.out.println("                                                                                                            \n" +
                    "                                                                                                            \n" +
                    "█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗█████╗\n" +
                    "╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝╚════╝\n" +
                    "                                                                                                            \n" +
                    "                                                                                                            \n" +
                    "                                                                                                            ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("В тюрьме находится " + prisoner.getNumberOfPrisoners() + " заключенных.");
                    break;
                case 2:
                    System.out.println("---------------------------------------");
                    System.out.println("В тюрьме работает " + guard.getNumberOfGuards() + " охранников.");
                    break;
                case 3:
                    System.out.println("---------------------------------------");
                    System.out.println("Сколько заключенных добавить?");
                    int addPrisoners = scanner.nextInt();
                    prisoner.admitPrisoners(addPrisoners);
                    break;
                case 4:
                    System.out.println("---------------------------------------");
                    System.out.println("Сколько заключенных убавить?");
                    int removePrisoners = scanner.nextInt();
                    prisoner.admitPrisoners(-removePrisoners);
                    break;
                case 5:
                    System.out.println("---------------------------------------");
                    System.out.println("Сколько охранников добавить?");
                    int addGuards = scanner.nextInt();
                    guard.dismissGuards(addGuards);
                    break;
                case 6:
                    System.out.println("---------------------------------------");
                    System.out.println("Сколько охранников убавить?");
                    int removeGuards = scanner.nextInt();
                    guard.dismissGuards(-removeGuards);
                    break;
                case 7:
                    System.out.println("---------------------------------------");
                    security.checkPrisonersPresence(prisoner);
                    prisoner.checkPrisonersDangerLevel();
                    break;
                case 8:
                    System.out.println("---------------------------------------");
                    security.detectPrisonBreak();
                    break;
                case 9:
                    System.out.println("---------------------------------------");
                    security.reinforceSecurity(guard);
                    break;
                case 10:
                    exit = true;
                    System.out.println("=======================================");
                    System.out.println(" ▄▄▄▄ ▓██   ██▓▓█████     ▄▄▄▄ ▓██   ██▓▓█████ \n" +
                            "▓█████▄▒██  ██▒▓█   ▀    ▓█████▄▒██  ██▒▓█   ▀ \n" +
                            "▒██▒ ▄██▒██ ██░▒███      ▒██▒ ▄██▒██ ██░▒███   \n" +
                            "▒██░█▀  ░ ▐██▓░▒▓█  ▄    ▒██░█▀  ░ ▐██▓░▒▓█  ▄ \n" +
                            "░▓█  ▀█▓░ ██▒▓░░▒████▒   ░▓█  ▀█▓░ ██▒▓░░▒████▒\n" +
                            "░▒▓███▀▒ ██▒▒▒ ░░ ▒░ ░   ░▒▓███▀▒ ██▒▒▒ ░░ ▒░ ░\n" +
                            "▒░▒   ░▓██ ░▒░  ░ ░  ░   ▒░▒   ░▓██ ░▒░  ░ ░  ░\n" +
                            " ░    ░▒ ▒ ░░     ░       ░    ░▒ ▒ ░░     ░   \n" +
                            " ░     ░ ░        ░  ░    ░     ░ ░        ░  ░\n" +
                            "      ░░ ░                     ░░ ░            ");
                    System.out.println("=======================================");
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}

