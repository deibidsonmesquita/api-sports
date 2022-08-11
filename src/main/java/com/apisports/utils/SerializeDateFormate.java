package com.apisports.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SerializeDateFormate extends JsonSerializer<LocalDateTime> {
    @Override
    public void serialize(LocalDateTime data, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        var dataFormadata = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        jsonGenerator.writeString(dataFormadata);

    }
}
