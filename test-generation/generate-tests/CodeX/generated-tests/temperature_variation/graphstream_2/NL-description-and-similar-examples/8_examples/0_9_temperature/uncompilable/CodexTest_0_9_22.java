import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_22 { 
    @Test
    public void testEquals() {
        final double[] data = { 1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d, 9d, 10d };
        final double[][] arrMatrix = {
                                       { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                                       { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }, };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
        DoubleMatrix2D matrix = f.make(arrMatrix);
        DoubleMatrix1D res = vector.like(matrix.rows());
        matrix.zMult(vector, res);
        Vector myVector = new Vector(10);
        Assert.assertFalse(myVector.equals(res));
        }
}