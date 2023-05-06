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
          public void testCreateIndexWithDateDetection() throws IOException {
        XContentBuilder builder = jsonBuilder().startObject()
                .field("index.number_of_shards", 5)
                .field("index.number_of_replicas", 1)
                .startObject("index.analysis")
                    .startObject("analyzer")
                        .startObject("rebuilt_english")
                            .field("tokenizer", "standard")
                            .array("filter", "lowercase", "my_english")
                        .endObject()
                    .endObject()
                    .startObject("filter")
                        .startObject("my_english")
                            .field("type", "english_possessive_stemmer")
                            .field("stopwords", "_english_")
                        .endObject()
                    .endObject()
                .endObject()
                .endObject();
        XContentParser parser = XContentFactory.xContent(builder.bytes()).createParser(builder.bytes());
        parser.nextToken();
        Settings settings = Settings.readSettingsFromStream(parser);
        assertEquals(5, settings.getAsInt("index.number_of_shards", -1).intValue());
        assertEquals(1, settings.getAsInt("index.number_of_replicas", -1).intValue());
        assertThat(settings.get("index.analysis.analyzer.rebuilt_english.tokenizer"), equalTo("standard"));
        assertThat(settings.getAsArray("index.analysis.analyzer.rebuilt_english.filter"), arrayContaining("lowercase", "my_english"));
        assertThat(settings.get("index.analysis.filter.my_english.type"), equalTo("english_possessive_stemmer"));
        assertThat(settings.get("index.analysis.filter.my_english.stopwords"), equalTo("_english_"));
    }
}