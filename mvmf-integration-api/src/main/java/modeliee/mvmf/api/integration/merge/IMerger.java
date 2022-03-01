/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.merge;

import modeliee.mvmf.api.integration.compare.IComparison;

/**
 * Merger.
 *
 * @param <T> the object type
 */
public interface IMerger<T> {

  /**
   * Merges all changes.
   *
   * @param comparison the {@link IComparison <T>} object
   */
  void applyLeftToRight(IComparison<T> comparison);
}

