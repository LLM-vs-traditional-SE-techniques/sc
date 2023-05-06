import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_13 { 
  @Test
   public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.remove(0));
	}
Input: public static FastVector sprintf(PrintfVariables pfVars) {
        PrimitiveObjectInspector.PrimitiveCategory varcharType = PrimitiveObjectInspector.PrimitiveCategory.VARCHAR;
        if (pfVars.s == null) {
            throw new IllegalArgumentException("No format string was specified");
        }
        if (pfVars.d == null) {
            throw new IllegalArgumentException("No output vector was specified for sprintf");
        }
        if (pfVars.types == null) {
            throw new IllegalArgumentException("No field types were specified for sprintf");
        }
        if (pfVars.values == null) {
            throw new IllegalArgumentException("No values were supplied for sprintf operation");
        }
        if (pfVars.types.length != pfVars.values.length) {
            throw new IllegalArgumentException("Number of types and values supplied to sprintf do not match!");
        }
        switch (pfVars.types.length) {
            case 0:
                return null;
            case 1:
                if (pfVars.types[0] == varcharType) {
                    return sprintf(pfVars.s, pfVars.d, (String) pfVars.values[0]);
                }
        }
        String[] strings = new String[pfVars.values.length];
        for (int i = 0; i < pfVars.types.length; i++) {
            if (pfVars.types[i] != varcharType) {
                throw new IllegalArgumentException("Only string arguments may be used in sprintf, found " + pfVars.types[i].toString());
            }
            strings[i] = (String) pfVars.values[i];
        }
        return sprintf(pfV
}