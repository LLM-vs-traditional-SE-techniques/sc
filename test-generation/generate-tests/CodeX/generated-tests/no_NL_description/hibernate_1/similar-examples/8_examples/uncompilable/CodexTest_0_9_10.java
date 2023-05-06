import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
     public void testBasic() {
        BasicTypeRegistry basicTypeRegistry = new BasicTypeRegistry();
        CompositeCustomType<EnumFixture> enumFixtureType = basicTypeRegistry.getRegisteredCompositeType( EnumFixture.class );
        CompositeAttributeConverter<EnumFixture> converter = buildAttributeConverter( basicTypeRegistry, EnumFixture.class );
        EnumFixture original = new EnumFixture( SomeEnum.ONE );
        assertNull( converter.toNonNullValue( null ) );
        assertNull( converter.toXMLData( null ) );
        assertEquals( original, converter.toNonNullValue( converter.toXMLData( original ) ) );
      }
}