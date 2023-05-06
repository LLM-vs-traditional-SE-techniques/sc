import org.elasticsearch.action.index.*;
import org.elasticsearch.ElasticsearchGenerationException;
import org.elasticsearch.Version;
import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.action.CompositeIndicesRequest;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.RoutingMissingException;
import org.elasticsearch.action.support.replication.ReplicatedWriteRequest;
import org.elasticsearch.action.support.replication.ReplicationRequest;
import org.elasticsearch.client.Requests;
import org.elasticsearch.cluster.metadata.MappingMetaData;
import org.elasticsearch.cluster.metadata.MetaData;
import org.elasticsearch.common.Nullable;
import org.elasticsearch.common.UUIDs;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;
import org.elasticsearch.common.lucene.uid.Versions;
import org.elasticsearch.common.unit.ByteSizeValue;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentHelper;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.shard.ShardId;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import static org.elasticsearch.action.ValidateActions.addValidationError;
import java.util.*;

import org.elasticsearch.Version;
import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.support.ActiveShardCount;
import org.elasticsearch.action.support.replication.ReplicationResponse;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.io.stream.BytesStreamOutput;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.unit.ByteSizeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.seqno.SequenceNumbers;
import org.elasticsearch.index.shard.ShardId;
import org.elasticsearch.rest.RestStatus;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_2 { 
  @Test
    public void testParent() {
        String parent = "parent";
        String name = "name";
        String value = "value";
        String description = "description";
        String[] tags = new String[]{"tag1", "tag2"};
        String[] values = new String[]{"value1", "value2"};
        String[] attributes = new String[]{"attribute1", "attribute2"};
        String[] children = new String[]{"child1", "child2"};
        String[] properties = new String[]{"property1", "property2"};
        String[] references = new String[]{"reference1", "reference2"};
        String[] operations = new String[]{"operation1", "operation2"};
        String[] notifications = new String[]{"notification1", "notification2"};
        String[] interfaces = new String[]{"interface1", "interface2"};
        String[] factories = new String[]{"factory1", "factory2"};
        String[] service = new String[]{"service1", "service2"};
        String[] servicefactory = new String[]{"servicefactory1", "servicefactory2"};
        String[] component = new String[]{"component1", "component2"};
        String[] componentfactory = new String[]{"componentfactory1", "componentfactory2"};
        String[] implementation = new String[]{"implementation1", "implementation2"};
        String[] implementationfactory = new String[]{"implementationfactory1", "implementationfactory2"};
        String[] provides = new String[]{"provides1", "provides2"};
        String[] properties1 = new String[]{"properties1", "properties2"};
        String[] properties2 = new String[]{"properties3", "properties4"};
        String[] properties3 = new String[]{"properties5", "properties6"};
        String[] properties4 = new String[]{"properties7", "properties8"};
        String[] properties5 = new String[]{"properties9", "properties10"};
        String[] properties6 = new String[]{"properties11", "properties12"};
        String[] properties7 = new String[]{"properties13
}