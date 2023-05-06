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


public class CodexTest_0_5_61 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[LENGTH];
    Arrays.fill(dest, (byte) 0xFF);
    ByteBuffer buffer = ByteBuffer.wrap(dest);
    buffer.putInt(0, 0x01234567);
    buffer.putInt(4, 0x89ABCDEF);
    buffer.putInt(8, 0xFEDCBA98);
    buffer.putInt(12, 0x76543210);
    buffer.putInt(16, 0xFEDCBA98);
    buffer.putInt(20, 0xFEDCBA98);
    buffer.putInt(24, 0xFEDCBA98);
    buffer.putInt(28, 0xFEDCBA98);
    buffer.putInt(32, 0xFEDCBA98);
    buffer.putInt(36, 0xFEDCBA98);
    buffer.putInt(40, 0xFEDCBA98);
    buffer.putInt(44, 0xFEDCBA98);
    buffer.putInt(48, 0xFEDCBA98);
    buffer.putInt(52, 0xFEDCBA98);
    buffer.putInt(56, 0xFEDCBA98);
    buffer.putInt(60, 0xFEDCBA98);
}