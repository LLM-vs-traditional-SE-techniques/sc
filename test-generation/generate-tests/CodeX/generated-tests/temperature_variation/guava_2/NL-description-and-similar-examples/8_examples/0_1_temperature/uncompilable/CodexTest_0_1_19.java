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


public class CodexTest_0_1_19 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    int offset = 1;
    int maxLength = 3;
    int length = bits() / 8;
    length = Math.min(length, maxLength);
    int end = offset + length;
    for (int i = offset; i < end; i++) {
      dest[i] = (byte) (i - offset);
    }
    writeBytesTo(dest, offset, maxLength);
    for (int i = offset; i < end; i++) {
      assertEquals(i - offset, dest[i]);
    }
  }
}