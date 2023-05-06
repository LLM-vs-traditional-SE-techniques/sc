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


public class CodexTest_0_9_33 { 
  @Test
    public void testValidContentType() {
        {
            IndexRequest indexRequest = new IndexRequest("index", "type");
            Map<String, Object> source = Collections.singletonMap("field", "value");
            indexRequest.source(source, XContentType.JSON);
            assertThat(indexRequest.getContentType(), is(XContentType.JSON));
            Map<String, Object> sourceAndContentType = indexRequest.getSourceAsMap();
            assertThat(sourceAndContentType.size(), equalTo(2));
            assertThat((String) sourceAndContentType.get("field"), equalTo("value"));
            assertThat((String) sourceAndContentType.get("content_type"), equalTo("application/json"));
        }
        {
            IndexRequest indexRequest = new IndexRequest("index", "type");
            Map<String, Object> source = Collections.singletonMap("field", "value");
            indexRequest.source(source, XContentType.SMILE);
            assertThat(indexRequest.getContentType(), is(XContentType.SMILE));
            Map<String, Object> sourceAndContentType = indexRequest.getSourceAsMap();
            assertThat(sourceAndContentType.size(), equalTo(2));
            assertThat((String) sourceAndContentType.get("field"), equalTo("value"));
            assertThat((String) sourceAndContentType.get("content_type"), equalTo("application/smile"));
        }
        {
            IndexRequest indexRequest = new IndexRequest("index", "type");
            Map<String, Object> source = Collections.singletonMap("field", "value");
            indexRequest.source(source, XContentType.YAML);
            assertThat(indexRequest.getContentType(), is(XContentType.YAML));
            Map<String, Object> sourceAndContentType = indexRequest.getSourceAsMap();
            assertThat(sourceAndContentType.size(), equalTo(2));
            assertThat((String) sourceAndContentType.get("field"), equalTo("value"));
            assertThat((String) sourceAndContentType.get("content_type"), equal
}