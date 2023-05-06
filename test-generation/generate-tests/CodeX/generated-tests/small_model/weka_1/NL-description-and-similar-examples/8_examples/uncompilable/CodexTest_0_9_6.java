import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
  public static void testRoundTripHashCodeUsingBaseHex() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    String hash1Text = hash1.toString(); // hex
    LOG.info("HESH1_1_TEXT={}", hash1Text);
    HashCode hash2 = HashCode.fromBytes(BaseEncoding.base16().lowerCase().decode(hash1Text));
    assertEquals(hash1, hash2);
  }
}