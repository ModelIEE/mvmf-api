/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare;

import modeliee.mvmf.api.integration.compare.diff.IDiff;

import java.util.List;

/**
 * Comparison.
 *
 * @param <T> the object type
 */
public interface IComparison<T> {

  /**
   * The differences.
   *
   * @return the {@link List} of differences
   */
  List<IDiff<T>> getDifferences();

  /**
   * The Comparison scope.
   *
   * @return the {@link IComparisonScope <T>} object
   */
  IComparisonScope<T> getComparisonScope();
}
