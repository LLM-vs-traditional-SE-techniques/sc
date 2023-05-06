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


public class CodexTest_0_7_18 { 
  @Test
    public void testRequestToString() {
        IndexRequest indexRequest = new IndexRequest();
        indexRequest.index("index");
        indexRequest.type("type");
        indexRequest.id("1");
        indexRequest.source("field", "value", "field2", "value2");
        indexRequest.routing("routing");
        indexRequest.parent("parent");
        indexRequest.timeout(TimeValue.timeValueSeconds(1));
        indexRequest.setRefreshPolicy(WriteRequest.RefreshPolicy.WAIT_UNTIL);
        indexRequest.version(2);
        indexRequest.versionType(VersionType.EXTERNAL);
        indexRequest.opType(DocWriteRequest.OpType.CREATE);
        indexRequest.setPipeline("pipeline");
        indexRequest.setIfSeqNo(1L);
        indexRequest.setIfPrimaryTerm(1L);
        String actual = indexRequest.toString();
        StringBuilder expected = new StringBuilder("index {[index][type][1], source[{\"field\":\"value\",\"field2\":\"value2\"}], ");
        expected.append("routing[routing], parent[parent], timeout[1s], version[2], version_type[EXTERNAL], ");
        expected.append("op_type[CREATE], if_seq_no[1], if_primary_term[1], set_pipeline[pipeline], auto_generated_timestamp[-1], ");
        expected.append("refresh[wait_until]}");
        assertEquals(expected.toString(), actual);
    }

}