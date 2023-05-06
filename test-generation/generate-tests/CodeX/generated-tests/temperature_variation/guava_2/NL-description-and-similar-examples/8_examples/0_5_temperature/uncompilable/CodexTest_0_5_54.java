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


public class CodexTest_0_5_54 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[6];
    byte[] src = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    int offset = 0;
    int maxLength = 6;
    ByteString byteString = ByteString.copyFrom(src);
    byteString.writeBytesToImpl(dest, offset, maxLength);
    assertEquals(0, dest[0]);
    assertEquals(1, dest[1]);
    assertEquals(2, dest[2]);
    assertEquals(3, dest[3]);
    assertEquals(4, dest[4]);
    assertEquals(5, dest[5]);
  }
}