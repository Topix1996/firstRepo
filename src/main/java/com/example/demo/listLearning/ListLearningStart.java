package com.example.demo.listLearning;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ListLearningStart {

    private ArrayList arrayList;

    public ListLearningStart(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

//    public ArrayList getArrayList() {
//        return arrayList;
//    }
//
//    public void setArrayList(ArrayList arrayList) {
//        this.arrayList = arrayList;
//    }
}
