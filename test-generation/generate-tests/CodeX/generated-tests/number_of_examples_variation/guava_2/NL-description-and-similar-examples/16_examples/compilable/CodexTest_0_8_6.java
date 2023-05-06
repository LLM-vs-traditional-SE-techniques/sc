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


public class CodexTest_0_8_6 { 
  @Test
        public void testWriteBytesTo_EightBytes() {
        byte[] dest = new byte[8];
        HashCode hash1 = Hashing.sha1().hashBytes(new byte[20]);
        hash1.writeBytesTo(dest, 0, 8);
        HashCode hash2 = HashCode.fromBytes(dest);
        assertEquals(hash1, hash2);
    }
}