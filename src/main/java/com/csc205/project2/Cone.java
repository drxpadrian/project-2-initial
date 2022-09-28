package com.csc205.project2;



public class Cone extends Shape implements ThreeDimensionalShape {
    private double height;
    public double radius;

    public Cone() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double height, double radius) {
        super();
        this.height = height;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return Math.PI * getRadius() * (radius + Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2))));
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume= ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
