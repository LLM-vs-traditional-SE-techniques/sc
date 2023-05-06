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


public class CodexTest_0_5_3 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(22);
      Instances inst = new Instances(new java.io.StringReader(
							      "Dummy,@ATTRIBUTE a numeric\n"
							      + "Dummy,@ATTRIBUTE b numeric\n"
							      + "Dummy,@ATTRIBUTE c numeric\n"
							      + "Dummy,@ATTRIBUTE d numeric\n"
							      + "Dummy,@ATTRIBUTE e numeric\n"
							      + "Dummy,@ATTRIBUTE f numeric\n"
							      + "Dummy,@ATTRIBUTE g numeric\n"
							      + "Dummy,@ATTRIBUTE h numeric\n"
							      + "Dummy,@ATTRIBUTE i numeric\n"
							      + "Dummy,@ATTRIBUTE j numeric\n"
							      + "Dummy,@ATTRIBUTE k numeric\n"
							      + "Dummy,@ATTRIBUTE l numeric\n"
							      + "Dummy,@ATTRIBUTE m numeric\n"
							      + "Dummy,@ATTRIBUTE n numeric\n"
							      + "Dummy,@ATTRIBUTE o numeric\n"
							      + "Dummy,@ATTRIBUTE p numeric\n"
							      + "Dummy,@ATTRIBUTE q numeric\n"
							      + "Dummy,@ATTRIBUTE r numeric\n"
							      + "Dummy,@ATTRIBUTE s numeric\n"
}