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


public class CodexTest_0_5_1 { 
  @Test
  public void testGetBytes() {
    byte[] bytes = new byte[1];
    BitSet bitSet = new BitSet(8);
    bitSet.set(1);
    bitSet.set(3);
    bitSet.set(5);
    bitSet.set(7);
    bitSet.writeBytesTo(bytes, 0, 1);
    assertEquals(Integer.parseInt("10101010", 2), Byte.toUnsignedInt(bytes[0]));
  }
}