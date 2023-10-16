package com.manav.shape;

public class Sphere extends Shape{
    Sphere(int dim1, int dim2){
        super(dim1, dim2);
    }

    public double area(){
        return 4 * Math.PI * this.dim1 * this.dim1;
    }

    public double volume(){
        return (double) 4 / 3 * Math.PI * this.dim1 * this.dim1 * this.dim1;
    }
}