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


public class CodexTest_0_9_17 { 
  @Test
  public void editDistance(int s, int n, int m, int[][] d, char[] x, char[] y, long[] ops) throws Throwable {
    int[][] e = new int[n+1][m+1];
    int[] f = new int[n+1];
    int[] g = new int[m+1];
    for (int i = 0; i <= n; ++i) {
      e[i][0] = i;
    }
    for (int j = 0; j <= m; ++j) {
      e[0][j] = j;
    }
    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= m; ++j) {
        if (x[i] == y[j]) {
          e[i][j] = e[i-1][j-1];
        } else {
          e[i][j] = Math.min(e[i-1][j], e[i][j-1]);
          e[i][j] = Math.min(e[i][j], e[i-1][j-1]);
          e[i][j] = e[i][j] + 1;
        }
      }
    }
    System.arraycopy(e[n-1], 0, g, 0, m+1);
    for (int i = n; i >= 0; --i) {
      if (i == n) {
        f[i] = e[n][m];
      } else {
        int f1 = f[i+1];
        f[i] = Math.min(f1, e[i][m]);
        for (int j = m; j >= 0; --j) {
          int f0 = f1;
          f1 = f[i+1];
          if (j == m) {
            g[j] = e[i][m];
          } else {
            g[j] = Math.min(g[j+1], e[i][j]);
          }
          if (x[i] == y
}