package com.vulfcorp.tools;

import com.vulfcorp.interfaces.IMatrix;

public class InitiatorMatrix {
    public static IMatrix FillMatrix(IMatrix matrix, int countNotNullNumbers, int maxNumber)
    {
        int columns = matrix.getColumnCount();
        int lines = matrix.getLineCount();
        int notNullNumbers = countNotNullNumbers;
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                if(CalculateChanceSetNotNull(countNotNullNumbers,columns*lines) && notNullNumbers!=0){
                    matrix.writeRecord(i,j,getRandomNumber(maxNumber));
                    notNullNumbers--;
                }else{
                    matrix.writeRecord(i,j,0);
                }
            }
        }

        return matrix;
    }

    private static boolean CalculateChanceSetNotNull(int countNotNullNumbers, int countMatrixNumbers) {
        double probability = ((double)countNotNullNumbers)/ ((double)countMatrixNumbers);
        double chance = Math.random();

        if(probability < chance){
            return true;
        } else{
            return false;
        }
    }

    private static int getRandomNumber(int maxNumber){
       int result = 0;
       do{
           result = (int)(Math.random()*(maxNumber + 1));
       }while(result == 0);
       return result;
    }
}
