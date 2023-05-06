import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_16 { 
  @Test
  public void writeBytesToImpl() {
    ByteBuffer bb = ByteBuffer.allocate(8);
    double d1 = 1.0000001d;
    bb.putDouble(d1);
    byte[] b1 = bb.array();
    ByteBuffer bb2 = ByteBuffer.allocate(8);
    double d2 = Double.longBitsToDouble(Double.doubleToRawLongBits(d1));
    bb2.putDouble(d2);
    byte[] b2 = bb2.array();
    ByteBuffer bb3 = ByteBuffer.allocate(8);
    double d3 = Double.longBitsToDouble(Double.doubleToRawLongBits(d1) + Double.MIN_VALUE);
    bb3.putDouble(d3);
    byte[] b3 = bb3.array();
    assertFalse(Arrays.equals(b1, b2));
    assertFalse(Arrays.equals(b2, b3));
    assertTrue(Arrays.equals(b1, b3));
    assertFalse(Arrays.equals(b1, b3)+""+d1+" "+Long.toBinaryString(Double.doubleToRawLongBits(d1)
    + Double.MIN_VALUE));
    assertTrue(Arrays.equals(b1, b3) + ""+d1+" "+Long.toBinaryString(Double.doubleToRawLongBits(d1))
    + " "+Long.toBinaryString(Double.doubleToRawLongBits(d3)));
}