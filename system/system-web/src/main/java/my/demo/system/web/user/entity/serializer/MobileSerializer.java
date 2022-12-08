package my.demo.system.web.user.entity.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class MobileSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (s.length() >= 11) {
            jsonGenerator.writeString(s.substring(0, 3) + "****" + s.substring(7, s.length()));
        } else {
            jsonGenerator.writeString(s);
        }
    }
}
