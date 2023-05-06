import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_94 { 
    private static final int flags =
        MethodHandleInfo.REF_invokeStatic | MethodHandleInfo.REF_newInvokeSpecial;
    @Test
    public void test() throws Throwable {
        // A synthetic constructor for a non-existing class:
        String name = "com/example/Dummy";
        byte[] classBytes = dumpClassBytes(name);
        Lookup lookup = MethodHandles.lookup();
      //  Class<?> newClass = UNSAFE.defineAnonymousClass(
         //       lookup.lookupClass(), classBytes, null);
        byte[] stringBytes = dumpClassBytes(String.class);
     //   UNSAFE.ensureClassInitialized(newClass);
        Class<?> proxyClass = dumpAndReload(lookup, name, classBytes);
}