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


public class CodexTest_0_8_6 { 
  @Test
    public void testWriteBytesToImpl()
    {
        byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7};
        
        byte[] copy = new byte[bytes.length];
        
        BitArray bits1 = new BitArray(bytes.length * 8);
        for(int i = 0; i < bytes.length; i++)
        {
            bits1.setByte(i, bytes[i]);
        }
        bits1.writeBytesToImpl(copy, 0, copy.length);
        
        assertArrayEquals(bytes, copy);
        
        // Test partial copy
        BitArray bits2 = new BitArray(bytes.length * 8);
        for(int i = 0; i < bytes.length; i++)
        {
            bits2.setByte(i, bytes[i]);
        }      
        bits2.writeBytesToImpl(copy, 0, copy.length / 2);
        
        assertArrayEquals(Arrays.copyOf(bytes, bytes.length / 2), copy);
        
        // Test out of bounds
        BitArray bits3 = new BitArray(bytes.length * 8);
        for(int i = 0; i < bytes.length; i++)
        {
            bits3.setByte(i, bytes[i]);
        }      
        bits3.writeBytesToImpl(copy, 0, copy.length + 1);
        assertArrayEquals(bytes, copy);
        
        // Test out of bounds
        BitArray bits4 = new BitArray(bytes.length * 8);
        for(int i = 0; i < bytes.length; i++)
        {
            bits4.setByte(i, bytes[i]);
        }      
        bits4.writeBytesToImpl(copy, 1, copy.length);
        assertArrayEquals(bytes, copy);
        
        // Test out of bounds
        BitArray bits5 = new BitArray(bytes.length * 8);
        for(int i = 0; i < bytes.length; i++)
        {
            bits5.setByte(i, bytes[i]);
        }      
}