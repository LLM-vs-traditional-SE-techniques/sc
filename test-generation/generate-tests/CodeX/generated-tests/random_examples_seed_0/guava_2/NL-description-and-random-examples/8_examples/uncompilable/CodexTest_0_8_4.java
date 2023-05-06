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


public class CodexTest_0_8_4 { 
  @Test
    public void testWriteBytesTo() {
        byte[] dest = new byte[10];
        int maxLength = 2;
        int offset = 4;
        byte[] bytes = new byte[] {127, -1, 16, 0};
        BigInteger intValue = new BigInteger(bytes);
        MutableBitArray bitArray = MutableBitArray.createFromBigEndianByteArray(bytes);
        MutableBitArray big = MutableBitArray.create(bitArray.bits());
        big.writeBytesTo(dest, offset, maxLength);
        int length = maxLength + offset;
        assertTrue(dest[offset] == bytes[0]);
        assertTrue(dest[length - 1] == bytes[maxLength - 1]);
    }
}