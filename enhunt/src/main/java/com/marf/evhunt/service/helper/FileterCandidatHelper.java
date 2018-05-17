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
import com.marf.evhunt.model.Postes;

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

	private List<String> buildKeyWords(String keyword) {
		String temp = keyword.replaceAll("\\,", " ");
		temp = temp.replaceAll("\\.", " ");
		if (!temp.contains(" ")) {
			return Lists.newArrayList(temp);
		}
		List<String> result = Lists.newArrayList();
		for (String ss : temp.split(" ")) {
			if (!ss.isEmpty()) {
				result.add(ss);
			}
		}
		return result;
	}

	public List<Postes> filterPostes(List<Postes> postes, Candidat candidat) {
		List<String> keywords = buildKeyWords(candidat.getCompetences());
		System.out.println(keywords);
		Map<String, List<Postes>> posteByKeyword = buildPostes(postes, keywords);
		Set<Postes> tempSEt = Sets.newHashSet();
		posteByKeyword.values().forEach(c -> tempSEt.addAll(c));
		return new ArrayList<>(tempSEt);
	}

	private Map<String, List<Postes>> buildPostes(List<Postes> all, List<String> keywords) {
		Map<String, List<Postes>> result = Maps.newHashMap();
		keywords.stream().forEach(k -> result.put(k, getPosteByKeyword(all, k)));
		return result;
	}

	private List<Postes> getPosteByKeyword(List<Postes> all, String keyword) {
		return all.stream().filter(c -> c.getKeywords().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
	}
}
