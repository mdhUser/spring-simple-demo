package org.maxwell.ioc;

import org.maxwell.anno.Maxwell;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/8/4 11:03
 */
@ComponentScan(basePackages = "org.maxwell",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
        value = Maxwell.class)})
@Configurable
public class MaxwellScan {

}
