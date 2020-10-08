package com.vulfcorp.impl;

import com.vulfcorp.interfaces.IVector;

import java.util.HashMap;
import java.util.Map;

public class SpareVector implements IVector {

    private Map<Integer,Integer> vector;
    private int size;

    public SpareVector(int size) {
        if(size > 0) {
            this.size=size;
            vector = new HashMap<>();
        } else {
            throw new IllegalArgumentException("size should be >0 => size="+size);
        }
    }

    @Override
    public void writeRecord(int position, int number) {
        if(0 <= position && position < size){
            vector.put(position,number);
        } else {
            throw new IllegalArgumentException("position should be [0,"+
                    (size-1)+"]. position="+position);
        }
    }

    @Override
    public int readRecord(int position) {
        if(0 <= position && position < size){
            return vector.get(position);
        } else {
            throw new IllegalArgumentException("position should be [0,"+
                    (size-1)+"]. position="+position);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder("{");
        for(int i = 0; i < size; i++) {
            if (vector.containsKey(i))
                builder.append(" " + vector.get(i) + " ");
            else
                builder.append(" 0 ");
        }
        builder.append("}");
        return builder.toString();
    }
}
