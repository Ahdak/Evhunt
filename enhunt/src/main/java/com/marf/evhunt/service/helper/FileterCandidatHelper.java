/**
 * 
 */
package com.marf.evhunt.service.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.marf.evhunt.model.Candidat;

/**
 * @author ahmeddammak
 *
 */
public class FileterCandidatHelper {

	private static FileterCandidatHelper instance;

	public static FileterCandidatHelper getInstance() {
		if (instance == null) {
			instance = new FileterCandidatHelper();
		}
		return instance;
	}

	public List<Candidat> filter(List<Candidat> all, String keyword) {
		List<String> keywords = buildKeyWords(keyword);
		Map<String, List<Candidat>> candByKeyword = buildCandiats(all, keywords);
		Set<Candidat> tempSEt = Sets.newHashSet();
		candByKeyword.values().forEach(c -> tempSEt.addAll(c));
		return new ArrayList<>(tempSEt);
	}

	private Map<String, List<Candidat>> buildCandiats(List<Candidat> all, List<String> keywords) {
		Map<String, List<Candidat>> result = Maps.newHashMap();
		keywords.stream().forEach(k -> result.put(k, getCandidatByKeyword(all, k)));
		return result;
	}

	private List<Candidat> getCandidatByKeyword(List<Candidat> all, String keyword) {
		return all.stream().filter(c -> c.getCompetences().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
	}

	private static List<String> buildKeyWords(String keyword) {
		String temp = keyword.replaceAll("\\,", " ");
		temp = temp.replaceAll("\\.", " ");
		if (!temp.contains(" ")) {
			return Lists.newArrayList(temp);
		}
		return Lists.newArrayList(temp.split(" "));
	}

	public static void main(String[] arg) {
		System.out.println(buildKeyWords("java,oracle"));
	}
}
