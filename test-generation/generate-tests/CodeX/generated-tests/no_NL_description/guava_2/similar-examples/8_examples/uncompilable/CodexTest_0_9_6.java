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


public class CodexTest_0_9_6 { 
  @Test
  public static long writeLittleEndian64(final byte[] byteArray, final int offset, final long value) {
    byteArray[offset + 0] = (byte) (0xFF & value >> 0);
    byteArray[offset + 1] = (byte) (0xFF & value >> 8);
    byteArray[offset + 2] = (byte) (0xFF & value >> 16);
    byteArray[offset + 3] = (byte) (0xFF & value >> 24);
    byteArray[offset + 4] = (byte) (0xFF & value >> 32);
    byteArray[offset + 5] = (byte) (0xFF & value >> 40);
    byteArray[offset + 6] = (byte) (0xFF & value >> 48);
    byteArray[offset + 7] = (byte) (0xFF & value >> 56);
    return value;
}