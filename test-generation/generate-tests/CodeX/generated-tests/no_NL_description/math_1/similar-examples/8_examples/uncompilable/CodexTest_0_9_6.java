import org.apache.commons.math3.geometry.euclidean.oned.*;
import java.text.NumberFormat;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Point;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
    private Matrix33 [K_]x(Vector3 v) {
        return Matrix33.createRotationMatrix(Vector3.k(), FastMath.toRadians(v.getX()));
    }*/
    private Matrix33 [K_]y(Vector3 v) {
        return Matrix33.createRotationMatrix(Vector3.k(), FastMath.toRadians(v.getY()));
    }
    private Matrix33 [K_]z(Vector3 v) {
        return Matrix33.createRotationMatrix(Vector3.k(), FastMath.toRadians(v.getZ()));
    }
    public Vector3 cross(Vector3 v) {
        return new Vector3(y*v.z - z*v.y, z*v.x - x*v.z,
                           x*v.y - y*v.x);
    }
    public Matrix33 times(Matrix33 m) {
        Matrix33 ret = new Matrix33();
        Vector3 v = new Vector3(x, y, z);
}