/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare.diff;

/**
 * Add diff.
 *
 * @param <T> the object type
 */
public interface IAdd<T> extends IDiff<T> {

  /**
   * Returns the {@link T} that has been added.
   *
   * @return value
   */
  T getValue();
}
