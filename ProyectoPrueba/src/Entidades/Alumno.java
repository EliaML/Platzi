package Entidades;
public class Alumno {
    private String name;
    private int edad;
    private String curp;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }
    @Override
    public String toString() {
        return "alumno [name=" + name + ", edad=" + edad + ", curp=" + curp + "]";
    }
    
    
}
