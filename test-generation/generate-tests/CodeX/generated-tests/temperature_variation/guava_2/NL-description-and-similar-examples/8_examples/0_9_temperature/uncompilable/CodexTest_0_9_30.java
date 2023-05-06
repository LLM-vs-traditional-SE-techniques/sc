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


public class CodexTest_0_9_30 { 
  @Test
     public void testEqualityWithNullsAndTruncation() {
        for (int i = 0; i < 200; i++) {
            UUID uuid = UUID.randomUUID();
            ByteBuf buffer = Unpooled.buffer(16);
            ByteBuf uuidBuffer = Unpooled.wrappedBuffer(ByteOrder.BIG_ENDIAN, uuid.toString().getBytes());
            uuidBuffer.readBytes(buffer, 16);
            ByteBuf slice1 = buffer.slice();
            ByteBuf slice2 = buffer.slice();
}