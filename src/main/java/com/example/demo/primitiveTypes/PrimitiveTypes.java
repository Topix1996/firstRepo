package com.example.demo.primitiveTypes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class PrimitiveTypes {

    byte byteValue = 10;
    short shortValue = 10;
    int intValue = 10;

    public Long calcTotal() {
        return (long) (byteValue + shortValue + intValue);
    }
}
