import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Номер месяца с минимальными продажами: " + service.minSales(sales));
        System.out.println("Номер месяца с максимальными продажами: " + service.maxSales(sales));
        System.out.println("Средняя сумма продаж: " + service.averageSales(sales));
        System.out.println("Сумма продаж: " + service.sumSales(sales));
        System.out.println("количество месяцев, в которых продажи были ниже среднего: " + service.belowAverage(sales));
        System.out.println("количество месяцев, в которых продажи были выше среднего: " + service.aboveAverage(sales));
    }

}
