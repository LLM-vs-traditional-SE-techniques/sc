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


public class CodexTest_0_9_50 { 
  @Test
    public void writeBytesTo11() {
        long[] input = {  -9223372036854775801L,    -9223372036854775802L, -9105652055984256598L, -9217928733941464437L };
        byte[] output = new byte[200000];
        byte[] expected = { (byte)0x01, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0x07, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0x09, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0x03, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF };
        LongHashFunction hashFunction = LongHashFunction.xx_r39();
        LongAsBytesConverter converter = LongAsBytesConverter.INSTANCE;
        LongsHashFunctionWithGenericConverterTest.checkConversions(converter, hashFunction, input, expected, output);
    }
}