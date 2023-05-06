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


public class CodexTest_0_3_57 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[2];
    BitSet bits = new BitSet();
    bits.set(0);
    bits.set(64);
    bits.set(65);
    bits.set(128);
    bits.set(129);
    bits.set(192);
    bits.set(193);
    bits.set(255);
    bits.set(256);
    bits.set(257);
    bits.set(511);
    bits.set(512);
    bits.set(513);
    bits.set(1023);
    bits.set(1024);
    bits.set(1025);
    bits.set(2047);
    bits.set(2048);
    bits.set(2049);
    bits.set(4095);
    bits.set(4096);
    bits.set(4097);
    bits.set(8191);
    bits.set(8192);
    bits.set(8193);
    bits.set(16383);
    bits.set(16384);
    bits.set(16385);
    bits.set(32767);
    bits.set(32768);
    bits.set(32769);
    bits.set(65535);
    bits.set(65536);
    bits.set(65537);
    bits.set(131071);
    bits.set(131072);
    bits.set(131073);
    bits.set(262143);
    bits.set(262144);
    bits.set(262145);
    bits.set(524287);
    bits.set(524288);
    bits.set(524289);
    bits.set(1048575);
    bits.set(1048576);
    bits.set(1048577);
    bits.set(2097151);
    bits.set(2097152);
    bits.set(2097153);
    bits.set(4194303);
    bits.set(4194304);
    bits.set(4194305);
    bits.
}