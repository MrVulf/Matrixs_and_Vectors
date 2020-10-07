package com.vulfcorp.impl;

import com.vulfcorp.abstracts.AbstractMatrix;
import com.vulfcorp.interfaces.IVector;

public class SpareMatrix extends AbstractMatrix {
    public SpareMatrix(int lineCount, int columnCount) {
        if(lineCount <= 0 ||columnCount <= 0) {
            this.matrix = new IVector[lineCount];
            for (int i = 0; i < lineCount; i++) {
                matrix[i] = new SpareVector(columnCount);
            }
        } else {
            throw new IllegalArgumentException("lineCount and columnCount should be positive" +
                    " || current: " + lineCount + " " + columnCount);
        }
    }
}
