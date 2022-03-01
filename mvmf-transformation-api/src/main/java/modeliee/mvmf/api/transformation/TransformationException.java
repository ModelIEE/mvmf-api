/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.transformation;

/**
 * TransformationException.
 */
public class TransformationException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public TransformationException(String message) {
    super(message);
  }

  public TransformationException(String message, Throwable cause) {
    super(message, cause);
  }
}
