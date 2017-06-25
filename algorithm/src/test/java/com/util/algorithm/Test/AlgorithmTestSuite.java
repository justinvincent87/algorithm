package com.util.algorithm.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.util.algorithm.arrays.FindMissingNumberTest;
import com.util.algorithm.util.AlgorithmUtilsTest;

@RunWith(Suite.class)
@SuiteClasses({
	AlgorithmUtilsTest.class,
	FindMissingNumberTest.class
})
public class AlgorithmTestSuite {
}
