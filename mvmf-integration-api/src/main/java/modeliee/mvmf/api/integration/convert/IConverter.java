/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.integration.convert;

/**
 * Converter.
 *
 * @param <T> the model type
 * @param <C> the conversion config
 */
public interface IConverter<T, C> {

  /**
   * Convert the source object model into the target model
   *
   * @param sourceModel the input model
   * @param targetModel the output model
   * @throws ConversionException if an error occurs
   */
  void convert(T sourceModel, T targetModel) throws ConversionException;

  /**
   * Convert the source object model into the target model
   *
   * @param sourceModel the input model
   * @param targetModel the output model
   * @param config      the configuration for the conversion
   * @throws ConversionException if an error occurs
   */
  void convert(T sourceModel, T targetModel, C config) throws ConversionException;

  /**
   * @param config the configuration for the conversion
   */
  void setConfig(C config);

}
