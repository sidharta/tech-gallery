package com.ciandt.techgallery.service.model;

/**
 * Response with all technology entities.
 * 
 * @author Thulio Ribeiro
 *
 */
public class TechnologyFilter implements Response {

  /** string for search in title */
  private String titleContains;
  
  /** string for search in shortDescription */
  private String shortDescriptionContains;
  
  /** string for search in recommendation */
  private String recommendationIs;

  public String getTitleContains() {
    return titleContains;
  }

  public String getRecommendationIs() {
    return recommendationIs;
  }

  public void setRecommendationIs(String recommendationIs) {
    this.recommendationIs = recommendationIs;
  }

  public void setTitleContains(String titleContains) {
    this.titleContains = titleContains;
  }

  public String getShortDescriptionContains() {
    return shortDescriptionContains;
  }

  public void setShortDescriptionContains(String shortDescriptionContains) {
    this.shortDescriptionContains = shortDescriptionContains;
  }

  public TechnologyFilter() {
  }
  
  public TechnologyFilter(String titleContains, String shortDescriptionContains, String recommendationIs) {
    this.titleContains = titleContains;
    this.shortDescriptionContains = shortDescriptionContains;
    this.recommendationIs = recommendationIs;
  }
  
}