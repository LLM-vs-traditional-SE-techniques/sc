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


public class CodexTest_0_7_75 { 
  @Test
    public void testWriteBytesTo() {
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BitSet bitSet = BitSet.valueOf(bytes);
        byte[] dest = new byte[10];
        int writeLength = bitSet.writeBytesTo(dest, 0, 9);
        assertEquals(9, writeLength);
        assertEquals(Arrays.toString(bytes), Arrays.toString(dest));
    }
}