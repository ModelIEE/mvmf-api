/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare;

import modeliee.mvmf.api.integration.common.IEqualityFunctions;

/**
 * Compare.
 *
 * @param <T> the object type
 */
public interface IComparer<T> {
  /**
   * Compares the model specified in the {@link IComparisonScope <T>}.
   *
   * @param scope the {@link IComparisonScope <T>} information
   * @return the {@link IComparison} object
   */
  IComparison<T> compare(IComparisonScope<T> scope);

  /**
   * Creates a {@link IComparisonScope <T>} object.
   *
   * @param left              the new model of type {@link T}
   * @param right             the existing model of type {@link T}
   * @param equalityFunctions the equality functions
   */
  IComparisonScope<T> createComparisonScope(T left,
                                            T right,
                                            IEqualityFunctions<T> equalityFunctions);
}
