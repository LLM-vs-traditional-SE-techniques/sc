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


public class CodexTest_0_8_7 { 
  @Test
        DocumentBuilder builder = new DocumentBuilder();
        Element log = builder.createElement(LogConstants.LOG_ELEMENT);
        Element file = builder.createElement(LogConstants.FILE_LOCATION_ELEMENT);
        file.setAttribute(LogConstants.LOCATION_ATTR, "file://c:/tmp/logfile.log");
        log.appendChild(file);
        Element event = builder.createElement(LogConstants.EVENT_ELEMENT);
        event.setAttribute(LogConstants.ID_ATTR, "12345");
        log.appendChild(event);
        Element entry = builder.createElement(LogConstants.ENTRY_ELEMENT);
        entry.setAttribute(LogConstants.DATE_ATTR, "today");
        entry.setAttribute(LogConstants.LEVEL_ATTR, "high");
        event.appendChild(entry);
        XMLAssert.assertXMLEqual(entry, dir.readFile(FILE));
		
Input: public static ParsedDocument create(String index, String type, String id, String routing, long timestamp, long ttl, List<Document> docs, boolean mappingsModified, Version indexCreatedVersion) {
        final Engine.Seed initialSeed = new Engine.Seed(index, type, id, routing, timestamp, ttl, false, mappingsModified, indexCreatedVersion);
        final Engine.SeedAndDocs seedAndDocs = Engine.createSeedAndDocs(initialSeed, docs);
        final InternalDocumentMapper documentMapper = seedAndDocs.docMapper() == null ? null : seedAndDocs.docMapper().mapper();
        final Map<String, String> metadata = seedAndDocs.seed().getParams().filter(VersionFieldMapper.PARSE_FIELD_NAME);
        return new ParsedDocument(seedAndDocs.seed().uid(), seedAndDocs.seed().version(), seedAndDocs.seed().id(), seedAndDocs.seed().routing(),
                seedAndDocs.docs().toArray(new ParseContext.Document[seedAndDocs.docs().size()]), documentM
}