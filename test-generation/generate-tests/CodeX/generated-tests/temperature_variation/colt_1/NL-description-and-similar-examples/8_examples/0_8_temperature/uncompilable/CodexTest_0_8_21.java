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


public class CodexTest_0_8_21 { 
  @Test
    public String testSetQuick() {
        Map map = new HashMap();
        map.put(a, A);
        map.put(b, B);
        map.put(c, C);
        map.put(d, D);
        map.put(e, E);
        map.put(f, F);
        map.put(g, G);
        map.put(h, H);
        map.put(i, I);
        map.put(j, J);
        map.put(k, K);
        map.put(l, L);
        map.put(m, M);
        map.put(n, N);
        map.put(o, O);
        map.put(p, P);
        map.put(q, Q);
        map.put(r, R);
        map.put(s, S);
        map.put(t, T);
        map.put(u, U);
        map.put(v, V);
        map.put(w, W);
        map.put(x, X);
        map.put(y, Y);
        map.put(z, Z);
        Map flat3 = new Flat3Map(map);
        flat3.setQuick(a, A);
        flat3.setQuick(b, B);
        flat3.setQuick(c, C);
        flat3.setQuick(d, D);
        flat3.setQuick(e, E);
        flat3.setQuick(f, F);
        flat3.setQuick(g, G);
        flat3.setQuick(h, H);
        flat3.setQuick(i, I);
        flat3.setQuick(j, J);
        flat3.setQuick(k, K);
        flat3.setQuick(l, L);
        flat3.setQuick(m, M);
        flat3.setQuick(n, N);
       
}