package utils;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    private static final int[] DAYS_PER_MONTH =
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int month, int day, int year) {
        //verifica se mês está no intervalo de 1 a 12
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        //verifica se o dia está no intervalo correto para o mês
        if (day <= 0 || (day > DAYS_PER_MONTH[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        }

        //verifica se é ano bissexto
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        }
        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
