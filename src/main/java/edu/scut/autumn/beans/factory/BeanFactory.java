package edu.scut.autumn.beans.factory;

import edu.scut.autumn.beans.BeansException;

/**
 * @author sqyi
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
