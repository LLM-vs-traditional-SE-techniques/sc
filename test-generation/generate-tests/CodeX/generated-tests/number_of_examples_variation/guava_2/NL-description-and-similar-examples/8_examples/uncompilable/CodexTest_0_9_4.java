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


public class CodexTest_0_9_4 { 
  @Test
  public void testWriteBytes() {
    byte[] bytes = new byte[10];
    assertEquals(10, bits.writeBytesTo(bytes, 0, 10));
    byte[] expecteds = new byte[] {
        (byte)   3, (byte)  44, (byte) 211, (byte)  61, (byte) 114, (byte) 201,
        (byte) 117, (byte)  92, (byte) 160, (byte) 116,
    };
    assertEquals(expecteds, bytes);    
    
    assertEquals(9, bits.writeBytesTo(bytes, 0, 9));
    expecteds = new byte[] {
        (byte)   3, (byte)  44, (byte) 211, (byte)  61, (byte) 114, (byte) 201,
        (byte) 117, (byte)  92, (byte) 160,
    };
    assertEquals(expecteds, Arrays.copyOf(bytes, 9));
    
    bytes = new byte[11];
    assertEquals(9, bits.writeBytesTo(bytes, 1, 10));
    expecteds = new byte[] {
        0, (byte)   3, (byte)  44, (byte) 211, (byte)  61, (byte) 114, (byte) 201,
        (byte) 117, (byte)  92, (byte) 160, 0,
    };
    assertEquals(expecteds, bytes);
    
    bytes = new byte[8];
    assertEquals(8, bits.writeBytesTo(bytes, 0, 8));
    expecteds = new byte[] {
        (byte)   3, (byte)  44, (byte) 211, (byte)  61, (byte) 114, (byte) 201,
        (byte) 117, (byte)  92,
    };
    assertEquals(expecteds, bytes);
    
    bytes = new byte[9];
    assertEquals(8, bits.writeBytesTo(bytes, 1, 8));
    expecteds = new byte[] {
        0, (byte)   3, (byte) 
}