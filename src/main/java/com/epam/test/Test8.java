package com.epam.test;

import java.util.ArrayList;
import java.util.List;

public class Test8<T> {

    public T mark;
    public Test8(T value){
        mark = value;
    }
    public boolean sameAny (Test8<?> ob){
        return false;
    }

    public boolean same (Test8<T> obj){
        return false;
    }

    List<? extends Doctor> list1 = new ArrayList<HeadDoctor>();

//    list1.add(new HeadDoctor);
}
class MedicalStuff{}

class Doctor extends MedicalStuff{}

class HeadDoctor extends Doctor{}

class Nurse extends MedicalStuff{}