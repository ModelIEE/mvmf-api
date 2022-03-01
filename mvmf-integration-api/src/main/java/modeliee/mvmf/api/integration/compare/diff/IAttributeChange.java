/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.compare.diff;

import java.beans.PropertyDescriptor;

/**
 * Attribute change diff.
 *
 * @param <T> the object type
 */
public interface IAttributeChange<T> extends IDiff<T> {

  /**
   * Returns the {@link PropertyDescriptor} that changed.
   *
   * @return Attribute
   */
  PropertyDescriptor getAttribute();

  /**
   * Returns the new value.
   *
   * @return the new value
   */
  Object getOldValue();

  /**
   * Returns the new value.
   *
   * @return the new value
   */
  Object getNewValue();
}
