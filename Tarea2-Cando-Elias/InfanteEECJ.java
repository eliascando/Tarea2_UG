/** @author (Elias Cando Jaime) 
 * @version (Tarea#2)*/
 
import java.time.LocalDate;
import java.time.Period;

public class InfanteEECJ{
    private String name;
    private double weight;
    private int height;
    private char sex;
    private int day, month, year;
    public InfanteEECJ(){
        name="";
        weight=0.0;
        height=0;
        sex=' ';
        day= 0;
        month=0;
        year=0;
    }
    public InfanteEECJ(String name, double weight, int height, char sex){
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.sex=sex;
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeighte(double weight){
        this.weight=weight;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public char getSex(){
        return sex;
    }
    public void setSex(char sex){
        this.sex=sex;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    
    double calcularEdad(int day, int month, int year) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getMonths();
    }
    String sobrePeso(double weight){
        String mensaje="";
        if(weight>6.0){
            mensaje="Sobre Peso!";
        }else if(weight>=3.0&&weight<=6.0){
            mensaje="Peso Normal.";
        }else if(weight<3.0){
            mensaje="Bajo Peso!";
        }
        return mensaje;
    }
}
