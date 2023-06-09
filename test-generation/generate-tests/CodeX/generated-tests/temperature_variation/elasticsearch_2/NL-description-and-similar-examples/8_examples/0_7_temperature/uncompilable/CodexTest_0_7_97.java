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


public class CodexTest_0_7_97 { 
  @Test
    public void testSourceAsMap() throws Exception {
        IndexRequest request = new IndexRequest("index", "type", "id");
        long version = randomLong();
        long versionType = randomLong();
        String pipeline = randomAsciiOfLengthBetween(5, 10);
        String routing = randomAsciiOfLengthBetween(5, 10);
        String parent = randomAsciiOfLengthBetween(5, 10);
        String timestamp = randomAsciiOfLengthBetween(5, 10);
        long ttl = randomLong();
        float boost = randomFloat();
        request.version(version);
        request.versionType(VersionType.fromValue(versionType));
        request.routing(routing);
        request.parent(parent);
        request.timestamp(timestamp);
        request.ttl(ttl);
        request.setPipeline(pipeline);
        request.setRefreshPolicy(randomFrom(WriteRequest.RefreshPolicy.values()));
        request.setRefreshPolicy(WriteRequest.RefreshPolicy.NONE);
        request.opType(randomFrom(DocWriteRequest.OpType.values()));
        request.opType(DocWriteRequest.OpType.CREATE);
        request.setAutoGeneratedTimestamp(randomLong());
        Map<String, Object> map = new HashMap<>();
        map.put("index.version.type", versionType);
        map.put("index.version", version);
        map.put("index.routing", routing);
        map.put("index.parent", parent);
        map.put("index.timestamp", timestamp);
        map.put("index.ttl", ttl);
        map.put("index.pipeline", pipeline);
        map.put("index.refresh", false);
        map.put("index.op_type", "create");
        request.source(map, XContentType.JSON);
        assertEquals(version, request.version());
        assertEquals(versionType, request.versionType().getValue());
        assertEquals(routing, request.routing());
        assertEquals(parent,
}