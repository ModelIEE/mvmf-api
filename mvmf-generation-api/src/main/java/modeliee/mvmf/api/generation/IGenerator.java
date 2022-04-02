/**
 * Copyright (C) ModelIEE MvMF (https://github.com/ModelIEE). All rights reserved.
 */
package modeliee.mvmf.api.generation;

/**
 * Generator interface.
 *
 * @param <C> the input generator config
 * @param <K> the input base model
 * @param <T> the target model to generate
 */
public interface IGenerator<C, T, K> {

    /**
     * Generates the source object model into the target model
     *
     * @param generatorConfig the input generator config of type {@link T}
     * @param baseModel       the input base model of type {@link K}
     * @return the generated model of type {@link K}
     * @throws GenerationException if an error occurs
     */
    T generate(C generatorConfig, K baseModel) throws GenerationException;

}
