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


public class CodexTest_0_9_48 { 
  @Test
     public void testPutTwoBytes() {
    byte[] b = {(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
    BitVector bv = new BitVector(13);
    bv.putFromTo(1, 3, b, 1, 3);
    assertEquals(13, bv.size());
    assertEquals(b[1], bv.getByte(1));
    assertEquals(b[2], bv.getByte(2));
    assertEquals(b[3], bv.getByte(3));
  }
}