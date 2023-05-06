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


public class CodexTest_0_7_33 { 
  @Test
  public void testWriteBytesTo_bitLength_maxLength_startOffset_endOffset() {
    byte[] value = new byte[6];
    value[0] = (byte) 0x07;
    value[1] = (byte) 0xFF;
    value[2] = (byte) 0xFF;
    value[3] = (byte) 0xFF;
    value[4] = (byte) 0xFF;
    value[5] = (byte) 0xFF;
}