/**
 * 
 */
package com.marf.evhunt.service.helper;

import java.security.InvalidParameterException;
import java.util.List;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesResult;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.marf.evhunt.model.Candidat;

/**
 * @author ahmeddammak
 *
 */
public class WatsonServiceHelper {

	private String id = "08fdf3c3-6dd2-4a9a-8415-27e051639955";
	private String pwd = "AVMwsS7NoJ1B";
	private String model = "10:65d57b90-6252-45ef-82c6-38df4347b074";

	private NaturalLanguageUnderstanding nlu = new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27, id, pwd);

	public Candidat parseCv(String cv) {
		EntitiesOptions entOpt = new EntitiesOptions.Builder().model(model).build();
		Features feat = new Features.Builder().entities(entOpt).build();
		AnalyzeOptions opt = new AnalyzeOptions.Builder().features(feat).language("fr").text(cv).build();
		AnalysisResults results = nlu.analyze(opt).execute();
		List<EntitiesResult> entitiesResultList = results.getEntities();
		return convert(entitiesResultList);
	}

	private Candidat convert(List<EntitiesResult> entitiesResultList) {
		Candidat candidat = new Candidat();
		for (EntitiesResult entitiesResult : entitiesResultList) {
			switch (entitiesResult.getType()) {
			case "PRENOM":
				candidat.setPrenom(entitiesResult.getText());
				break;
			case "NOM":
				candidat.setNom(entitiesResult.getText());
				break;
			case "MAIL":
				candidat.setMail(entitiesResult.getText());
				break;
			case "MOBILE":
				candidat.setMobile(entitiesResult.getText());
				break;
			case "TITRE":
				candidat.setTitre(entitiesResult.getText());
				break;
			case "EXPERIENCE":
				candidat.getExperiences().add(entitiesResult.getText());
				break;
			case "ETUDES":
				candidat.setEtudes(entitiesResult.getText());
				break;
			case "COMPETENCES":
				candidat.setCompetences(entitiesResult.getText());
				break;
			case "LANGUES":
				candidat.setLangues(entitiesResult.getText());
				break;
			default:
				throw new InvalidParameterException("bad value from nlu");
			}
		}
		return candidat;
	}
}
