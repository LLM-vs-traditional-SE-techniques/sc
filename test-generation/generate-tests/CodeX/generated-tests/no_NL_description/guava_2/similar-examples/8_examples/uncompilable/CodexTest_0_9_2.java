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


public class CodexTest_0_9_2 { 
  @Test
        public void testSlice() {
            ReferenceCountedTestByteString test1 = new ReferenceCountedTestByteString("foo".getBytes(
                    US_ASCII));
            ReferenceCountedTestByteString test2 = test1.slice(1, 2);
            assertEquals("o", new String(test2.data, US_ASCII));
            assertEquals(1, test2.getRefCnt());
            assertEquals(2, test1.getRefCnt());
            
            test2.release();
            assertEquals(1, test1.getRefCnt());
            assertEquals(0, test2.getRefCnt());
        }
}