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


public class CodexTest_0_3_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    int maxLength = 3;
    int offset = 0;
    int actualLength = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(actualLength, maxLength);
    assertEquals(dest[0], (byte) 0x12);
    assertEquals(dest[1], (byte) 0x34);
    assertEquals(dest[2], (byte) 0x56);
  }
}