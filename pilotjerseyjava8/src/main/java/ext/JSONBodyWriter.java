package ext;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.json.JsonObject;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider()
@Produces(MediaType.APPLICATION_JSON)
public class JSONBodyWriter implements MessageBodyWriter<JsonObject> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public long getSize(JsonObject t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void writeTo(JsonObject t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		// TODO 自動生成されたメソッド・スタブ

	}

}
