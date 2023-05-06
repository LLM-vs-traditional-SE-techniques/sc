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


public class CodexTest_0_3_91 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 0;
    int maxLength = 8;
    BitArray bitArray = BitArray.create();
    bitArray.set(0, true);
    bitArray.set(1, false);
    bitArray.set(2, true);
    bitArray.set(3, false);
    bitArray.set(4, true);
    bitArray.set(5, false);
    bitArray.set(6, true);
    bitArray.set(7, false);
    bitArray.set(8, true);
    bitArray.set(9, false);
    bitArray.set(10, true);
    bitArray.set(11, false);
    bitArray.set(12, true);
    bitArray.set(13, false);
    bitArray.set(14, true);
    bitArray.set(15, false);
    bitArray.set(16, true);
    bitArray.set(17, false);
    bitArray.set(18, true);
    bitArray.set(19, false);
    bitArray.set(20, true);
    bitArray.set(21, false);
    bitArray.set(22, true);
    bitArray.set(23, false);
    bitArray.set(24, true);
    bitArray.set(25, false);
    bitArray.set(26, true);
    bitArray.set(27, false);
    bitArray.set(28, true);
    bitArray.set(29, false);
    bitArray.set(30, true);
    bitArray.set(31, false);
    bitArray.set(32, true);
    bitArray.set(33, false);
    bitArray.set(34, true);
    bitArray.set(35, false);
    bitArray.set(36, true);
    bitArray.set(37, false);
    bitArray.set(38, true);
    bitArray.set(39, false);
    bitArray.set(40, true);
   
}