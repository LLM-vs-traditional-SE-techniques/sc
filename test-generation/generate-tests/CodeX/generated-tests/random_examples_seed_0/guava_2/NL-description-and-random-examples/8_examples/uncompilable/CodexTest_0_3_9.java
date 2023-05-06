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


public class CodexTest_0_3_9 { 
  @Test
    public static void testWriteBytesTo() {
        byte[] bytes = new byte[2];
        bytes[0] = 1;
        bytes[1] = 2;
        BitArray bitArray = new BitArray(bytes);
        byte[] dest = new byte[2];
        int maxLength = bitArray.writeBytesTo(dest, 0, 2);
        System.out.println("maxLength = " + maxLength);
    }
}