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


public class CodexTest_0_5_6 { 
  @Test
  public static void testWriteBytesTo() {
    byte[] bytes = new byte[3];
    AlgVector v = new AlgVector(2);
    v.set(0, 2.3);
    v.set(1, 1.2);
    int length = v.writeBytesTo(bytes, 0, bytes.length);
    assertEquals(2, length);
    assertEquals(2.3, ByteBuffer.wrap(bytes).getDouble(), 0.0);
    assertEquals(1.2, ByteBuffer.wrap(bytes).getDouble(), 0.0);
  }
}