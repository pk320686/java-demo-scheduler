/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjk.dayschedule;

import java.time.LocalTime;

/**
 *
 * @author pkacperski
 */
public class ScheduleItem {

  private LocalTime startTime;
  private LocalTime stopTime;
  private String caption;

  public ScheduleItem(LocalTime startTime, LocalTime stopTime, String caption) {
    this.startTime = startTime;
    this.stopTime = stopTime;
    this.caption = caption;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  public LocalTime getStopTime() {
    return stopTime;
  }

  public void setStopTime(LocalTime stopTime) {
    this.stopTime = stopTime;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }
}
