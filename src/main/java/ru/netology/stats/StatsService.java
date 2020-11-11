package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    int sailsSum(int[] sails) {
        int sum = 0;
        for (int tmp : sails) {
            sum += tmp;
        }
        return sum;
    }

    //средняя сумма продаж
    double averageSails(int[] sails){
        return sailsSum(sails) / 12;

    }

    //Номер месяца, в котором был пик продаж
    int maxSails(int[] sails){
        int max = 0;
        int tmp = 1; //счетчик
        int month = 0;
        for (int i:sails){

            if (i>=max){
                max = i;
                month = tmp;
            }
            tmp += 1;
        }
        return month;
    }

    //Номер месяца, в котором был минимум продаж
    int minSails(int[] sails){
        int min = sails[0];
        int tmp = 1; //счетчик
        int month = 0;
        for (int i:sails){

            if (i<=min){
                min = i;
                month = tmp;
            }
            tmp += 1;
        }
        return month;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    int lessAverage(int[] sails){
        int month = 0;
        for (int i:sails){
            if (i<averageSails(sails)){
                month += 1;
            }
        }
        return month;

    }

    //Кол-во месяцев, в которых продажи были выше среднего
    int moreAverage(int[] sails){
        int month = 0;
        for (int i:sails){
            if (i>averageSails(sails)){
                month += 1;
            }
        }
        return month;

    }

}
