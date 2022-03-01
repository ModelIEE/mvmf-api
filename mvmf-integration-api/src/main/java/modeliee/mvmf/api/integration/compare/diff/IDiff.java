/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare.diff;

import modeliee.mvmf.api.integration.compare.IDiffVisitor;

/**
 * A basic diff object.
 *
 * @param <T> the object type
 */
public interface IDiff<T> {

  /**
   * The Parent element of the new model.
   *
   * @return the left parent element
   */
  T getLeft();

  /**
   * The Parent element of the existing model.
   *
   * @return the right parent element
   */
  T getRight();

  /**
   * The {@link DiffKind} of the Diff object.
   *
   * @return the diff kind
   */
  DiffKind getKind();

  /**
   * A method to make {@link IDiff <T>} objects visitable.
   *
   * @param visitor the visitor object
   */
  void accept(IDiffVisitor<T> visitor);
}
