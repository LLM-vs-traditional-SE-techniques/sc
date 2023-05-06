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


public class CodexTest_0_6_2 { 
  @Test
    public void testWriteBytesTo() {
        byte[] bytes = new byte[5];
        HashCode hash = Hashing.sha1().hashLong(1L);
        int writtenBytes = hash.writeBytesTo(bytes, 1, 4);
        assertEquals(4, writtenBytes);
        assertEquals(0, bytes[0]);
        for (int i = 1; i < 5; i++) {
            assertEquals(hash.asBytes()[i - 1], bytes[i]);
        }
        bytes = new byte[4];
        hash = Hashing.sha1().hashLong(1L);
        writtenBytes = hash.writeBytesTo(bytes, 0, 4);
        assertEquals(4, writtenBytes);
        for (int i = 0; i < 4; i++) {
            assertEquals(hash.asBytes()[i], bytes[i]);
        }
    }
}