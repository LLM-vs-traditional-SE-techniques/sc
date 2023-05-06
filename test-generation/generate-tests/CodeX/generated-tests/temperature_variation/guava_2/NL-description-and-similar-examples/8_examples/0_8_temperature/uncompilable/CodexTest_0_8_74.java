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


public class CodexTest_0_8_74 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] b1 = new byte[] {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    byte[] b2 = new byte[] {(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};
    byte[] b3 = new byte[] {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    ImmutableBitArray a1 = ImmutableBitArray.of(true, false, false, false, false, true, true, true, true, false, false, true, true, false, false, true, false, true, false, true, false, true, false, false, false, true, true, true, false, false, false, true, true, false, true, false, true, false);
    ImmutableBitArray a2 = ImmutableBitArray.of(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    ImmutableBitArray a3 = ImmutableBitArray.of(false, true, true, true, true, false, false, true, true, false, false, true, false, true, false, true, false, true, false, false, false, true, true, true, false, false, false, true, true, false, true, false, true, false, true, true, true, true, false);
    a1.writeBytesToImpl(b1, 0, 5);
    a2.writeBytesToImpl(b2, 0, 5);
    a3.writeBytesToImpl(b3, 0, 5);
    assertEquals((byte) 0x78, b1[3]);
    assertEquals((
}