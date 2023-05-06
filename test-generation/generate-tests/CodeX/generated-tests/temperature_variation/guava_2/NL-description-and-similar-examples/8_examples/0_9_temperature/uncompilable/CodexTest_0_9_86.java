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


public class CodexTest_0_9_86 { 
  @Test
        public void testReadableBytesProvidesNumberOfBytesToRead() {
            // This is the microbenchmark suggested at
            // http://openjdk.java.net/projects/code-tools/jmh/
            byte[] bytes = new byte[5 * Flower.BYTES];
            Random random = new Random(0x5ca1ab1e);
            random.nextBytes(bytes);
            Set<Flower> flowers = Sets.newLinkedHashSet();
            DataView data = new DataView(ByteBuffer.wrap(bytes));
            data.position(1024);
            while (data.remaining() >= Flower.BYTES) {
                Flower flower = Flower.parseFrom(data);
                assertEquals(Flower.BYTES, flower.getSerializedSize());
                assertFalse(flowers.contains(flower));
                flowers.add(flower);
                assertEquals(data.position(), flower.getOffset() + flower.getSerializedSize());
            }
            assertEquals(flowers.size(), 56);
        }
}