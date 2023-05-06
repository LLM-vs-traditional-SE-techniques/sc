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


public class CodexTest_0_9_34 { 
  @Test
        public static void testHashFromBytes() {
            assertHashEquals(new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, hashForBytes(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            assertHashEquals(new byte[] {(byte) 0xff, (byte) 0xfe, (byte) 0xfd,
                    (byte) 0xfc, (byte) 0xfb, (byte) 0xfa, (byte) 0xf9, (byte) 0xf8,
                    (byte) 0xf7, (byte) 0xf6}, hashForBytes(255, 254, 253, 252, 251, 250, 249,
                    248, 247, 246));
        }
}