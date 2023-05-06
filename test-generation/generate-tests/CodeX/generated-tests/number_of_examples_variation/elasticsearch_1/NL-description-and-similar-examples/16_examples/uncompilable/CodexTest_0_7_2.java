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


public class CodexTest_0_7_2 { 
  @Test
    public void testParent() {
        assertEquals(LUCENE_33, Version.LUCENE_33.parent());
        assertEquals(LUCENE_34, Version.LUCENE_34.parent());
        assertEquals(LUCENE_35, Version.LUCENE_35.parent());
        assertEquals(LUCENE_36, Version.LUCENE_36.parent());
        assertEquals(LUCENE_40, Version.LUCENE_40.parent());
        assertEquals(LUCENE_41, Version.LUCENE_41.parent());
        assertEquals(LUCENE_42, Version.LUCENE_42.parent());
        assertEquals(LUCENE_43, Version.LUCENE_43.parent());
        assertEquals(LUCENE_44, Version.LUCENE_44.parent());
        assertEquals(LUCENE_45, Version.LUCENE_45.parent());
        assertEquals(LUCENE_46, Version.LUCENE_46.parent());
        assertEquals(LUCENE_47, Version.LUCENE_47.parent());
        assertEquals(LUCENE_48, Version.LUCENE_48.parent());
        assertEquals(LUCENE_49, Version.LUCENE_49.parent());
        assertEquals(LUCENE_410, Version.LUCENE_410.parent());
        assertEquals(LUCENE_411, Version.LUCENE_411.parent());
        assertEquals(LUCENE_412, Version.LUCENE_412.parent());
        assertEquals(LUCENE_413, Version.LUCENE_413.parent());
        assertEquals(LUCENE_414, Version.LUCENE_414.parent());
        assertEquals(LUCENE_415, Version.LUCENE_415.parent());
        assertEquals(LUCENE_416, Version.LUCENE_416.parent());
        assertEquals(LUCENE_417, Version.LUCENE_417.parent());
        assertEquals(LUCENE
}