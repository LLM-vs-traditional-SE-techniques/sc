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


public class CodexTest_0_5_86 { 
  @Test
    public void testWriteBytesTo() {
    int numBytes = 10;
    byte[] dest = new byte[numBytes];
    int written = bitArray.writeBytesTo(dest, 0, numBytes);
    assertEquals(numBytes, written);
    assertEquals(numBytes, dest.length);
    assertEquals(numBytes, bitArray.length() / 8);
    assertEquals(numBytes, bitArray.writeBytesTo(dest, 0, numBytes + 1));
  }
}