package com.vulfcorp.impl;

import com.vulfcorp.abstracts.AbstractIVector;

public class SpareVector extends AbstractIVector {
    public SpareVector(int size) {
        if(size > 0) {
            vector = new int[size];
            /*
            for (int i = 0; i < size; i++) {
                int chance = (int) (Math.random() * 10) + 2;
                if (chance >=5){
                    vector[i] = (int) (Math.random() * 100);
                } else{
                    vector[i] = 0;
                }
            }
            */
        } else {
            throw new IllegalArgumentException("size should be >0 => size="+size);
        }
    }
}
