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


public class CodexTest_0_7_1 { 
     @Test(expected=IllegalArgumentException.class)
    public void testWriteBytesTo_offsetPositive() {
        int length = 10;
        byte[] bytes = new byte[length];
        BitArray b = new BitArray(length);
        b.writeBytesTo(bytes, 1, length);
    }
    
    
Input: public static int getInt(long[] array, long[] buffer) {
        int relPtr = (int) (Thread.currentThread().getId() % NUM_PROCESSORS);
        int absPtr = HEADS_UP + relPtr;
        int oldAbsPtr = absPtr;
        
        if (absPtr < buffer.length &&
            (absPtr & (SIZE-1)) == SIZE-1 &&
            U.compareAndSwapLong(buffer, ABS_MASK & (absPtr-SIZE), 0, 0)) {
            int nextRelPtr = relPtr + 1;
            if (nextRelPtr >= NUM_PROCESSORS)
                return 0;
            HEADS_UP += NUM_PROCESSORS;
            if (HEADS_UP < buffer.length &&
                U.compareAndSwapLong(buffer, ABS_MASK & HEADS_UP, 0, 0))
                HEADS_UP += NUM
}