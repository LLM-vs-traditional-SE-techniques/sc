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


public class CodexTest_0_6_59 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    ImmutableBitArray zero = ImmutableBitArray.of(0);
    ImmutableBitArray zeroPadded = ImmutableBitArray.of(0, 32);
    ImmutableBitArray one = ImmutableBitArray.of(1);
    ImmutableBitArray onePadded = ImmutableBitArray.of(1, 32);
    ImmutableBitArray max = ImmutableBitArray.of(0xffffffff);
    ImmutableBitArray maxPadded = ImmutableBitArray.of(0xffffffff, 32);
}