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


public class CodexTest_0_5_6 { 
  @Test
    public void testSourceParsing() throws Exception {
        IndexRequest indexRequest = new IndexRequest("index", "type", "id");
        // byte array
        byte[] data = "{ \"field1\" : \"value1\" }".getBytes(Charsets.UTF_8);
        indexRequest.source(data, XContentType.JSON);
        assertEquals("{\"field1\":\"value1\"}", indexRequest.source().toUtf8());
        // byte array, offset and length
        indexRequest.source(data, 2, data.length - 2, XContentType.JSON);
        assertEquals("{\"field1\":\"value1\"}", indexRequest.source().toUtf8());
        // channel
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(data);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bos.toByteArray());
        ReadableByteChannel channel = new ByteBufferReadableChannel(byteBuffer);
        indexRequest.source(channel, data.length, XContentType.JSON);
        assertEquals("{\"field1\":\"value1\"}", indexRequest.source().toUtf8());
        // channel, offset and length
        indexRequest.source(channel, 2, data.length - 2, XContentType.JSON);
        assertEquals("{\"field1\":\"value1\"}", indexRequest.source().toUtf8());
        // input stream
        bos = new ByteArrayOutputStream();
        bos.write(data);
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        indexRequest.source(is, data.length, XContentType.JSON);
        assertEquals("{\"field1\":\"value1\"}", indexRequest.source().toUtf8());
        // string
        indexRequest.source("{ \"field1\" : \"value1\" }", XContentType.JSON);
        assertEquals("{\"field1\":\"value1\"}", indexRequest.source().toUtf8());
        // map
        Map<String, Object> map = new HashMap<>();
        map.put
}