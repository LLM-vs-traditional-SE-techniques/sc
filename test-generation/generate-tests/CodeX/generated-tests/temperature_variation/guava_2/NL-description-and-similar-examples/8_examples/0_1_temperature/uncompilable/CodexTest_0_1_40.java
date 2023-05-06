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


public class CodexTest_0_1_40 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int minLength = Math.min(maxLength, bits / 8);
    int length = minLength;
    int expectedLength = length;
    int expectedOffset = offset + length;
    int expectedBits = bits;
    int expectedBytes = bits / 8;
    int expectedBytesRemaining = expectedBytes - length;
    int expectedBitsRemaining = expectedBits - length * 8;
    int expectedBitsRemainingUnused = 8 - expectedBitsRemaining;
    int expectedBitsRemainingUnusedMask = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask = ~expectedBitsRemainingUnusedMask;
    int expectedBitsRemainingUnusedMask2 = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask2 = ~expectedBitsRemainingUnusedMask2;
    int expectedBitsRemainingUnusedMask3 = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask3 = ~expectedBitsRemainingUnusedMask3;
    int expectedBitsRemainingUnusedMask4 = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask4 = ~expectedBitsRemainingUnusedMask4;
    int expectedBitsRemainingUnusedMask5 = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask5 = ~expectedBitsRemainingUnusedMask5;
    int expectedBitsRemainingUnusedMask6 = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask6 = ~expectedBitsRemainingUnusedMask6;
    int expectedBitsRemainingUnusedMask7 = (1 << expectedBitsRemainingUnused) - 1;
    int expectedBitsRemainingMask7 = ~expectedBitsRemainingUnusedMask7;
    int expectedBitsRem
}