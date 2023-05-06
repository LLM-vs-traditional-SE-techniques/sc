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


public class CodexTest_0_6_5 { 
  @Test
    public void testSerialize() throws IOException {
        testSerialize(new IndexRequest("foo", "bar", "1"), new IndexRequest("foo", "bar", "1"));
        testSerialize(new IndexRequest("foo", "bar", "1").routing("routing"), new IndexRequest("foo", "bar", "1").routing("routing"));
        testSerialize(new IndexRequest("foo", "bar", "1").parent("parent"), new IndexRequest("foo", "bar", "1").parent("parent"));
        testSerialize(new IndexRequest("foo", "bar", "1").timestamp("1"), new IndexRequest("foo", "bar", "1").timestamp("1"));
        testSerialize(new IndexRequest("foo", "bar", "1").ttl(10), new IndexRequest("foo", "bar", "1").ttl(10));
        testSerialize(new IndexRequest("foo", "bar", "1").version(10), new IndexRequest("foo", "bar", "1").version(10));
        testSerialize(new IndexRequest("foo", "bar", "1").versionType(VersionType.EXTERNAL), new IndexRequest("foo", "bar", "1").versionType(VersionType.EXTERNAL));
        testSerialize(new IndexRequest("foo", "bar", "1").opType(DocWriteRequest.OpType.CREATE), new IndexRequest("foo", "bar", "1").opType(DocWriteRequest.OpType.CREATE));
        testSerialize(new IndexRequest("foo", "bar", "1").setPipeline("pipeline"), new IndexRequest("foo", "bar", "1").setPipeline("pipeline"));
        testSerialize(new IndexRequest("foo", "bar", "1").source("{ \"foo\" : \"bar\" }", XContentType.JSON), new IndexRequest("foo", "bar", "1").source("{ \"foo\" : \"bar\" }", XContentType.JSON));
    }

}