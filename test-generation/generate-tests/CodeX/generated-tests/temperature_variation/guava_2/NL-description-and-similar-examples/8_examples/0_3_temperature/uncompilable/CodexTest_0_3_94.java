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


public class CodexTest_0_3_94 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 3;
    int maxLength = 4;
    int bits = bits();
    int bytes = bits / 8;
    int minLength = Math.min(maxLength, bytes);
    int length = minLength;
    int expectedLength = length;
    int expectedOffset = offset + length;
    int expectedBits = bits - length * 8;
    int expectedBytes = expectedBits / 8;
    int expectedRemainder = expectedBits - expectedBytes * 8;
    int expectedHashCode = hashCode();
}