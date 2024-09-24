package com.codelry.util.rest.exceptions;

/**
 * Retryable Error exception class.
 */
public class RetryableError extends HttpResponseException {
  /**
   * Exception class.
   *
   * @param message Error message.
   */
  public RetryableError(String message) {
    super();
  }
}
