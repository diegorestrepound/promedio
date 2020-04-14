package com.example.promedio.clases;

public  class Promedio extends Notas{
    public double promedioNotas(){
        return( (this.getNota1()+this.getNota2()+this.getNota3()+this.getNota4()) / 4 );
    }
}
