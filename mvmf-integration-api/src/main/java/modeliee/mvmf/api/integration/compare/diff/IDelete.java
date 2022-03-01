/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare.diff;

/**
 * Delete diff.
 *
 * @param <T> the object type
 */
public interface IDelete<T> extends IDiff<T> {

  /**
   * Returns the {@link T} that has been deleted.
   *
   * @return value
   */
  T getValue();
}
