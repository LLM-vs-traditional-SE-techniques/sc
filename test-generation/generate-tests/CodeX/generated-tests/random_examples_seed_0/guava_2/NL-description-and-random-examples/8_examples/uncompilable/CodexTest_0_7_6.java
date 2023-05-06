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


public class CodexTest_0_7_6 { 
  @Test
        public static void testWriteBytesTo() {
            // given
            BitArray bitArray = new BitArray(new boolean[]{false, false, false, true, true, false, true});
            // when
            byte[] bytes = bitArray.toByteArray();//bitArray.writeBytesTo(new byte[(bitArray.bits() >> 3) + 1], 0, (bitArray.bits() >> 3) + 1);
            // then
            assertThat(bytes, is(new byte[]{8, 0}));
        }
}