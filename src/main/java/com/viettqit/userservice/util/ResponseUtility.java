package com.viettqit.userservice.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/***
 * @author Tran Quoc Viet
 * @version 1.0
 * @since 5/30/2022
 */
public class ResponseUtility {
    public static void tokenErrorResponse(HttpServletResponse response, Exception exception) throws IOException {
        response.setHeader("error", exception.getMessage());
        response.setStatus(FORBIDDEN.value());

        Map<String, String> error = new HashMap<>();
        error.put("error_message", exception.getMessage());
        response.setContentType(APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getOutputStream(), error);
    }
}
