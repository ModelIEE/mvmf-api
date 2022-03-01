/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.merge;

/**
 * MergeException.
 */
public class MergeException extends RuntimeException {
  static final long serialVersionUID = 1L;

  public MergeException(String message) {
    super(message);
  }

  public MergeException(String message, Throwable cause) {
    super(message, cause);
  }
}
