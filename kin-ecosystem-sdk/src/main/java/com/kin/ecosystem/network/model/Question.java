/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kin.ecosystem.network.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Question
 */
public class Question {
@SerializedName("title")
  private String title = null;
  @SerializedName("answers")
  private List<String> answers = null;
  
  public Question title(String title) {
    this.title = title;
    return this;
  }

  
  /**
  * Get title
  * @return title
  **/
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public Question answers(List<String> answers) {
    this.answers = answers;
    return this;
  }

  public Question addAnswersItem(String answersItem) {
    
    if (this.answers == null) {
      this.answers = new ArrayList<String>();
    }
    
    this.answers.add(answersItem);
    return this;
  }
  
  /**
  * Get answers
  * @return answers
  **/
  public List<String> getAnswers() {
    return answers;
  }
  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.title, question.title) &&
        Objects.equals(this.answers, question.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, answers);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}


