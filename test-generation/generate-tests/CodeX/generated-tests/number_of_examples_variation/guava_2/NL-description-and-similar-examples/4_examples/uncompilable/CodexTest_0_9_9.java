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


public class CodexTest_0_9_9 { 
  @Test
  public void testEncode_argsOutOfOrder() throws Exception {
    byte[] fec = new byte[] {(byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe, 0x00, 0x0d, 0x77, 0x68,
        0x61, 0x74, 0x20, 0x65, 0x76, 0x65, 0x72, 0x20, 0x73, 0x68, 0x61, 0x6c, 0x6c, 0x20, 0x64, 0x6f};
    byte[] dest = new byte[4 * fec.length];
    int encoded = ciphertext.writeBytesTo(dest, 3 * fec.length, 4 * fec.length);
    assertEquals(ciphertext.writeBytesTo(dest, 3 * fec.length, 4 * fec.length),
        ciphertext.writeBytesTo(dest, 3 * fec.length, 4 * fec.length));
  }
"""
}