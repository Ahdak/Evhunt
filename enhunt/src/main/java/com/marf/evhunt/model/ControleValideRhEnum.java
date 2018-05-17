/**
 * 
 */
package com.marf.evhunt.model;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author ahmeddammak
 *
 */
public enum ControleValideRhEnum {

	VALIDE("VALIDE"), EN_COURS("EN_ATTENTE"), REFUSE("REFUSE");

	private String name;

	private ControleValideRhEnum(String status) {
		this.name = status;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public static ControleValideRhEnum getByName(String name) {
		List<ControleValideRhEnum> values = Lists.newArrayList(ControleValideRhEnum.values());
		return values.stream().filter(e -> e.name.equals(name)).findAny().orElse(EN_COURS);
	}

}
