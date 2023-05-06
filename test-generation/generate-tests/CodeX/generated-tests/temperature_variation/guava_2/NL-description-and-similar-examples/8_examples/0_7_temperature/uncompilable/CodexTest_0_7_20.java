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


public class CodexTest_0_7_20 { 
  @Test
  public void testWriteBytesToWithMaxLength() {
    byte[] bytes = {(byte) 0x80, 0x01, 0x7f, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
    assertEquals(4, BitArray.fromBytes(bytes).writeBytesTo(new byte[8], 0, 4));
  }

}