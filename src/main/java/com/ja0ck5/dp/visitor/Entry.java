package com.ja0ck5.dp.visitor;

import com.ja0ck5.dp.composite.FileTreatmentException;

import java.util.Iterator;

/**
 *
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {// add 方法仅对 Directory 有效 所以暂时简单的报错
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {// iterator 方法仅对 Directory 有效 所以暂时简单的报错
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
