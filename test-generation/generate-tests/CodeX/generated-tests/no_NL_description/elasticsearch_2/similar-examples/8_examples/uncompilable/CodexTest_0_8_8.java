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


public class CodexTest_0_8_8 { 
  @Test
    public void testToAndFromMap() throws IOException {
        IndexRequest request = new IndexRequest("test", "type", "id");
        request.routing("routing");
        request.parent("parent");
        request.timestamp("1970-01-01T00:00:00");
        request.ttl(1);
        request.timeout(new TimeValue(42));
        request.setPipeline("pipeline");
        request.version(42);
        request.versionType(VersionType.EXTERNAL);
        request.setRefreshPolicy(WriteRequest.RefreshPolicy.WAIT_UNTIL);
        request.setRefreshPolicy("wait_for");
        Map<String, Object> source = new HashMap<>();
        source.put("_field", "value");
        request.source(source);
        assertToXContentEquivalent(request, XContentFactory.jsonBuilder().startObject().field("_field", "value").endObject(), XContentType.JSON);
        // now test index request with a nested doc source
        request = new IndexRequest("test", "type", "id");
        request.routing("routing");
        request.parent("parent");
        request.timestamp("1970-01-01T00:00:00");
        request.ttl(1);
        request.version(42);
        request.versionType(VersionType.EXTERNAL);
        Map<String, Object> innerObject = new HashMap<>();
        innerObject.put("field1", "1");
        source = new HashMap<>();
        source.put("_field", "value");
        source.put("inner", innerObject);
        request.source(source);
        assertToXContentEquivalent(request, XContentFactory.jsonBuilder().startObject().field("_field", "value").startObject("inner")
            .field("field1", "1").endObject().endObject(), XContentType.JSON);
        // now test index request with a nested doc source with binary values
        request = new IndexRequest("test", "type", "id");
        request.routing("routing");

}