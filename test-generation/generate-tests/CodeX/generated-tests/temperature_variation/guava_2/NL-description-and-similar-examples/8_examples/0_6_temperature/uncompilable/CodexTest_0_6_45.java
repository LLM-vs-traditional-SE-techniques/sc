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


public class CodexTest_0_6_45 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[2];
    dest[0] = (byte) 0xFF;
    dest[1] = (byte) 0xFF;
    int offset = 1;
    int maxLength = 1;
    int actual = Ints.min(maxLength, 40 / 8);
    Preconditions.checkPositionIndexes(offset, offset + maxLength, dest.length);
    writeBytesToImpl(dest, offset, maxLength);
    assertEquals(dest[0], (byte) 0xFF);
    assertEquals(dest[1], (byte) 0xFF);
    assertEquals(actual, 1);
  }
}