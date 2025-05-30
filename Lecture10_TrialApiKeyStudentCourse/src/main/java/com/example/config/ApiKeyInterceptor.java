package com.example.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class ApiKeyInterceptor implements HandlerInterceptor {

    private static String API_KEY_HEADER = "X-API-KEY";

    private ApiKeyProperties apiKeyProperties;

    public ApiKeyInterceptor(ApiKeyProperties apiKeyProperties) {
        this.apiKeyProperties = apiKeyProperties;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
               String method = request.getMethod();
               String path = request.getRequestURI();
               String apiKey =  request.getHeader(API_KEY_HEADER);

            if (apiKey == null || !apiKey.equals(apiKeyProperties.getAPI_KEY())){
                System.out.println("Unsuccessful authorization for method: " + method + ", path: " + path);
                response.setStatus(HttpStatus.UNAUTHORIZED.value());
                response.getWriter().write("Missing or invalid API key");
                return false;
            }
        System.out.println("Successful authorization for method: " + method + ", path: " + path);
        return true;
    }
}
