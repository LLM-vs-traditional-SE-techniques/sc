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


public class CodexTest_0_6_69 { 
  @Test
  public void testWriteBytesTo() {
    byte[] data = {(byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef,
        (byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef};
    int bits = data.length * 8;
    BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), bits, 0.03);
    filter.put(1);
    filter.put(2);
    filter.put(3);
    filter.put(Integer.MAX_VALUE);
    filter.put(Integer.MIN_VALUE);
    filter.put(0);
}