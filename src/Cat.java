/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cat extends Pet{
    
    private String nombre;
    private String color;
    private String raza;

    public Cat(String nombre, String color, String raza, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    @Override
    String sound() {
        return "Miau";
    }
    
}
