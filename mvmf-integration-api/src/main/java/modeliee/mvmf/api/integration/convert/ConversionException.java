/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.convert;

public class ConversionException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public ConversionException(String message) {
    super(message);
  }

  public ConversionException(String message, Throwable cause) {
    super(message, cause);
  }
}
