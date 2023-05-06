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


public class CodexTest_0_6_56 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    BitSet bitset = new BitSet();
    bitset.or(BitSet.valueOf(new byte[]{(byte) 0xaa, (byte) 0x5a, (byte) 0x03}));
    bitset.writeBytesTo(dest, 0, 5);
    assertEquals(bitset.toByteArray(), dest);
  }
}