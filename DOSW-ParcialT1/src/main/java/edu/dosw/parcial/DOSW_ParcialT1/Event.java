package edu.dosw.parcial.DOSW_ParcialT1;

public class Evento {
    private titulo;
    private duracion;
    private fecha;
    private cupoMaximo;
    private nombreConferencista;

    public Evento(titulo, duracion, fecha, cupoM, conferencista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fecha = fecha;
        this.cupoMaximo = cupoM;
        this.nombreConferencista = conferencista;
    }

    public void cambios() {

    }
}