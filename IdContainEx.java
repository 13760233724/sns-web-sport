/*
 * Project Name: sns-web
 * File Name: IdContainEx.java
 * Package Name: com.hhly.config
 * Date: 2017年1月3日下午5:46:34
 * Creator: liu.li.yang
 * ------------------------------
 * 修改人: 
 * 修改时间: 
 * 修改内容: 
 */

package com.hhly.config;

import java.util.List;

import org.springframework.stereotype.Component;

import freemarker.template.SimpleNumber;
import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

/**
 * @description select标签包含判断函数
 * @author liu.li.yang
 * @date 2017年1月3日下午5:46:34
 * @see
 */
@Component("idContainEx")
public class IdContainEx implements TemplateMethodModelEx {

	@Override
	public Object exec(List list) throws TemplateModelException {
		if (null == list || list.size() < 2) {
			return false;
		}
		SimpleSequence sequence = (SimpleSequence) list.get(0);
		SimpleNumber simpleNumber = (SimpleNumber) list.get(1);
		if (null != sequence && null != simpleNumber) {
			List<String> items = sequence.toList();
			for (String item : items) {
				if (item.equals(simpleNumber.toString())) {
					return true;
				}
			}
		}
		return false;
	}
}
