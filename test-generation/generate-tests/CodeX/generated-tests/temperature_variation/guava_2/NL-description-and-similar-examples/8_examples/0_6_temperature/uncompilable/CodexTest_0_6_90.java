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


public class CodexTest_0_6_90 { 
  @Test
  public void testCheckLength() {
    byte[] dest = new byte[10];
    int offset = 0;
    int maxLength = 10;
    BitArray b = new BitArray(new byte[]{1, 2, 3}, 0);
    b.writeBytesTo(dest, offset, maxLength);
    assertArrayEquals(new byte[]{1, 2, 3, 0, 0, 0, 0, 0, 0, 0}, dest);
  }
}