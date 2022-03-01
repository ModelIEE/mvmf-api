/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.common;

import java.util.function.BiPredicate;

/**
 * EqualityFunctions.
 *
 * @param <T> the object type
 */
public interface IEqualityFunctions<T> {

  /**
   * Returns a correct isEqual BiPredicate for different types.
   *
   * @param type the type for which the equals predicate should be returned
   * @return the equals predicate
   */
  BiPredicate<T, T> getEqualsMethod(Class<?> type);
}
