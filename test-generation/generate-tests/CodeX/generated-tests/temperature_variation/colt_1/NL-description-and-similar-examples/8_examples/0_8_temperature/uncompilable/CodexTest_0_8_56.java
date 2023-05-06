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


public class CodexTest_0_8_56 { 
      @Test
      public void testSetConcurrency() throws InterruptedException {
        final int poolSize = 10;
        final int n = 100;
        final ExecutorService pool = Executors.newFixedThreadPool(poolSize);
        final List<Future<Integer>> futures = Lists.newArrayList();
        for (int i = 0; i < n; i++) {
          final int x = i;
          futures.add(pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
              final ODatabaseDocumentTx db = new ODatabaseDocumentTx("memory:testSetConcurrency_" + x)
                  .create();
              try {
                OrientVertex vertex = db.newVertex("Person").setProperty("name", "foo");
                vertex.setProperty("out", Arrays.asList("foo", "bar", "baz"));
                db.save(vertex);
                Integer outSize = vertex.getProperty("out");
                return outSize;
              } finally {
                db.drop();
              }
            }
          }));
        }
        for (Future<Integer> f : futures) {
          Assert.assertEquals(f.get().intValue(), 3);
        }
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);
      }
}