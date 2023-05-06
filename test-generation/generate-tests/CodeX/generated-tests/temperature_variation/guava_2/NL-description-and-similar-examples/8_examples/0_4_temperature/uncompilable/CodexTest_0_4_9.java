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


public class CodexTest_0_4_9 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    int numBytesWritten = hashCode.writeBytesTo(dest, 0, 4);
    assertEquals(4, numBytesWritten);
    assertEquals(0, hashCode.writeBytesTo(dest, 0, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 1, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 2, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 3, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 4, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 5, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 6, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 7, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 8, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 9, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 10, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 11, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 12, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 13, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 14, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 15, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 16, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 17, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 18, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 19, 4));
    assertEquals(0, hashCode.writeBytesTo(dest, 20, 4));
    assertEquals(0
}