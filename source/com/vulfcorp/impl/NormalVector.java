package com.vulfcorp.impl;

import com.vulfcorp.abstracts.AbstractIVector;

public class NormalVector extends AbstractIVector {
    public NormalVector(int size){
        if(size > 0) {
            vector = new int[size];
            for (int i = 0; i < size; i++)
                vector[i] = (int) (Math.random() * 100);
        } else {
            throw new IllegalArgumentException("size should be >0 => size="+size);
        }
    }
}
