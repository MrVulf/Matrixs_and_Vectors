package com.vulfcorp.interfaces;

public interface IMatrix {
    void writeRecord (int line, int column, int number);
    int readRecord (int line, int column);
    int getLineCount();
    int getColumnCount();
}
