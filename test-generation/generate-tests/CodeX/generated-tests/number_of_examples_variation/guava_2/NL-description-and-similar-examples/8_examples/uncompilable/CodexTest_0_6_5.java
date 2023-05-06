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


public class CodexTest_0_6_5 { 
  @Test
  public void testWriteBytesTo() {
    byte[] array = new byte[10];
    BitArray bitArray = new BitArray(64);
    bitArray.set(1);
    bitArray.set(3);
    bitArray.set(5);
    bitArray.set(7);
    bitArray.set(63);
    // bitArray should look like this now: 00000101 00000101 00000101 00000101 00000101 00000101 00000101 00000101
    //                                     ^                                                                ^
    //                                     |                                                                |
    //                                     1                                                                63
    int length = bitArray.writeBytesTo(array, 0, 5);
    assertEquals(5, length);
    assertEquals(5, array[0]);
    assertEquals(10, array[1]);
    assertEquals(20, array[2]);
    assertEquals(40, array[3]);
    assertEquals(80, array[4]);
    assertEquals(0, array[5]);
    assertEquals(0, array[6]);
    assertEquals(0, array[7]);
    assertEquals(0, array[8]);
    assertEquals(0, array[9]);
  }
}