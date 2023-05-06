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


public class CodexTest_0_9_5 { 
  @Test
    public void testWriteByteArray() {
        byte[] dest = new byte[6];
        byte[] byteArray = {127, 123, -38, 28, 3};
        BitSet bs = new BitSet(byteArray.length * 8);
        bs.set(0, true);// set first bit
        bs.set(1, false);
        bs.set(2, true);
        bs.set(3, false);
        bs.set(4, true);
        bs.set(5, false);
        bs.set(6, true);
        bs.set(7, false);// end second bit
        bs.set(8, true);// set third bit
        bs.set(9, true);
        bs.set(10, false);
        bs.set(11, false);
        bs.set(12, false);
        bs.set(13, true);
        bs.set(14, false);
        bs.set(15, true);
        bs.set(16, false);// end fourth bit
        bs.set(17, true);// set fifth bit
        bs.set(18, true);
        bs.set(19, true);
        bs.set(20, true);
        bs.set(21, false);
        bs.set(22, true);
        bs.set(23, false);
        bs.set(24, true);// end sixth bit
        bs.set(25, false);// set fifth bit
        bs.set(26, true);
        bs.set(27, true);
        bs.set(28, false);
        bs.set(29, false);
        bs.set(30, false);
        bs.set(31, false);
        bs.set(32, true);// end sixth bit
        bs.set(33, false);// set fifth bit
        bs.set(34, true);
        bs.set(35, false);
        bs.set(36, true);
}