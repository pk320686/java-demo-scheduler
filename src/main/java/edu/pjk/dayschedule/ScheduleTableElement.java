/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pjk.dayschedule;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author pkacperski
 */
public class ScheduleTableElement {

  private Point location;
  private Dimension dimension;

  public ScheduleTableElement(Point point, Dimension dimension) {
    this.location = point;
    this.dimension = dimension;
  }

  public Point getLocation() {
    return location;
  }

  public void setLocation(Point location) {
    this.location = location;
  }

  public Dimension getDimension() {
    return dimension;
  }

  public void setDimension(Dimension dimension) {
    this.dimension = dimension;
  }
}
