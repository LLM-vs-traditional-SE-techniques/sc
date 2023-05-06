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


public class CodexTest_0_5_8 { 
  @Test
  public void testWriteBytesTo_firstByte() {
    byte[] dest = new byte[1];
    BitArray array = new BitArray(0);
    int bytesWritten = array.writeBytesTo(dest, 0, 1);
    assertEquals(0, bytesWritten);
    assertEquals(0, dest[0]);
  }
  public void testWriteBytesTo_secondByte() {
    byte[] dest = new byte[2];
    BitArray array = new BitArray(8);
    array.set(0);
    int bytesWritten = array.writeBytesTo(dest, 0, 2);
    assertEquals(1, bytesWritten);
    assertEquals(1, dest[0]);
    assertEquals(0, dest[1]);
  }
}