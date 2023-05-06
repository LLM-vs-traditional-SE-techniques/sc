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


public class CodexTest_0_3_9 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
	"@relation test\n" +
	"@attribute A numeric\n" +
	"@attribute B numeric\n" +
	"@attribute C numeric\n" +
	"@attribute D numeric\n" +
	"@attribute E numeric\n" +
	"@attribute F numeric\n" +
	"@attribute G numeric\n" +
	"@attribute H numeric\n" +
	"@attribute I numeric\n" +
	"@attribute J numeric\n" +
	"@attribute K numeric\n" +
	"@attribute L numeric\n" +
	"@attribute M numeric\n" +
	"@attribute N numeric\n" +
	"@attribute O numeric\n" +
	"@attribute P numeric\n" +
	"@attribute Q numeric\n" +
	"@attribute R numeric\n" +
	"@attribute S numeric\n" +
	"@attribute T numeric\n" +
	"@attribute U numeric\n" +
	"@attribute V numeric\n" +
	"@attribute W numeric\n" +
	"@attribute X numeric\n" +
	"@attribute Y numeric\n" +
	"@attribute Z numeric\n" +
	"@attribute AA numeric\n" +
	"@attribute AB numeric\n" +
	"@attribute AC numeric\n" +
	"@attribute AD numeric\n" +
	"@attribute AE numeric\n" +
	"@attribute AF numeric\n" +
	"@attribute AG numeric\n" +
	"@attribute AH numeric\n" +
	"@attribute AI numeric\n" +
	"@attribute AJ numeric\n" +
	"@attribute AK numeric\n" +
	"@attribute AL numeric\n" +
	"@attribute AM numeric\n" +
	"@attribute AN numeric\n" +
	"@attribute AO numeric\n" +
	"@attribute AP numeric\n"
}