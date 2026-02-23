package composicao;

public class Date {
    private static final int[] DAYS_PER_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            System.out.printf("month (%d) deve ser 1-12%n", month);
        }

        if (day <= 0 || day > DAYS_PER_MONTH[month] && !(month == 2 && day == 29)) {
            System.out.printf("day (%d) fora do intervalo para o mês e ano %d%n", day, month);
        }

        //verifica se é ano bissexto
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.printf("day (%d) fora do intervalo para o mês e ano %d%n", day, month);
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
