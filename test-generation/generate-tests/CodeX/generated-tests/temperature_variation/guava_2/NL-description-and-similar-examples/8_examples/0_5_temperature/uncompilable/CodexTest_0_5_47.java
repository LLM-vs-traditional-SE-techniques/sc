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


public class CodexTest_0_5_47 { 
  @Test
    public void testWriteBytesTo() {
        byte[] bytes = new byte[] {
            0x12, 0x34, 0x56, 0x78, 0x9A, 0xBC, 0xDE, 0xF0,
            0x34, 0x56, 0x78, 0x9A, 0xBC, 0xDE, 0xF0, 0x12,
            0x56, 0x78, 0x9A, 0xBC, 0xDE, 0xF0, 0x12, 0x34,
            0x78, 0x9A, 0xBC, 0xDE, 0xF0, 0x12, 0x34, 0x56,
            0x9A, 0xBC, 0xDE, 0xF0, 0x12, 0x34, 0x56, 0x78,
        };
        byte[] dest = new byte[bytes.length + 1];
        for (int i = 0; i < bytes.length; i++) {
            dest[i] = 0x42;
            dest[i + 1] = 0x42;
            assertEquals(i + 1, new BitArray(bytes).writeBytesTo(dest, 0, i + 1));
            for (int j = 0; j < i + 1; j++) {
                assertEquals(bytes[j], dest[j]);
                assertEquals(0x42, dest[j + 1]);
            }
        }
    }
}