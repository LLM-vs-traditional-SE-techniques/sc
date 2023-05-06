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


public class CodexTest_0_2_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[5];
    BitSet bitSet = new BitSet(64);
    bitSet.set(0, 64);
    assertEquals(5, bitSet.writeBytesTo(bytes, 0, 5));
    assertEquals(0xFF, bytes[0]);
    assertEquals(0xFF, bytes[1]);
    assertEquals(0xFF, bytes[2]);
    assertEquals(0xFF, bytes[3]);
    assertEquals(0xFF, bytes[4]);
  }
}