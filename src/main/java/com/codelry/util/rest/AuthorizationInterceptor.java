package com.codelry.util.rest;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Interceptor for adding the authorization header to requests.
 */
public class AuthorizationInterceptor implements Interceptor {

  private final String credential;

  public AuthorizationInterceptor(String credential) {
    this.credential = credential;
  }

  @NotNull
  @Override
  public Response intercept(Chain chain) throws IOException {
    Request originalRequest = chain.request();
    Request newRequest = originalRequest.newBuilder()
        .header("Authorization", credential)
        .build();
    return chain.proceed(newRequest);
  }
}
