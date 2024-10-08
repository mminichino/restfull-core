package com.codelry.util.rest.exceptions;

/**
 * Non-retryable exception class.
 */
public class NonRetryableError extends HttpResponseException {
  /**
   * Exception class.
   *
   * @param message Error message.
   */
  public NonRetryableError(String message) {
    super();
  }
}
