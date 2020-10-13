package com.vulfcorp.impl;

import com.vulfcorp.abstracts.AbstractMatrix;
import com.vulfcorp.interfaces.IVector;

public class SpareMatrix extends AbstractMatrix {
    public SpareMatrix(int lineCount, int columnCount) {
        BuildMatrix(lineCount, columnCount);
    }

    @Override
    protected IVector CreateVector(int size){
        return new SpareVector(size);

    }
}
