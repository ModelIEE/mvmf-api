/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare;

/**
 * CompareException.
 */
public class CompareException extends RuntimeException {
  static final long serialVersionUID = 1L;

  public CompareException(String message) {
    super(message);
  }

  public CompareException(String message, Throwable cause) {
    super(message, cause);
  }
}
