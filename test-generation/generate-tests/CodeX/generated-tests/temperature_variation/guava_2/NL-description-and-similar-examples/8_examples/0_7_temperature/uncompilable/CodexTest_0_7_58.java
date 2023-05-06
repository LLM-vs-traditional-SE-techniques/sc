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


public class CodexTest_0_7_58 { 
  @Test
    public void testWriteBytesTo() {
        ByteBuffer bb = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        bb.put((byte) 0).put((byte) 0).put((byte) 0).put((byte) 0);
        bb.flip();
        bb.putInt(0, 42);
        byte[] bytes = bb.array();
        BitVector bv = BitVector.fromBytes(bytes);
        byte[] output = new byte[4];
        bv.writeBytesTo(output, 0, 4);
        assertTrue(Arrays.equals(bytes, output));
    }
}