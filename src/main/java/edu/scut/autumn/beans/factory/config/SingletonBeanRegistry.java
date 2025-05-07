package edu.scut.autumn.beans.factory.config;

/**
 * @author sqyi
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
