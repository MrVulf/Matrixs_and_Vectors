package com.vulfcorp.impl;

import com.vulfcorp.abstracts.AbstractMatrix;
import com.vulfcorp.interfaces.IVector;

public class NormalMatrix extends AbstractMatrix {
    public NormalMatrix(int lineCount, int columnCount) {
        BuildMatrix(lineCount, columnCount);
    }


    @Override
    protected IVector CreateVector(int size){
        return new NormalVector(size);
    }
}
