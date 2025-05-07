package edu.scut.autumn.beans.factory.support;

import edu.scut.autumn.beans.BeansException;
import edu.scut.autumn.beans.factory.BeanFactory;
import edu.scut.autumn.beans.factory.config.BeanDefinition;

/**
 * @author sqyi
 * BeanDefinition 注册表接口
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
