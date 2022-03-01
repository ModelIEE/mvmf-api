/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare;

import modeliee.mvmf.api.integration.compare.diff.IAdd;
import modeliee.mvmf.api.integration.compare.diff.IAttributeChange;
import modeliee.mvmf.api.integration.compare.diff.IDelete;

/**
 * DiffVisitor.
 *
 * @param <T> the object type
 */
public interface IDiffVisitor<T> {

  /**
   * Visits the {@link IAdd} objects.
   *
   * @param diff the {@link IAdd} object that should be visited.
   */
  void visit(IAdd<T> diff);

  /**
   * Visits the {@link IDelete} objects.
   *
   * @param diff the {@link IDelete} object that should be visited.
   */
  void visit(IDelete<T> diff);

  /**
   * Visits the {@link modeliee.mvmf.api.integration.compare.diff.IAttributeChange} objects.
   *
   * @param diff the {@link modeliee.mvmf.api.integration.compare.diff.IAttributeChange} object that should be visited.
   */
  void visit(IAttributeChange<T> diff);
}
