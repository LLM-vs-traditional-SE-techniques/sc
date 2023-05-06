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


public class CodexTest_0_8_88 { 
  @Test
  public void testWriteBytesTo_maxLengthExceedsNumBits() {
    byte[] dest = new byte[3];
    assertEquals(2, uut.writeBytesTo(dest, 0, 4));
    assertArrayEquals(Bytes.concat(new byte[] {0, (byte) 0x3F}, new byte[1]), dest);
  }
}