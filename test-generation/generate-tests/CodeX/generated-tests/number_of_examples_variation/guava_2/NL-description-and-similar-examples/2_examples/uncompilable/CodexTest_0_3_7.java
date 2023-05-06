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


public class CodexTest_0_3_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 5;
    int maxLength = 4;
    BitArray ba = new BitArray(new boolean[] {true, true, true, true, true, false, false, false, false, false});
    int written = ba.writeBytesTo(dest, offset, maxLength);
    assertEquals(4, written);
    assertEquals(new byte[] {0, 0, 0, 0, 0, -1, -1, -1, -1, 0}, dest);
  }
}