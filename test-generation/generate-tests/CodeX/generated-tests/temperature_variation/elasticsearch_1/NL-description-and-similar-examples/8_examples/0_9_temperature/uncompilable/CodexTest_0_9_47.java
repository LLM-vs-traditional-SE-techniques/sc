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


public class CodexTest_0_9_47 { 
  @Test
    public void testSortingWithinParent() {
        String parent = "five";
        String hasChild = "1";
        String simple = "2";
        String hasGrandchild = "3";
        String justChild = "4";
        IndexRequestBuilder[] indexRequestBuilders = new IndexRequestBuilder[5];
        indexRequestBuilders[0] = new IndexRequestBuilder(new IndexRequest(parent).type(parent).id(parent).source(parent, parent));
        indexRequestBuilders[1] = new IndexRequestBuilder(new IndexRequest(parent).type(parent).id(hasChild).source(parent, hasChild).parent(parent));
        indexRequestBuilders[2] = new IndexRequestBuilder(new IndexRequest(parent).type(parent).id(simple).source(parent, simple));
        indexRequestBuilders[3] = new IndexRequestBuilder(new IndexRequest(parent).type(parent).id(hasGrandchild).source(parent, hasGrandchild).parent(hasChild));
        indexRequestBuilders[4] = new IndexRequestBuilder(new IndexRequest(parent).type(parent).id(justChild).source(parent, justChild).parent(hasChild));
        MultiGetResponse mgetResponse = client().prepareMultiGet().add(new MultiGetRequest.Item(parent, hasGrandchild)).get();
        GetResponse getResponse = mgetResponse.getResponses()[0].getResponse();
        assertNull(getResponse);
        mgetResponse = client().prepareMultiGet().add(new MultiGetRequest.Item(parent, justChild)).get();
        getResponse = mgetResponse.getResponses()[0].getResponse();
        assertNull(getResponse);
        client().index(new IndexRequest(parent).type(parent).id(parent).source(parent, parent)).get();
        String queryMatchResult = client().prepareSearch().setQuery(parentQuery(parent)).get().getHits().getAt(0).getId();
        assertThat(queryMatchResult, equalTo(parent));
        client().admin().indices().prepareFlush().get();
        client().prepareIndex().setIndex(parent).setType(parent).
}