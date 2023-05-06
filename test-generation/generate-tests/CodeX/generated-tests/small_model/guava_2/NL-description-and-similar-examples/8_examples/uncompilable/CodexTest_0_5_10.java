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


public class CodexTest_0_5_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[] {0, 0, 0, 0};
    BitVector v = new BitVector(bits());
    v.writeBytesTo(bytes, 0, bits() / 8);
    assertEquals(0, bytes[0]);
    v.writeBytesTo(bytes, 0, bits() / 4);
    assertEquals(0, bytes[0]);
    v.writeBytesTo(bytes, 0, bits() / 2);
    assertEquals(0, bytes[0]);
    v.writeBytesTo(bytes, 0, bits());
    assertEquals(0, bytes[0]);
  }
}