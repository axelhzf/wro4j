/*
 * Copyright (c) 2008 ISDC! Romania. All rights reserved.
 */
package ro.isdc.wro.processor.impl;

import java.util.ArrayList;
import java.util.List;

import ro.isdc.wro.processor.GroupsProcessor;
import ro.isdc.wro.processor.ResourcePostProcessor;
import ro.isdc.wro.processor.ResourcePreProcessor;

/**
 * AbstractGroupsProcessor.java.
 * 
 * @author alexandru.objelean / ISDC! Romania
 * @version $Revision: $
 * @date $Date: $
 * @created Created on Nov 26, 2008
 */
public abstract class AbstractGroupsProcessor implements GroupsProcessor {

  /**
   * a list of css pre processors.
   */
  private List<ResourcePreProcessor> cssPreProcessors = new ArrayList<ResourcePreProcessor>();

  /**
   * a list of js pre processors.
   */
  private List<ResourcePreProcessor> jsPreProcessors = new ArrayList<ResourcePreProcessor>();

  /**
   * a list of pre processors for all resources, will be applied on both (css &
   * js).
   */
  private List<ResourcePreProcessor> anyResourcePreProcessors = new ArrayList<ResourcePreProcessor>();

  /**
   * a list of css post processors.
   */
  private List<ResourcePostProcessor> cssPostProcessors = new ArrayList<ResourcePostProcessor>();

  /**
   * a list of js post processors.
   */
  private List<ResourcePostProcessor> jsPostProcessors = new ArrayList<ResourcePostProcessor>();

  /**
   * a list of post processors for all resources, will be applied on both (css &
   * js).
   */
  private List<ResourcePostProcessor> anyResourcePostProcessors = new ArrayList<ResourcePostProcessor>();

  /**
   * @param processors
   *          a list of css post processors.
   */
  public final void setCssPostProcessors(
      final List<ResourcePostProcessor> processors) {
    this.cssPostProcessors = processors;
  }

  /**
   * @param cssPreProcessors
   *          the cssPreProcessors to set
   */
  public final void setCssPreProcessors(
      final List<ResourcePreProcessor> cssPreProcessors) {
    this.cssPreProcessors = cssPreProcessors;
  }

  /**
   * @param jsPreProcessors
   *          the jsPreProcessors to set
   */
  public final void setJsPreProcessors(
      final List<ResourcePreProcessor> jsPreProcessors) {
    this.jsPreProcessors = jsPreProcessors;
  }

  /**
   * @param anyResourcePreProcessors
   *          the anyResourcePreProcessors to set
   */
  public final void setAnyResourcePreProcessors(
      final List<ResourcePreProcessor> anyResourcePreProcessors) {
    this.anyResourcePreProcessors = anyResourcePreProcessors;
  }

  /**
   * @param jsPostProcessors
   *          the jsPostProcessors to set
   */
  public final void setJsPostProcessors(
      final List<ResourcePostProcessor> jsPostProcessors) {
    this.jsPostProcessors = jsPostProcessors;
  }

  /**
   * @param anyResourcePostProcessors
   *          the anyResourcePostProcessors to set
   */
  public final void setAnyResourcePostProcessors(
      final List<ResourcePostProcessor> anyResourcePostProcessors) {
    this.anyResourcePostProcessors = anyResourcePostProcessors;
  }

  /**
   * @return the cssPreProcessors
   */
  protected final List<ResourcePreProcessor> getCssPreProcessors() {
    return cssPreProcessors;
  }

  /**
   * @return the jsPreProcessors
   */
  protected final List<ResourcePreProcessor> getJsPreProcessors() {
    return jsPreProcessors;
  }

  /**
   * @return the anyResourcePreProcessors
   */
  protected final List<ResourcePreProcessor> getAnyResourcePreProcessors() {
    return anyResourcePreProcessors;
  }

  /**
   * @return the cssPostProcessors
   */
  protected final List<ResourcePostProcessor> getCssPostProcessors() {
    return cssPostProcessors;
  }

  /**
   * @return the jsPostProcessors
   */
  protected final List<ResourcePostProcessor> getJsPostProcessors() {
    return jsPostProcessors;
  }

  /**
   * @return the anyResourcePostProcessors
   */
  protected final List<ResourcePostProcessor> getAnyResourcePostProcessors() {
    return anyResourcePostProcessors;
  }
}