package com.vulfcorp;

import com.vulfcorp.abstracts.AbstractMatrix;
import com.vulfcorp.impl.NormalMatrix;
import com.vulfcorp.impl.SpareMatrix;
import com.vulfcorp.interfaces.IMatrix;
import com.vulfcorp.tools.InitiatorMatrix;
import com.vulfcorp.tools.StatisticMatrix;

public class Main {
    public static void main(String[] args) {
        NormalMatrix normalMatrix = new NormalMatrix(4,4);
        SpareMatrix spareMatrix = new SpareMatrix(4,4);

        InitiatorMatrix.FillMatrix(normalMatrix, 10, 10);
        InitiatorMatrix.FillMatrix(spareMatrix, 5, 10);

        PrintStatisticInConsole(normalMatrix);
        PrintStatisticInConsole(spareMatrix);
    }

    private static void PrintStatisticInConsole(AbstractMatrix matrix){
        System.out.println(matrix.toString());
        StatisticMatrix statistic = new StatisticMatrix(matrix);
        System.out.println("SUM NUMBERS = "+statistic.getSumMatrixNumbers());
        System.out.println("AVG NUMBER = "+statistic.getAvgNumber());
        System.out.println("COUNT NOT NULL = "+statistic.countNotNullNumbers());
        System.out.println("MAX NUMBER = "+statistic.maxNumberInMatrix());
        System.out.println("\n");
    }
}
