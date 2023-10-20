package org.thompson.james.process;

/**
 *
 * @author James Thompson
 */
public interface IProcess<T> {
    public String process(T input, String outputFormat);
}
