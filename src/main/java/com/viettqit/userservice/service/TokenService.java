package com.viettqit.userservice.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * @author Tran Quoc Viet
 * @version 1.0
 * @since 5/30/2022
 */
public interface TokenService {
    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
