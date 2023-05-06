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


public class CodexTest_0_7_1 { 
  @Test
  public void testWriteBytesTo() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    ByteBuffer b = ByteBuffer.allocate(16);
    b.putInt(v.bits());
    b.putInt(v.numElements());
    v.writeBytesTo(b.array(), 4, 12);
    b.rewind();
    assertEquals("Number of elements differs", data.length, b.getInt(0));
    assertEquals("Bits different", v.bits(), b.getInt(4));
    checkData(data, b.array(), 8);
  }
}