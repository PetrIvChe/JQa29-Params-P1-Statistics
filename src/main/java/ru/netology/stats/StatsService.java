package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] salesAmount) {
        long sum = 0;
        for (long saleAmount : salesAmount) {
            sum += saleAmount;
        }
        return sum;
    }

    public long calculateAverageSum(long[] salesAmount) {
        return calculateSum(salesAmount) / salesAmount.length;
    }

    public int calculateMaxSaleMonth( long[] salesAmount) {
        int maxMonth = 0;
        int month = 0;
        //long maxSaleMonth = salesAmount[maxMonth];
        for (long saleAmount : salesAmount) {
            if (saleAmount >= salesAmount[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] salesAmount) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long saleAmount : salesAmount) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (saleAmount <= salesAmount[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowTheAverage(long[] salesAmount) {
        int count = 0; // счетчик месяцев
        long averageSum = calculateSum(salesAmount) / salesAmount.length;
        for (long saleAmount : salesAmount) {
            if (saleAmount < averageSum) {
                // belowMonth = count;
                count = count + 1;
            }
        }
        return count;
    }

    public int upperAverage(long[] salesAmount) {
        int count = 0;
        long averageSum = calculateSum(salesAmount) / salesAmount.length;
        for (long saleAmount : salesAmount) {
            if (saleAmount > averageSum) {
                // belowMonth = count;
                count = count + 1;
            }
        }
        return count;
    }


}
