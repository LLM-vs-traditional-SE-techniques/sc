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


public class CodexTest_0_8_35 { 
  @Test
    public void testReadLong_fewerThan8Bytes() {
        byte[] bytes = new byte[]{1, 2, 3};
        InputStream in = new ByteArrayInputStream(bytes);
        try {
            int result = ByteStreams.read(in, new byte[4], 0, 4);
            assertEquals(3, result);
            assertArrayEquals(new byte[]{1, 2, 3, 0}, bytes);
        } catch (IOException e) {
            fail();
        }
    }
}