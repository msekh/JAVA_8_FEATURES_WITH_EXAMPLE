package com.mahadi.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.mahadi.myinterface.MyInterface;

public class MyClass extends Object implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer max=Collections.max(intList);
		return max;
	}

}
