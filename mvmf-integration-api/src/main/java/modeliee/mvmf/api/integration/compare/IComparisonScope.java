/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare;

import modeliee.mvmf.api.integration.common.IEqualityFunctions;

import java.util.List;

/**
 * ComparisonScope.
 *
 * @param <T> the object type
 */
public interface IComparisonScope<T> {

  /**
   * The new model.
   *
   * @return the new model
   */
  T getLeft();

  /**
   * The existing model.
   *
   * @return the existing model
   */
  T getRight();

  /**
   * Returns the set of Equality-Functions that should be used to identify the different AML components.
   *
   * @return the EqualityFunctions
   */
  IEqualityFunctions<T> getEqualityFunctions();

  /**
   * Defines the parts from the CAEXFile that should be compared e.g. the InstanceHierarchy.
   *
   * @return the {@link List} of parts to compare
   */
  List<Class<?>> getModelPartsToCompare();
}

