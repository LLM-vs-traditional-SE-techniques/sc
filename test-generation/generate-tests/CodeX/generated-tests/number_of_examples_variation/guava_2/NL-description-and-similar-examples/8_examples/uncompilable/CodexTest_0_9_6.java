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
    public void test_writeBytesTo() {
        byte[] byteArray = new byte[256];
        byteArray[10] = 43;
        byteArray[198] = -81;
        byteArray[255] = -2;
        ByteArrayHashCode hashCode = new ByteArrayHashCode(byteArray);
        byte[] dest = new byte[512];
        int offset = 1000;
        int maxLength = 20;
        int numOfBytesWritten = hashCode.writeBytesTo(dest, offset, maxLength);
        assertEquals(20, numOfBytesWritten);
        int i = 0;
        while (i < numOfBytesWritten) {
            assertEquals((byte) byteArray[i], dest[offset + i]);
            i++;
        }
        int numOfBytesWritten2 = hashCode.writeBytesTo(dest, offset, maxLength);
        assertEquals(20, numOfBytesWritten2);
    }
}