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


public class CodexTest_0_9_1 { 
    @Test
    public void test_assign_nodeElemConstructor() {
        AlgElement root = new Element("root", new ArrayList());
        Element a1 = new Element("a1");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        root.add(a1);
        root.add(c1);
        c1.add(c2);
        AlgElement d1 = new Element("d1");
        AlgElement d2 = new Element("d2");
        AlgElement e1 = new Element("e1");
        d2.add(e1);
        AlgElement f1 = new Element("f1");
        e1.add(f1);
        AlgElement f2 = new Element("f2");
        AlgElement g1 = new Element("g1");
        g1.add(f2
}