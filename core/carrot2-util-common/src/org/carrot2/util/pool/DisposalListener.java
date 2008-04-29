package org.carrot2.util.pool;

/**
 *
 */
public interface DisposalListener<T, P>
{
    /**
     * Called before the object is disposed of.
     */
    public void dispose(T object, P parameter);
}
