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


public class CodexTest_0_6_72 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[5];
    int offset = 1;
    int length = 3;
    HashFunction hf = Hashing.goodFastHash(length * 8);
    HashCode hc = hf.newHasher().putLong(0x1234567890ABCDEFL).hash();
    hc.writeBytesToImpl(dest, offset, length);
    assertEquals(0, dest[0]);
    assertEquals(0x12, dest[1] & 0xFF);
    assertEquals(0x34, dest[2] & 0xFF);
    assertEquals(0x56, dest[3] & 0xFF);
    assertEquals(0, dest[4]);
  }
}