package com.vulfcorp.abstracts;

import com.vulfcorp.interfaces.IVector;

public abstract class AbstractIVector implements IVector {
    protected int[] vector;

    @Override
    public void writeRecord(int position, int number) {
        if(0 <= position && position < vector.length){
            vector[position]=number;
        } else {
            throw new IllegalArgumentException("position should be [0,"+
                    (vector.length-1)+"]. position="+position);
        }
    }

    @Override
    public int readRecord(int position) {
        if(0 <= position && position < vector.length){
            return vector[position];
        } else {
            throw new IllegalArgumentException("position should be [0,"+
                    (vector.length-1)+"]. position="+position);
        }
    }

    @Override
    public int getSize() {
        return vector.length;
    }
}
