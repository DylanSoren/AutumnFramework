package edu.scut.autumn.beans.factory.support;

import edu.scut.autumn.beans.factory.config.BeanDefinition;

/**
 * @author sqyi
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
