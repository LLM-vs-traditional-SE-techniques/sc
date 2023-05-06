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


public class CodexTest_0_7_27 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[7];
    int maxLength = 5;
    BitSet bs = new BitSet(16);
    bs.set(0);
    bs.set(3);
    bs.set(4);
    bs.set(5);
    bs.set(6);
    bs.set(9);
    bs.set(10);
    Preconditions.checkArgument(maxLength == 5);
    int len = bs.writeBytesTo(dest, 0, maxLength);
    byte[] expected = {(byte) 0x7F, (byte) 0xF8, (byte) 0x00, (byte) 0x00, (byte) 0x00};
    Assert.assertEquals(Arrays.toString(expected), Arrays.toString(dest));
    Assert.assertEquals(5, len);
  }
}