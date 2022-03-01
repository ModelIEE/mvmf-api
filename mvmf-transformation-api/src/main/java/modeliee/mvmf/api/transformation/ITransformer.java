/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.transformation;

/**
 * Transformer interface.
 *
 * @param <T> the source model type
 * @param <K> the target model type
 */
public interface ITransformer<T, K, C> {

  /**
   * Transforms the source object model into the target model
   *
   * @param sourceModel the input object graph
   * @param targetModel the output stream
   * @throws TransformationException if an error occurs
   */
  void transform(T sourceModel, K targetModel) throws TransformationException;

  /**
   * @param config the configuration for the transformer
   */
  void setConfig(C config);
}
