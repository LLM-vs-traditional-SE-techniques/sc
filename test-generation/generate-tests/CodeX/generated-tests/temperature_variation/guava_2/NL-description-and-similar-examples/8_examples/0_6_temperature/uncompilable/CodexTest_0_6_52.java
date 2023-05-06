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


public class CodexTest_0_6_52 { 
  @Test
     public void testWriteBytesTo() {
        byte[] result = new byte[10];
        int writtenCount = base64().decode(BASE64_STRING).writeBytesTo(result, 0, 8);
        assertEquals(8, writtenCount);
        assertEquals(47, result[0]);
        assertEquals(48, result[1]);
        assertEquals(49, result[2]);
        assertEquals(50, result[3]);
        assertEquals(51, result[4]);
        assertEquals(52, result[5]);
        assertEquals(53, result[6]);
        assertEquals(54, result[7]);
        assertEquals(0, result[8]);
        assertEquals(0, result[9]);
    }
}