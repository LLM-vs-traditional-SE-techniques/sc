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


public class CodexTest_0_6_81 { 
  @Test
  public void testWriteBytesToWithMaxLength() {
    byte[] dest = new byte[10];
    byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    BitArray bitArray = BitArray.fromBytes(bytes);
    int length = bitArray.writeBytesTo(dest, 0, 5);
    assertEquals(5, length);
    assertEquals(1, dest[0]);
    assertEquals(2, dest[1]);
    assertEquals(3, dest[2]);
    assertEquals(4, dest[3]);
    assertEquals(5, dest[4]);
  }
}